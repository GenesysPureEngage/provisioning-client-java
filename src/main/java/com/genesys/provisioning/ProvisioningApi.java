package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiResponse;

import com.genesys.internal.common.ApiException;

import com.genesys.provisioning.models.*;
import com.genesys.provisioning.events.*;

import com.genesys.internal.provisioning.model.*;
import com.genesys.internal.provisioning.api.SessionApi;

import java.math.BigDecimal;

import java.io.File;

import java.net.CookieManager;
import java.net.CookiePolicy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProvisioningApi {
	
	private final Logger logger = LoggerFactory.getLogger(ProvisioningApi.class);
	
	final static String SESSION_COOKIE = "PROVISIONING_SESSIONID";
	
	private final String apiKey;
	private final String provisioningUrl;
	
	private final ApiClient client;
	
	private SessionApi sessionApi; 
	private String sessionId;
	/**
	 * The users object contains API requests in the "users" category.
	 */
	public final UsersApi users;
	/**
	 * The exports object contains API requests in the "export" category.
	 */
	public ExportApi exports;
	/**
	 * The imports object contains API requests in the "import" category.
	 */
	public final ImportApi imports;
	/**
	 * The objects object contains API requests in the "objects" category.
	 */
	public final ObjectsApi objects;
	/**
	 * The options object contains API requests in the "options" category.
	 */
	public final OptionsApi options;
	/**
	 * The operations object contains API requests in the "operations" category.
	 */
	public final OperationsApi operations;

	private NotificationsApi notifications;
	
	private final Map<String, AsyncCallback> asyncCallbacks = new HashMap();
	private boolean initialized = false;
	
	/**
	 * Create a ProvisioningApi object with your given provisioning URL and API key.
	 * @param provisioningUrl the provisioning URL.
	 * @param apiKey your API key.
	 */
	public ProvisioningApi(String provisioningUrl, String apiKey) {
		this.apiKey = apiKey;
		this.provisioningUrl = provisioningUrl;
		
		client = new ApiClient();
		
		users = new UsersApi(client);
		
		imports = new ImportApi(client);
		objects = new ObjectsApi(client);
		options = new OptionsApi(client);
		operations = new OperationsApi(client, asyncCallbacks);
	}
	
	/**
	 * Initialize the API with an token retrieved from the auth service.
	 * @param authToken the token.
	 * @throws ProvisioningApiException if the call is unsuccessful.
	 */
	public void initializeWithToken(String authToken) throws ProvisioningApiException {
		initialize(authToken, null, null);
	}
	
	/**
	 * Initialize the API with an code from the auth service.
	 * @param authCode the code.
	 * @param redirectUri the redirect uri used in the original code request.
	 * @throws ProvisioningApiException if the call is unsuccessful.
	 */
	public void initializeWithCode(String authCode, String redirectUri) throws ProvisioningApiException {
		initialize(null, authCode, redirectUri);
	}
	
	private static String extractSessionCookie(ApiResponse<LoginSuccessResponse> response) throws ProvisioningApiException {
        
        String provisioningSessionCookie = null;

        // Required to get case insensitive headers
        Map<String, List<String>> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        headers.putAll(response.getHeaders());

        List<String> cookies = headers.get("set-cookie");
        for (String cookie : cookies) {
            if(cookie.startsWith(SESSION_COOKIE)){
                provisioningSessionCookie = cookie;
                break;
            }
        }

        if(provisioningSessionCookie == null) {
            throw new ProvisioningApiException("Failed to extract provisioning session cookie.");
        }

        String value = provisioningSessionCookie;
        String sessionId = value.split(";")[0].split("=")[1];
        
        
        return sessionId;
    }
	
	private void initialize(String authToken, String authCode, String redirectUri) throws ProvisioningApiException {
		try {
			
			client.setBasePath(provisioningUrl);
		
			CookieStoreImpl cookieStore = new CookieStoreImpl();
			client.getHttpClient().setCookieHandler(new CookieManager(cookieStore, CookiePolicy.ACCEPT_ALL));
		
			client.addDefaultHeader("x-api-key", apiKey);
			
			String authorization = authToken != null ? "Bearer " + authToken : null;
			
			client.addDefaultHeader("Authorization", authorization);
		
			sessionApi = new SessionApi();
			sessionApi.setApiClient(client);
			
			final ApiResponse<LoginSuccessResponse> response = 
				sessionApi.initializeProvisioningWithHttpInfo(new InitProvData().code(authCode).redirectUri(redirectUri), authorization);
			sessionId = extractSessionCookie(response);
			client.addDefaultHeader("Cookie", String.format("%s=%s", SESSION_COOKIE, sessionId));
			
			Map<String, NotificationsApi.NotificationListener> listeners = new HashMap();
			listeners.put("/*", (String ch, Map<String, Object> message) -> {
				
				String channel = (String) message.get("channel");
				logger.debug("Message on channel: {}", channel);
				Map<String, Object> data = (Map<String, Object>) message.get("data");
				logger.debug("With data: {}", data);
				
				if(channel.equals("operations")) {
					String aioId = (String) data.get("id");
					Map<String, Object> responseData = (Map<String, Object>) data.get("data");
					
					if(asyncCallbacks.containsKey(aioId)) {
						asyncCallbacks.get(aioId).response(responseData);
						asyncCallbacks.remove(aioId);
					} else {
						logger.error("Extra Async Notification, ID: {}", aioId);
					}
					String path = (String) data.get("path");
					
					logger.info("Async Response Id: {} Path: {}", aioId, path);
					logger.debug("Async Response Data: {}", responseData);
				} else {
					logger.debug("Message Data: {}", data);
				}		
				
			});
			
			notifications = new NotificationsApi(listeners);
			notifications.setCookieStore(cookieStore);
			notifications.initialize(provisioningUrl + "/notifications", apiKey);
			
			exports = new ExportApi(client, apiKey, sessionId);
			
			initialized = true;
					
		} catch (ApiException e) {
			
			throw new ProvisioningApiException("Error initializing", e);
		}
		
	}
	/**
	* Logout and disconnect from cometD.
	* When your code is done using the API call this to log out of Provisioning and disconnect cometD.
	* @throws ProvisioningApiException if the call is unsuccessful.
	*/
	public void done() throws ProvisioningApiException {
		if(initialized) {
			try {
				sessionApi.logout();
			} catch(ApiException e) {
				throw new ProvisioningApiException("Error logging out", e);
			}
			notifications.disconnect();
			initialized = false;
		}
	}
	
}