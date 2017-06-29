/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model.  The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.708
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.provisioning.api;

import com.genesys.common.ApiCallback;
import com.genesys.common.ApiClient;
import com.genesys.common.ApiException;
import com.genesys.common.ApiResponse;
import com.genesys.common.Configuration;
import com.genesys.common.Pair;
import com.genesys.common.ProgressRequestBody;
import com.genesys.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.provisioning.model.ObjectsGetResponseError;
import com.genesys.provisioning.model.ObjectsGetResponseSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectsApi {
    private ApiClient apiClient;

    public ObjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for objectsGet */
    private com.squareup.okhttp.Call objectsGetCall(String objectType, String dnType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/objects/{object_type}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "object_type" + "\\}", apiClient.escapeString(objectType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (dnType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "dn_type", dnType));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_term", searchTerm));
        if (searchKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_key", searchKey));
        if (matchMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "match_method", matchMethod));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call objectsGetValidateBeforeCall(String objectType, String dnType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling objectsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = objectsGetCall(objectType, dnType, limit, offset, searchTerm, searchKey, matchMethod, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read DNs or Agent Groups
     * The GET operation will fetch objects from configuration server, possible with filters
     * @param objectType Object type - &#39;dns&#39; or &#39;agent-groups&#39; (required)
     * @param dnType DN type if object_type &#x3D; &#39;dns&#39; (e.g. CFGRoutingPoint). Refer Configuration Server API docs. (optional)
     * @param limit Limit number of objects to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param searchTerm Part of a key in CFGDN or CfgAgentGroup.  (optional)
     * @param searchKey A keypath in CFGDN or CfgAgentGroup.  (optional)
     * @param matchMethod Method to match the search_term (&#39;includes&#39;, &#39;startsWith&#39;, &#39;endsWith&#39;, &#39;isEqual&#39;).  (optional)
     * @return ObjectsGetResponseSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ObjectsGetResponseSuccess objectsGet(String objectType, String dnType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod) throws ApiException {
        ApiResponse<ObjectsGetResponseSuccess> resp = objectsGetWithHttpInfo(objectType, dnType, limit, offset, searchTerm, searchKey, matchMethod);
        return resp.getData();
    }

    /**
     * Read DNs or Agent Groups
     * The GET operation will fetch objects from configuration server, possible with filters
     * @param objectType Object type - &#39;dns&#39; or &#39;agent-groups&#39; (required)
     * @param dnType DN type if object_type &#x3D; &#39;dns&#39; (e.g. CFGRoutingPoint). Refer Configuration Server API docs. (optional)
     * @param limit Limit number of objects to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param searchTerm Part of a key in CFGDN or CfgAgentGroup.  (optional)
     * @param searchKey A keypath in CFGDN or CfgAgentGroup.  (optional)
     * @param matchMethod Method to match the search_term (&#39;includes&#39;, &#39;startsWith&#39;, &#39;endsWith&#39;, &#39;isEqual&#39;).  (optional)
     * @return ApiResponse&lt;ObjectsGetResponseSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ObjectsGetResponseSuccess> objectsGetWithHttpInfo(String objectType, String dnType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod) throws ApiException {
        com.squareup.okhttp.Call call = objectsGetValidateBeforeCall(objectType, dnType, limit, offset, searchTerm, searchKey, matchMethod, null, null);
        Type localVarReturnType = new TypeToken<ObjectsGetResponseSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read DNs or Agent Groups (asynchronously)
     * The GET operation will fetch objects from configuration server, possible with filters
     * @param objectType Object type - &#39;dns&#39; or &#39;agent-groups&#39; (required)
     * @param dnType DN type if object_type &#x3D; &#39;dns&#39; (e.g. CFGRoutingPoint). Refer Configuration Server API docs. (optional)
     * @param limit Limit number of objects to fetch (optional)
     * @param offset Skip first N matches (optional)
     * @param searchTerm Part of a key in CFGDN or CfgAgentGroup.  (optional)
     * @param searchKey A keypath in CFGDN or CfgAgentGroup.  (optional)
     * @param matchMethod Method to match the search_term (&#39;includes&#39;, &#39;startsWith&#39;, &#39;endsWith&#39;, &#39;isEqual&#39;).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call objectsGetAsync(String objectType, String dnType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, final ApiCallback<ObjectsGetResponseSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = objectsGetValidateBeforeCall(objectType, dnType, limit, offset, searchTerm, searchKey, matchMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ObjectsGetResponseSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
