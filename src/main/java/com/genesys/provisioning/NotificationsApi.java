package com.genesys.provisioning;

import java.net.CookieManager;
import java.net.CookieStore;
import org.cometd.bayeux.Message;
import org.cometd.bayeux.client.ClientSessionChannel;
import org.cometd.client.BayeuxClient;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.ssl.SslContextFactory;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationsApi {
	
	private final Logger logger = LoggerFactory.getLogger(NotificationsApi.class);

	private BayeuxClient client = null;
	private Map<String, NotificationListener> listeners;
	private HttpClient httpClient;
	
	@FunctionalInterface
	public static interface NotificationListener {
        void onNotification(String channel, Map<String, Object> data);
    }
	
	public NotificationsApi(Map<String, NotificationListener> listeners) {
		this.listeners = listeners;
	}
	
	private CookieStore cookieStore = new CookieManager().getCookieStore();

    public CookieStore getCookieStore() {
        return cookieStore;
    }
	
    public void setCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
    }
	
	public void onHandshake(Message msg) {
		if(msg.isSuccessful()) {
            logger.info("Handshake successful.");
            
            logger.info("Subscribing to channels...");
            
            for (final String name : this.listeners.keySet()) {
                final NotificationListener listener = this.listeners.get(name);
                client.getChannel(name).subscribe(new ClientSessionChannel.MessageListener() {
                    @Override
                    public void onMessage(ClientSessionChannel clientSessionChannel, Message message) {
                    	
                        Map<String, Object> data = message.getDataAsMap();
                        listener.onNotification(name, data);
                    }
                }, new ClientSessionChannel.MessageListener() {
                    @Override
                    public void onMessage(ClientSessionChannel clientSessionChannel, Message message) {
                    	
                        String subscription = (String) message.get("subscription");
                        if (message.isSuccessful()) {
                            logger.info("Successfuly subscribed to channel: "+subscription);
                        } else {
                            logger.error("Cannot subscribe to channel: "+subscription);
                        }
                    }
                });
            }
        } else {
            logger.error("Handshake failed: {}", msg);
        }
	}
	
	public void initialize(String notificationsUrl, String apiKey) throws ProvisioningApiException {
		
		try {
            httpClient = new HttpClient(new SslContextFactory());
            httpClient.start();
            client = new BayeuxClient(notificationsUrl, new ClientTransport(apiKey, httpClient) {
                @Override
                protected CookieStore getCookieStore() {
                    return cookieStore;
                }
            });
            
        } catch(Exception ex) {
            throw new ProvisioningApiException("Cometd initialization failed.", ex);
        }
        logger.info("Handshake...");
        client.handshake(new ClientSessionChannel.MessageListener() {
            @Override
            public void onMessage(ClientSessionChannel clientSessionChannel, Message message) {
                onHandshake(message);
            }
        });
        
    }

    public void disconnect() throws ProvisioningApiException {
        disconnect(10000); // 10 second timeout by default
    }

    public void disconnect(long disconnectRequestTimeout) throws ProvisioningApiException {
    	try {
            if(client != null) {
                client.disconnect(disconnectRequestTimeout);
            }
            if(httpClient != null) {
                httpClient.stop();
            }
        } catch (Exception ex) {
        	
            throw new ProvisioningApiException("Cannot disconnect: ", ex);
        }
    }
}
