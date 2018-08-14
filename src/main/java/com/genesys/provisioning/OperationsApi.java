package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.provisioning.events.AsyncCallback;
import com.genesys.provisioning.models.UserSearchParams;

import com.genesys.internal.provisioning.model.ApiAsyncSuccessResponse;

import java.util.UUID;
import java.util.Map;

public class OperationsApi {
	
	private com.genesys.internal.provisioning.api.OperationsApi operationsApi;
	private Map<String, AsyncCallback> asyncCallbacks;
	
	
	public OperationsApi(ApiClient client, Map<String, AsyncCallback> asyncCallbacks) {
		operationsApi = new com.genesys.internal.provisioning.api.OperationsApi(client);
		this.asyncCallbacks = asyncCallbacks;
	}
	
	/**
     * Get used skills.
     * Get all [CfgSkill](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgSkill) that are linked to existing [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects. 
     * @param callback The callback function called when the skills are returned asynchronously. Callback takes one parameter: Map&lt;String, Object&lt; results.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void getUsedSkillsAsync(AsyncCallback callback) throws ProvisioningApiException {
		String aioId = UUID.randomUUID().toString();
		asyncCallbacks.put(aioId, callback);
		try {
			ApiAsyncSuccessResponse resp = operationsApi.getUsedSkillsAsync(aioId);
			
			if (!resp.getStatus().getCode().equals(1)) {
				throw new ProvisioningApiException("Error getting used skills. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting used skills", e);
        }
	}
	
	/**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only return users who have these Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @param userValid Return only valid or invalid users. (optional)
     * @param callback The callback function called when the skills are returned asynchronously. Callback takes one parameter: Map&lt;String, Object&lt; results.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void getUsersAsync(Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, AsyncCallback callback) throws ProvisioningApiException {
		String aioId = UUID.randomUUID().toString();
		asyncCallbacks.put(aioId, callback);
		try {
			ApiAsyncSuccessResponse resp = operationsApi.getUsersAsync(
				aioId,
				limit,
				offset,
				order,
				sortBy,
				filterName,
				filterParameters,
				roles,
				skills,
				userEnabled,
				userValid
			);
			
			if (!resp.getStatus().getCode().equals(1)) {
				throw new ProvisioningApiException("Error getting users. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting users", e);
        }
	}
	
	/**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param searchParams an object containing the search parameters. Parameters include (limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid).
	 * @param callback The callback function called when the skills are returned asynchronously. Callback takes one parameter: Map&lt;String, Object&lt; results.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void getUsersAsync(UserSearchParams searchParams, AsyncCallback callback) throws ProvisioningApiException {
		getUsersAsync(
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getOrder(),
			searchParams.getSortBy(),
			searchParams.getFilterName(),
			searchParams.getFilterParameters(),
			searchParams.getRoles(),
			searchParams.getSkills(),
			searchParams.getUserEnabled(),
			searchParams.getUserValid(),
			callback
		);
	}
	
}