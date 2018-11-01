package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;


import com.genesys.internal.provisioning.model.GetOptionsResponse;
import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import com.genesys.internal.provisioning.model.ModifyOptionsData;
import com.genesys.internal.provisioning.model.ModifyOptionsDataData;
import com.genesys.internal.provisioning.model.UpdateOptionsData;
import com.genesys.internal.provisioning.model.UpdateOptionsDataData;

import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.Options;

import java.util.Map;

public class OptionsApi {
	
	private com.genesys.internal.provisioning.api.OptionsApi optionsApi;
	
	public OptionsApi(ApiClient client) {
		optionsApi = new com.genesys.internal.provisioning.api.OptionsApi(client);
	}
	
	/**
     * Get options.
     * Get options for a specified application and merge them with the person and agent group annexes.
     * @param personDBID The DBID of a person. Options are merged with the person&#39;s annex and the annexes of the person&#39;s agent groups. Mutual with agent_group_dbid.  (optional)
     * @param agentGroupDBID The DBID of an agent group. Options are merged with the agent group&#39;s annex. Mutual with person_dbid. (optional)
     * @param application The name of an application. This value is set to CloudCluster by default. (optional)
     * @return Options object containing list of Options as well as cmeAppName and cmeAppDBID.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public Options getOptions(String personDBID, String agentGroupDBID, String application) throws ProvisioningApiException {
		try {
			GetOptionsResponse resp = optionsApi.getOptions(
				personDBID,
				agentGroupDBID,
				application
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting options. Code: " + resp.getStatus().getCode());
			}
			
			Options out = new Options();
			
			out.setOptions((Map<String, Object>) resp.getData().getOptions());
			out.setCmeAppName(resp.getData().getCmeAppName());
			out.setCmeAppDBID(resp.getData().getCmeAppDBID());
			
			return out;
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting options", e);
        }
	}
	
	/**
     * Modify options.
     * Replace the existing application options with the specified new values.
     * @param application application (required)
     * @param options attributes to be updated.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void modifyOptions(String application, Map<String, Object> options) throws ProvisioningApiException {
		try {
			
			ApiSuccessResponse resp = optionsApi.modifyOptions(
				new ModifyOptionsData().data(new ModifyOptionsDataData()
					.application(application)
					.options(options)
				)
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error modifying options. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error modifying options", e);
        }
	}
	
	/**
     * Add, edit or delete options values.
     * Add, edit or delete option values for the specified application.
     * @param application application.
     * @param newOptions options to add.
     * @param changedOptions options to change.
     * @param deletedOptions options to remove.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void updateOptions(String application, Map<String, Object> newOptions, Map<String, Object> changedOptions,  Map<String, Object> deletedOptions) throws ProvisioningApiException {
		try {
			
			ApiSuccessResponse resp = optionsApi.updateOptions(
				new UpdateOptionsData().data(new UpdateOptionsDataData()
					.application(application)
					.newOptions(newOptions)
					.changedOptions(changedOptions)
					.deletedOptions(deletedOptions)
				)
			);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error updating options. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error updating options", e);
        }
	}
	
}