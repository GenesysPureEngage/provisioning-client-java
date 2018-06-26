package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiResponse;

import com.genesys.internal.common.ApiException;

import com.genesys.provisioning.models.*;

import com.genesys.internal.provisioning.model.*;
import com.genesys.internal.provisioning.api.SessionApi;
import com.genesys.internal.provisioning.api.UsersApi;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

import java.util.*;

public class ProvisioningApi {

	final static String SESSION_COOKIE = "PROVISIONING_SESSIONID";
	
	private String apiKey;
	private String basePath;
	
	private ApiClient client;
	
	private SessionApi sessionApi; 
	private String sessionId;
	
	private UsersApi usersApi;
	
	public ProvisioningApi(String basePath, String apiKey) {
		this.apiKey = apiKey;
		this.basePath = basePath;
		
		
	}
	
	public void initializeWithToken(String authToken) throws ProvisioningApiException {
		initialize(authToken, null, null);
	}
	
	public void initializeWithCode(String authCode, String redirectUri) throws ProvisioningApiException {
		initialize(null, authCode, redirectUri);
	}
	
	private static String extractSessionCookie(ApiResponse<LoginSuccessResponse> response) throws ProvisioningApiException {
        
        String workspaceSessionCookie = null;

        // Required to get case insensitive headers
        Map<String, List<String>> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        headers.putAll(response.getHeaders());

        List<String> cookies = headers.get("set-cookie");
        for (String cookie : cookies) {
            if(cookie.startsWith(SESSION_COOKIE)){
                workspaceSessionCookie = cookie;
                break;
            }
        }

        if(workspaceSessionCookie == null) {
            throw new ProvisioningApiException("Failed to extract provisioning session cookie.");
        }

        String value = workspaceSessionCookie;
        String sessionId = value.split(";")[0].split("=")[1];
        
        
        return sessionId;
    }
	
	private void initialize(String authToken, String authCode, String redirectUri) throws ProvisioningApiException {
		try {
			client = new ApiClient();
			client.setBasePath(basePath + "/provisioning/v3");
		
			CookieStoreImpl cookieStore = new CookieStoreImpl();
			client.getHttpClient().setCookieHandler(new CookieManager(cookieStore, CookiePolicy.ACCEPT_ALL));
		
			client.addDefaultHeader("x-api-key", apiKey);
			
			String authorization = authToken != null ? "Bearer " + authToken : null;
			
			client.addDefaultHeader("Authorization", authorization);
		
			sessionApi = new SessionApi();
			sessionApi.setApiClient(client);
			usersApi = new UsersApi();
			usersApi.setApiClient(client);
		
			
			final ApiResponse<LoginSuccessResponse> response = 
				sessionApi.initializeProvisioningWithHttpInfo(new InitProvData().code(authCode).redirectUri(redirectUri), authorization);
			sessionId = extractSessionCookie(response);
			client.addDefaultHeader("Cookie", String.format("%s=%s", SESSION_COOKIE, sessionId));
			
		} catch (ApiException e) {
			
			throw new ProvisioningApiException("Error initializing",e);
		}
		
	}
	
	public void addUser(User user) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = usersApi.addUser(new AddUserData().data(Converters.convertUserToAddUserDataData(user)));
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error adding user. Code: " + resp.getStatus().getCode());
			}
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error adding user", e);
        }
	}
	
	public void deleteUser(String userDbid, boolean keepPlaces) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = usersApi.deleteUser(userDbid, keepPlaces);
		
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error deleting user. Code: " + resp.getStatus().getCode());
			}
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error deleting user", e);
        }
	}
	
	
	public List<User> getUsers(int limit, int offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, boolean userEnabled, String userValid) throws ProvisioningApiException {
		List<User> out = new ArrayList();
		
		try {
			GetUsersSuccessResponse resp = usersApi.getUsers(limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid);
		
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting users. Code: " + resp.getStatus().getCode());
			}
			
			for(Object i:resp.getData().getUsers()) {
				out.add(new User((Map<String, Object>)i));
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting users", e);
        }
        
        return out;
	}
	
	
	private static class CookieStoreImpl implements CookieStore {
		private final CookieStore manager = new CookieManager().getCookieStore();

		@Override
		public void add(URI uri, HttpCookie cookie) {
			manager.add(uri, cookie);
		}

		@Override
		public List<HttpCookie> get(URI uri) {
			return manager.get(uri);
		}

		@Override
		public List<HttpCookie> getCookies() {
			return manager.getCookies();
		}

		@Override
		public List<URI> getURIs() {
			return manager.getURIs();
		}

		@Override
		public boolean remove(URI uri, HttpCookie cookie) {
			return manager.remove(uri, cookie);
		}

		@Override
		public boolean removeAll() {
			return manager.removeAll();
		}
	}
	
}