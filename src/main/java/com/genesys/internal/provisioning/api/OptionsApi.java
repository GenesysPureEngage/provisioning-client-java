/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.25.2540
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.api;

import com.genesys.internal.common.ApiCallback;
import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;
import com.genesys.internal.common.ApiResponse;
import com.genesys.internal.common.Configuration;
import com.genesys.internal.common.Pair;
import com.genesys.internal.common.ProgressRequestBody;
import com.genesys.internal.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.internal.provisioning.model.ApiErrorResponse;
import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import com.genesys.internal.provisioning.model.GetOptionsResponse;
import com.genesys.internal.provisioning.model.ModifyOptionsData;
import com.genesys.internal.provisioning.model.UpdateOptionsData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionsApi {
    private ApiClient apiClient;

    public OptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOptions
     * @param personDbid The DBID of a person. Options are merged with the person&#39;s annex and the annexes of the person&#39;s agent groups. Mutual with agent_group_dbid.  (optional)
     * @param agentGroupDbid The DBID of an agent group. Options are merged with the agent group&#39;s annex. Mutual with person_dbid. (optional)
     * @param application The name of an application. This value is set to CloudCluster by default. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsCall(String personDbid, String agentGroupDbid, String application, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (personDbid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("person_dbid", personDbid));
        if (agentGroupDbid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("agent_group_dbid", agentGroupDbid));
        if (application != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("application", application));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOptionsValidateBeforeCall(String personDbid, String agentGroupDbid, String application, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getOptionsCall(personDbid, agentGroupDbid, application, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get options.
     * Get options for a specified application and merge them with the person and agent group annexes.
     * @param personDbid The DBID of a person. Options are merged with the person&#39;s annex and the annexes of the person&#39;s agent groups. Mutual with agent_group_dbid.  (optional)
     * @param agentGroupDbid The DBID of an agent group. Options are merged with the agent group&#39;s annex. Mutual with person_dbid. (optional)
     * @param application The name of an application. This value is set to CloudCluster by default. (optional)
     * @return GetOptionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetOptionsResponse getOptions(String personDbid, String agentGroupDbid, String application) throws ApiException {
        ApiResponse<GetOptionsResponse> resp = getOptionsWithHttpInfo(personDbid, agentGroupDbid, application);
        return resp.getData();
    }

    /**
     * Get options.
     * Get options for a specified application and merge them with the person and agent group annexes.
     * @param personDbid The DBID of a person. Options are merged with the person&#39;s annex and the annexes of the person&#39;s agent groups. Mutual with agent_group_dbid.  (optional)
     * @param agentGroupDbid The DBID of an agent group. Options are merged with the agent group&#39;s annex. Mutual with person_dbid. (optional)
     * @param application The name of an application. This value is set to CloudCluster by default. (optional)
     * @return ApiResponse&lt;GetOptionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetOptionsResponse> getOptionsWithHttpInfo(String personDbid, String agentGroupDbid, String application) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsValidateBeforeCall(personDbid, agentGroupDbid, application, null, null);
        Type localVarReturnType = new TypeToken<GetOptionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get options. (asynchronously)
     * Get options for a specified application and merge them with the person and agent group annexes.
     * @param personDbid The DBID of a person. Options are merged with the person&#39;s annex and the annexes of the person&#39;s agent groups. Mutual with agent_group_dbid.  (optional)
     * @param agentGroupDbid The DBID of an agent group. Options are merged with the agent group&#39;s annex. Mutual with person_dbid. (optional)
     * @param application The name of an application. This value is set to CloudCluster by default. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsAsync(String personDbid, String agentGroupDbid, String application, final ApiCallback<GetOptionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOptionsValidateBeforeCall(personDbid, agentGroupDbid, application, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetOptionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modifyOptions
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modifyOptionsCall(ModifyOptionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modifyOptionsValidateBeforeCall(ModifyOptionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling modifyOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = modifyOptionsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Modify options.
     * Replace the existing application options with the specified new values.
     * @param body Body Data (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse modifyOptions(ModifyOptionsData body) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = modifyOptionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Modify options.
     * Replace the existing application options with the specified new values.
     * @param body Body Data (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> modifyOptionsWithHttpInfo(ModifyOptionsData body) throws ApiException {
        com.squareup.okhttp.Call call = modifyOptionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Modify options. (asynchronously)
     * Replace the existing application options with the specified new values.
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modifyOptionsAsync(ModifyOptionsData body, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modifyOptionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateOptions
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateOptionsCall(UpdateOptionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateOptionsValidateBeforeCall(UpdateOptionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = updateOptionsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add, edit or delete options values.
     * Add, edit or delete option values for the specified application.
     * @param body Body Data (required)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse updateOptions(UpdateOptionsData body) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = updateOptionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add, edit or delete options values.
     * Add, edit or delete option values for the specified application.
     * @param body Body Data (required)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> updateOptionsWithHttpInfo(UpdateOptionsData body) throws ApiException {
        com.squareup.okhttp.Call call = updateOptionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add, edit or delete options values. (asynchronously)
     * Add, edit or delete option values for the specified application.
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOptionsAsync(UpdateOptionsData body, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateOptionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
