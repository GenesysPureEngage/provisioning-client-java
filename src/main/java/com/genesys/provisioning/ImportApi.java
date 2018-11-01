package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import com.genesys.internal.provisioning.model.GetImportStatusResponse;

import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.ImportStatus;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ImportApi {
	private com.genesys.internal.provisioning.api.ImportApi importApi;
	private ApiClient client;
	
	public ImportApi(ApiClient client) {
		this.client = client;
		importApi = new com.genesys.internal.provisioning.api.ImportApi(client);
	}
	
	/**
     * Import users.
     * Import users in the specified CSV/XLS file.
     * @param fileName the name of the CSV/XLS file to import.
     * @param fileContents the contents of the CSV/XLS file to import.
     * @param validateBeforeImport Specifies whether the Provisioning API should validate the file before the actual import takes place. (optional, default to false)
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void importFile(String fileName, String fileContents, Boolean validateBeforeImport) throws ProvisioningApiException {
		
		RequestBody requestBody = new MultipartBuilder()
		.type(MultipartBuilder.FORM)
		.addPart(
		  	Headers.of("Content-Disposition", "form-data; name=\"csvfile\"; filename=\""+fileName+"\""),
		  	RequestBody.create(MediaType.parse("text/csv"), fileContents))
		.addPart(
		  	Headers.of("Content-Disposition", "form-data; name=\"validateBeforeImport\""),
		  	RequestBody.create(null, validateBeforeImport.toString()))
		.build();

 		Request request = new Request.Builder()
			.url(this.client.getBasePath()+"/import-users/csv")
			.post(requestBody)
			.build();
		try {
			Response response = this.client.getHttpClient().newCall(request).execute();
		} catch(IOException e) {
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
     * @param fileName The name of the CSV/XLS file to validate.
     * @param fileContents The contents of the CSV/XLS file to validate.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public void validateFile(String fileName, String fileContents) throws ProvisioningApiException {
		
		RequestBody requestBody = new MultipartBuilder()
		.type(MultipartBuilder.FORM)
		.addPart(
		  	Headers.of("Content-Disposition", "form-data; name=\"csvfile\"; filename=\""+fileName+"\""),
		  	RequestBody.create(MediaType.parse("text/csv"), fileContents))
		.build();

 		Request request = new Request.Builder()
			.url(this.client.getBasePath()+"/import-users/validate-csv")
			.post(requestBody)
			.build();
		try {
			Response response = this.client.getHttpClient().newCall(request).execute();
		} catch(IOException e) {
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
			
			if (resp.getStatus().getCode().intValue() != 0) {
				throw new ProvisioningApiException("Error getting import status. Code: " + resp.getStatus().getCode());
			}
			
			return Converters.convertGetImportStatusResponseDataToImportStatus(resp.getData());
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting import status", e);
        }
	}
	
}