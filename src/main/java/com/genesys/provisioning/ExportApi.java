package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.ExportFileResponse;
import com.genesys.internal.provisioning.model.ExportStatusResponse;
import com.genesys.internal.provisioning.model.ExportFileData;


import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.ExportFilterParams;

import java.net.URL;
import java.net.URLConnection;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.List;

public class ExportApi {
	private com.genesys.internal.provisioning.api.ExportApi exportApi;
	private ApiClient client;
	private String apiKey;
	private String sessionId;
	
	public ExportApi(ApiClient client, String apiKey, String sessionId) {
		exportApi = new com.genesys.internal.provisioning.api.ExportApi(client);
		this.client = client;
		this.apiKey = apiKey;
		this.sessionId = sessionId;
	}
	
	/**
     * Export users.
     * Export the specified users with the properties you list in the **fields** parameter.
     * @param fields fields.
     * @param fileName the file name to be exported.
     * @param personDBIDs DBIDs of users to be exported.
     * @param filterParameters Filter parameters.
     * @return Id of the export.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public BigDecimal exportFile(List<String> fields, String fileName, List<String> personDBIDs, ExportFilterParams filterParameters) throws ProvisioningApiException {
		try {
			ExportFileResponse resp = exportApi.exportFile(new ExportFileData()
				.fields(fields)
				.fileName(fileName)
				.personDBIDs(personDBIDs)
				.filterParameters(Converters.convertExportFilterParamsToExportFileDataFilterParameters(filterParameters))
			);
			
			if (!resp.getCode().equals(0)) {
				throw new ProvisioningApiException("Error exporting file. Code: " + resp.getCode());
			}
			
			return resp.getData().getId();
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error exporting file", e);
        }
	}
	
	/**
     * Get export status.
     * Check the status of the specified export and return the percentage complete.
     * @param id The ID of a previously started export. (required)
     * @return Export status.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public BigDecimal getExportStatus(Integer id) throws ProvisioningApiException {
		try {
			ExportStatusResponse resp = exportApi.getExportStatus(id);
	
			if (!resp.getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting export status. Code: " + resp.getCode());
			}
	
			return resp.getData().getProgress();
		} catch(ApiException e) {
			throw new ProvisioningApiException("Error getting export status", e);
		}
	}
	
	public String getDownloadUrl(BigDecimal id) {
		return client.getBasePath()+"/export-users/?id="+id+"&download=true";
	}
	
	public String downloadFile(BigDecimal id) throws ProvisioningApiException {
	
		try {
			URL url = new URL(getDownloadUrl(id));
			URLConnection conn = (URLConnection) url.openConnection();
			conn.setRequestProperty("x-api-key", apiKey);
			conn.setRequestProperty("Cookie", sessionId);
		
			String response = (new Scanner(conn.getInputStream())).useDelimiter("\\A").next();
			return response;
		} catch(Exception e) {
			throw new ProvisioningApiException("Error downloading export", e);
		}
		
	}
	
}