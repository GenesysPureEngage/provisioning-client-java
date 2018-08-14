package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import com.genesys.internal.provisioning.model.GetImportStatusResponse;

import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.ImportStatus;

import java.io.File;

public class ImportApi {
	private com.genesys.internal.provisioning.api.ImportApi importApi;
	
	public ImportApi(ApiClient client) {
		importApi = new com.genesys.internal.provisioning.api.ImportApi(client);
	}
	
	/**
     * Import users.
     * Import users in the specified CSV/XLS file.
     * @param csvfile The CSV/XLS file to import. (optional)
     * @param validateBeforeImport Specifies whether the Provisioning API should validate the file before the actual import takes place. (optional, default to false)
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void importFile(File csvfile, Boolean validateBeforeImport) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = importApi.importFile(csvfile, validateBeforeImport);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error importing file. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error importing file", e);
        }
	}
	
	/**
     * Stop import.
     * Terminates the current user import operation.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void terminateImport() throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = importApi.terminateImport();
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error terminating import. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error terminating import", e);
        }
	}
	
	/**
     * Validate the import file.
     * Performs pre-validation on the specified CSV/XLS file.
     * @param csvfile The CSV/XLS file to import. (optional)
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void validateImportFile(File csvfile) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = importApi.validateImportFile(csvfile);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error validating file. Code: " + resp.getStatus().getCode());
			}
			
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error validating file", e);
        }
	}
	
	/**
     * Get import status.
     * Get all active imports for the specified tenant.
     * @param adminName The login name of an administrator for the tenant. (required)
     * @param tenantName The name of the tenant. (required)
     * @return ImportStatus object.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public ImportStatus getImportStatus(String adminName, String tenantName) throws ProvisioningApiException {
		try {
			GetImportStatusResponse resp = importApi.getImportStatus(adminName, tenantName);
			
			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting import status. Code: " + resp.getStatus().getCode());
			}
			
			return Converters.convertGetImportStatusResponseDataToImportStatus(resp.getData());
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting import status", e);
        }
	}
	
}