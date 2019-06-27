/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.54.3393
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


import com.genesys.internal.provisioning.model.CapRulesDeleteResponseError;
import com.genesys.internal.provisioning.model.CapRulesDeleteResponseSuccess;
import com.genesys.internal.provisioning.model.CapRulesGetResponseError;
import com.genesys.internal.provisioning.model.CapRulesGetResponseSuccess;
import com.genesys.internal.provisioning.model.CaprulePost;
import com.genesys.internal.provisioning.model.CaprulePut;
import com.genesys.internal.provisioning.model.CaprulesPostResponseStatusError;
import com.genesys.internal.provisioning.model.CaprulesPostResponseStatusSuccess;
import com.genesys.internal.provisioning.model.CaprulesPutResponseStatusError;
import com.genesys.internal.provisioning.model.CaprulesPutResponseStatusSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapacityRulesApi {
    private ApiClient apiClient;

    public CapacityRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CapacityRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for capRulesGet
     * @param scriptDbid DBID of a script (optional)
     * @param name Name of a script (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call capRulesGetCall(String scriptDbid, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/capacity-rules";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (scriptDbid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("script_dbid", scriptDbid));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));

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
    private com.squareup.okhttp.Call capRulesGetValidateBeforeCall(String scriptDbid, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = capRulesGetCall(scriptDbid, name, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get capacity rules.
     * The GET operation will return CfgScript objects of CFGCapacityRule type
     * @param scriptDbid DBID of a script (optional)
     * @param name Name of a script (optional)
     * @return CapRulesGetResponseSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CapRulesGetResponseSuccess capRulesGet(String scriptDbid, String name) throws ApiException {
        ApiResponse<CapRulesGetResponseSuccess> resp = capRulesGetWithHttpInfo(scriptDbid, name);
        return resp.getData();
    }

    /**
     * Get capacity rules.
     * The GET operation will return CfgScript objects of CFGCapacityRule type
     * @param scriptDbid DBID of a script (optional)
     * @param name Name of a script (optional)
     * @return ApiResponse&lt;CapRulesGetResponseSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CapRulesGetResponseSuccess> capRulesGetWithHttpInfo(String scriptDbid, String name) throws ApiException {
        com.squareup.okhttp.Call call = capRulesGetValidateBeforeCall(scriptDbid, name, null, null);
        Type localVarReturnType = new TypeToken<CapRulesGetResponseSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get capacity rules. (asynchronously)
     * The GET operation will return CfgScript objects of CFGCapacityRule type
     * @param scriptDbid DBID of a script (optional)
     * @param name Name of a script (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call capRulesGetAsync(String scriptDbid, String name, final ApiCallback<CapRulesGetResponseSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = capRulesGetValidateBeforeCall(scriptDbid, name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CapRulesGetResponseSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for capRulesPost
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call capRulesPostCall(CaprulePost body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/capacity-rules";

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
    private com.squareup.okhttp.Call capRulesPostValidateBeforeCall(CaprulePost body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling capRulesPost(Async)");
        }
        

        com.squareup.okhttp.Call call = capRulesPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create capacity rule.
     * The POST operation will create a CfgScript object of CFGCapacityRule type
     * @param body Body Data (required)
     * @return CaprulesPostResponseStatusSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CaprulesPostResponseStatusSuccess capRulesPost(CaprulePost body) throws ApiException {
        ApiResponse<CaprulesPostResponseStatusSuccess> resp = capRulesPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create capacity rule.
     * The POST operation will create a CfgScript object of CFGCapacityRule type
     * @param body Body Data (required)
     * @return ApiResponse&lt;CaprulesPostResponseStatusSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CaprulesPostResponseStatusSuccess> capRulesPostWithHttpInfo(CaprulePost body) throws ApiException {
        com.squareup.okhttp.Call call = capRulesPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CaprulesPostResponseStatusSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create capacity rule. (asynchronously)
     * The POST operation will create a CfgScript object of CFGCapacityRule type
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call capRulesPostAsync(CaprulePost body, final ApiCallback<CaprulesPostResponseStatusSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = capRulesPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CaprulesPostResponseStatusSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for capRulesPut
     * @param scriptDbid  (required)
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call capRulesPutCall(String scriptDbid, CaprulePut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/capacity-rules"
            .replaceAll("\\{" + "script_dbid" + "\\}", apiClient.escapeString(scriptDbid.toString()));

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
    private com.squareup.okhttp.Call capRulesPutValidateBeforeCall(String scriptDbid, CaprulePut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scriptDbid' is set
        if (scriptDbid == null) {
            throw new ApiException("Missing the required parameter 'scriptDbid' when calling capRulesPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling capRulesPut(Async)");
        }
        

        com.squareup.okhttp.Call call = capRulesPutCall(scriptDbid, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update capacity rule.
     * The PUT operation will update annex of a CfgScript object
     * @param scriptDbid  (required)
     * @param body Body Data (required)
     * @return CaprulesPutResponseStatusSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CaprulesPutResponseStatusSuccess capRulesPut(String scriptDbid, CaprulePut body) throws ApiException {
        ApiResponse<CaprulesPutResponseStatusSuccess> resp = capRulesPutWithHttpInfo(scriptDbid, body);
        return resp.getData();
    }

    /**
     * Update capacity rule.
     * The PUT operation will update annex of a CfgScript object
     * @param scriptDbid  (required)
     * @param body Body Data (required)
     * @return ApiResponse&lt;CaprulesPutResponseStatusSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CaprulesPutResponseStatusSuccess> capRulesPutWithHttpInfo(String scriptDbid, CaprulePut body) throws ApiException {
        com.squareup.okhttp.Call call = capRulesPutValidateBeforeCall(scriptDbid, body, null, null);
        Type localVarReturnType = new TypeToken<CaprulesPutResponseStatusSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update capacity rule. (asynchronously)
     * The PUT operation will update annex of a CfgScript object
     * @param scriptDbid  (required)
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call capRulesPutAsync(String scriptDbid, CaprulePut body, final ApiCallback<CaprulesPutResponseStatusSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = capRulesPutValidateBeforeCall(scriptDbid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CaprulesPutResponseStatusSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for capruleDelete
     * @param scriptDbid DBID of a script (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call capruleDeleteCall(String scriptDbid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/capacity-rules"
            .replaceAll("\\{" + "script_dbid" + "\\}", apiClient.escapeString(scriptDbid.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call capruleDeleteValidateBeforeCall(String scriptDbid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scriptDbid' is set
        if (scriptDbid == null) {
            throw new ApiException("Missing the required parameter 'scriptDbid' when calling capruleDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = capruleDeleteCall(scriptDbid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a capacity rule.
     * The DELETE operation will remove a CfgScript object
     * @param scriptDbid DBID of a script (required)
     * @return CapRulesDeleteResponseSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CapRulesDeleteResponseSuccess capruleDelete(String scriptDbid) throws ApiException {
        ApiResponse<CapRulesDeleteResponseSuccess> resp = capruleDeleteWithHttpInfo(scriptDbid);
        return resp.getData();
    }

    /**
     * Delete a capacity rule.
     * The DELETE operation will remove a CfgScript object
     * @param scriptDbid DBID of a script (required)
     * @return ApiResponse&lt;CapRulesDeleteResponseSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CapRulesDeleteResponseSuccess> capruleDeleteWithHttpInfo(String scriptDbid) throws ApiException {
        com.squareup.okhttp.Call call = capruleDeleteValidateBeforeCall(scriptDbid, null, null);
        Type localVarReturnType = new TypeToken<CapRulesDeleteResponseSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a capacity rule. (asynchronously)
     * The DELETE operation will remove a CfgScript object
     * @param scriptDbid DBID of a script (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call capruleDeleteAsync(String scriptDbid, final ApiCallback<CapRulesDeleteResponseSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = capruleDeleteValidateBeforeCall(scriptDbid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CapRulesDeleteResponseSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
