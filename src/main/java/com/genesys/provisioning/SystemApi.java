package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.ServiceProxyData;


public class SystemApi {
	
	private com.genesys.internal.provisioning.api.SystemApi systemApi;
	
	public SystemApi(ApiClient client) {
		systemApi = new com.genesys.internal.provisioning.api.SystemApi(client);
	}
	
	/**
     * execute service method on Node to avoid excessive requests from client
     * This operation will execute service method on Node
     * @param serviceName Service name, just for human-readability of URL (required)
     * @param service Service name (required)
     * @param method Method name (required)
     * @param args Method arguments array (optional)
	 * @throws ProvisioningApiException if the call is unsuccessful.
	*/
	public void executeServiceMethod(String serviceName, String service, String method, Object args) throws ProvisioningApiException {
		try {
			systemApi.executeServiceMethod(serviceName, new ServiceProxyData()
				.service(service)
				.method(method)
				.args(args)
			);
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error executing service method ", e);
        }
	}
	
}