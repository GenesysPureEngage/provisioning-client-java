package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.GetObjectsSuccessResponse;
import com.genesys.internal.provisioning.model.ApiSuccessResponse;

import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.Results;
import com.genesys.provisioning.models.Dn;
import com.genesys.provisioning.models.AgentGroup;
import com.genesys.provisioning.models.DnGroup;
import com.genesys.provisioning.models.SearchParams;
import com.genesys.provisioning.models.Skill;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ObjectsApi {
	
	private com.genesys.internal.provisioning.api.ObjectsApi objectsApi;
	
	public ObjectsApi(ApiClient client) {
		objectsApi = new com.genesys.internal.provisioning.api.ObjectsApi(client);
	}
	
	/**
     * Get DNs.
     * Get DNs (directory numbers) from Configuration Server with the specified filters.
     * @param dnType the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups may contain a list of DN group names to filter DNs. (optional)
     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term that you want to search for in the object keys. The Provisioning API searches for the this term in the value of the key you specify in &#39;search_key&#39;.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in &#39;search_term&#39;. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the &#39;search_term&#39;. Possible values are includes, startsWith, endsWith, and isEqual.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are caseSensitive, caseInsensitive or numeric.  (optional, default to caseSensitive)
     * @return Results object which includes list of Dns and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Dn> searchDns(String dnType, List<String> dnGroups, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod) throws ProvisioningApiException {
		try {
			GetObjectsSuccessResponse resp = objectsApi.getObject(
				"dns",
				dnType,
				dnGroups,
				null,
				limit,
				offset,
				searchTerm,
				searchKey,
				matchMethod,
				sortKey,
				sortAscending,
				sortMethod,
				null,
				null
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting objects. Code: " + resp.getStatus().getCode());
			}
			
			Results<Dn> out = new Results<Dn>();
			out.setResults(Converters.convertMapListToDnList(resp.getData().getDns()));
			out.setTotalCount(resp.getData().getTotalCount());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting objects", e);
        }
	}
	
	/**
     * Get DNs.
     * Get DNs (directory numbers) from Configuration Server with the specified filters.
     * @param dnType the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups may contain a list of DN group names to filter DNs. (optional)
     * @param searchParams object containing remaining search parameters (limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod).
	 * @return Results object which includes list of Dns and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Dn> searchDns(String dnType, List<String> dnGroups, SearchParams searchParams) throws ProvisioningApiException {
		return searchDns(
			dnType,
			dnGroups,
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getSearchTerm(),
			searchParams.getSearchKey(),
			searchParams.getMatchMethod(),
			searchParams.getSortKey(),
			searchParams.getSortAscending(),
			searchParams.getSortMethod()
		);
	}
	
	/**
     * Get DNs by DBID.
     * Get DNs (directory numbers) from Configuration Server with the specified filters.
     * @param dnType If the object_type is &#39;dns&#39;, then you need to specify the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups If the object_type is &#39;dns&#39;, may contain a list of DN group names to filter DNs. (optional)     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are caseSensitive, caseInsensitive or numeric.  (optional, default to caseSensitive)
     * @param DBIDs List of DBIDs of Dns to be fetched.  (required)
     * @return Results object which includes list of Dns with the specified DBIDs and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Dn> getDnsByDBIDs(String dnType, List<String> dnGroups, Integer limit, Integer offset, String sortKey, Boolean sortAscending, String sortMethod, List<String> DBIDs) throws ProvisioningApiException {
		try {
			GetObjectsSuccessResponse resp = objectsApi.getObject(
				"dns",
				dnType,
				dnGroups,
				null,
				limit,
				offset,
				null,
				null,
				null,
				sortKey,
				sortAscending,
				sortMethod,
				String.join(",",DBIDs),
				null
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting objects. Code: " + resp.getStatus().getCode());
			}
			
			Results<Dn> out = new Results<Dn>();
			out.setResults(Converters.convertMapListToDnList(resp.getData().getDns()));
			out.setTotalCount(resp.getData().getTotalCount());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting objects", e);
        }
	}
	
	/**
     * Get DNs by DBIDs.
     * Get DNs (directory numbers) or agent groups from Configuration Server with the specified DBIDs.
     * @param DBIDs List of DBIDs of Dns to be fetched.  (required)
     * @return Results object which includes list of Dns with the specified DBIDs and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Dn> getDnsByDBIDs(List<String> DBIDs) throws ProvisioningApiException {
		return getDnsByDBIDs(null,null,null,null,null,null,null,DBIDs);
	}
	
	/**
     * Get agent groups.
     * Get agent groups from Configuration Server with the specified filters.
     * @param groupType the agent group type. (optional)
     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term that you want to search for in the object keys. The Provisioning API searches for the this term in the value of the key you specify in &#39;search_key&#39;.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in &#39;search_term&#39;. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the &#39;search_term&#39;. Possible values are includes, startsWith, endsWith, and isEqual.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are caseSensitive, caseInsensitive or numeric.  (optional, default to caseSensitive)
     * @return Results object which includes list of AgentGroups and the total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<AgentGroup> searchAgentGroups(String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod) throws ProvisioningApiException {
		try {
			GetObjectsSuccessResponse resp = objectsApi.getObject(
				"agent-groups",
				null,
				null,
				groupType,
				limit,
				offset,
				searchTerm,
				searchKey,
				matchMethod,
				sortKey,
				sortAscending,
				sortMethod,
				null,
				null
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting objects. Code: " + resp.getStatus().getCode());
			}
			
			Results<AgentGroup> out = new Results<AgentGroup>();
			out.setResults(Converters.convertMapListToAgentGroupList(resp.getData().getAgentGroups()));
			out.setTotalCount(resp.getData().getTotalCount());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting objects", e);
        }
	}
	
	/**
     * Get agent groups.
     * Get agent groups from Configuration Server with the specified filters.
     * @param groupType the agent group type. (optional)
     * @param searchParams object containing remaining search parameters (limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod).
	 * @return Results object which includes list of agent groups and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<AgentGroup> searchAgentGroups(String groupType, SearchParams searchParams) throws ProvisioningApiException {
		return searchAgentGroups(
			groupType,
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getSearchTerm(),
			searchParams.getSearchKey(),
			searchParams.getMatchMethod(),
			searchParams.getSortKey(),
			searchParams.getSortAscending(),
			searchParams.getSortMethod()
		);
	}
	
	/**
     * Get Dn groups.
     * Get Dn groups from Configuration Server with the specified filters.
     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term that you want to search for in the object keys. The Provisioning API searches for the this term in the value of the key you specify in &#39;search_key&#39;.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in &#39;search_term&#39;. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the &#39;search_term&#39;. Possible values are includes, startsWith, endsWith, and isEqual.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are caseSensitive, caseInsensitive or numeric.  (optional, default to caseSensitive)
     * @return Results object which includes list of DnGroups and the total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<DnGroup> searchDnGroups(Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod) throws ProvisioningApiException {
		try {
			GetObjectsSuccessResponse resp = objectsApi.getObject(
				"dn-groups",
				null,
				null,
				null,
				limit,
				offset,
				searchTerm,
				searchKey,
				matchMethod,
				sortKey,
				sortAscending,
				sortMethod,
				null,
				null
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting objects. Code: " + resp.getStatus().getCode());
			}
			
			Results<DnGroup> out = new Results();
			out.setResults(Converters.convertMapListToDnGroupList(resp.getData().getDnGroups()));
			out.setTotalCount(resp.getData().getTotalCount());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting objects", e);
        }
	}
	
	/**
     * Get Dn groups.
     * Get Dn groups from Configuration Server with the specified filters.
     * @param searchParams object containing remaining search parameters (limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod).
	 * @return Results object which includes list of Dn groups and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<DnGroup> searchDnGroups(SearchParams searchParams) throws ProvisioningApiException {
		return searchDnGroups(
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getSearchTerm(),
			searchParams.getSearchKey(),
			searchParams.getMatchMethod(),
			searchParams.getSortKey(),
			searchParams.getSortAscending(),
			searchParams.getSortMethod()
		);
	}
	
	/**
     * Get Skills.
     * Get Skills from Configuration Server with the specified filters.
     * @param limit The number of objects the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term that you want to search for in the object keys. The Provisioning API searches for the this term in the value of the key you specify in &#39;search_key&#39;.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in &#39;search_term&#39;. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the &#39;search_term&#39;. Possible values are includes, startsWith, endsWith, and isEqual.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are caseSensitive, caseInsensitive or numeric.  (optional, default to caseSensitive)
     * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
     * @return Results object which includes list of Skills and the total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Skill> searchSkills(Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, Boolean inUse) throws ProvisioningApiException {
		try {
			GetObjectsSuccessResponse resp = objectsApi.getObject(
				"dn-groups",
				null,
				null,
				null,
				limit,
				offset,
				searchTerm,
				searchKey,
				matchMethod,
				sortKey,
				sortAscending,
				sortMethod,
				null,
				inUse
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting objects. Code: " + resp.getStatus().getCode());
			}
			
			Results<Skill> out = new Results();
			out.setResults(Converters.convertMapListToSkillsList(resp.getData().getDnGroups()));
			out.setTotalCount(resp.getData().getTotalCount());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting objects", e);
        }
	}
	
	/**
     * Get Skills.
     * Get Skills from Configuration Server with the specified filters.
     * @param searchParams object containing remaining search parameters (limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod).
	 * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
	 * @return Results object which includes list of Skills and total count.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Results<Skill> searchSkills(SearchParams searchParams, Boolean inUse) throws ProvisioningApiException {
		return searchSkills(
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getSearchTerm(),
			searchParams.getSearchKey(),
			searchParams.getMatchMethod(),
			searchParams.getSortKey(),
			searchParams.getSortAscending(),
			searchParams.getSortMethod(),
			inUse
		);
	}
	
}