/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.91.4963
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetStateResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-27T00:26:09.820Z")
public class GetStateResponseData {
  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("fastAPIEnabled")
  private Boolean fastAPIEnabled = null;

  @SerializedName("objectCacheEnabled")
  private Boolean objectCacheEnabled = null;

  @SerializedName("multiIdpSupport")
  private Boolean multiIdpSupport = null;

  @SerializedName("cometEngine")
  private String cometEngine = null;

  @SerializedName("asyncIOEnabled")
  private Boolean asyncIOEnabled = null;

  public GetStateResponseData sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Current session ID
   * @return sessionId
  **/
  @ApiModelProperty(value = "Current session ID")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public GetStateResponseData fastAPIEnabled(Boolean fastAPIEnabled) {
    this.fastAPIEnabled = fastAPIEnabled;
    return this;
  }

   /**
   * The provisioning service uses Fast API features of the configuration service
   * @return fastAPIEnabled
  **/
  @ApiModelProperty(value = "The provisioning service uses Fast API features of the configuration service")
  public Boolean isFastAPIEnabled() {
    return fastAPIEnabled;
  }

  public void setFastAPIEnabled(Boolean fastAPIEnabled) {
    this.fastAPIEnabled = fastAPIEnabled;
  }

  public GetStateResponseData objectCacheEnabled(Boolean objectCacheEnabled) {
    this.objectCacheEnabled = objectCacheEnabled;
    return this;
  }

   /**
   * The provisioning service uses internal cache for configuration objects
   * @return objectCacheEnabled
  **/
  @ApiModelProperty(value = "The provisioning service uses internal cache for configuration objects")
  public Boolean isObjectCacheEnabled() {
    return objectCacheEnabled;
  }

  public void setObjectCacheEnabled(Boolean objectCacheEnabled) {
    this.objectCacheEnabled = objectCacheEnabled;
  }

  public GetStateResponseData multiIdpSupport(Boolean multiIdpSupport) {
    this.multiIdpSupport = multiIdpSupport;
    return this;
  }

   /**
   * Multiple IDP SAML authorization is enabled
   * @return multiIdpSupport
  **/
  @ApiModelProperty(value = "Multiple IDP SAML authorization is enabled")
  public Boolean isMultiIdpSupport() {
    return multiIdpSupport;
  }

  public void setMultiIdpSupport(Boolean multiIdpSupport) {
    this.multiIdpSupport = multiIdpSupport;
  }

  public GetStateResponseData cometEngine(String cometEngine) {
    this.cometEngine = cometEngine;
    return this;
  }

   /**
   * Name of cometEngine
   * @return cometEngine
  **/
  @ApiModelProperty(value = "Name of cometEngine")
  public String getCometEngine() {
    return cometEngine;
  }

  public void setCometEngine(String cometEngine) {
    this.cometEngine = cometEngine;
  }

  public GetStateResponseData asyncIOEnabled(Boolean asyncIOEnabled) {
    this.asyncIOEnabled = asyncIOEnabled;
    return this;
  }

   /**
   * Returns is enabled asyncIO
   * @return asyncIOEnabled
  **/
  @ApiModelProperty(value = "Returns is enabled asyncIO")
  public Boolean isAsyncIOEnabled() {
    return asyncIOEnabled;
  }

  public void setAsyncIOEnabled(Boolean asyncIOEnabled) {
    this.asyncIOEnabled = asyncIOEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStateResponseData getStateResponseData = (GetStateResponseData) o;
    return Objects.equals(this.sessionId, getStateResponseData.sessionId) &&
        Objects.equals(this.fastAPIEnabled, getStateResponseData.fastAPIEnabled) &&
        Objects.equals(this.objectCacheEnabled, getStateResponseData.objectCacheEnabled) &&
        Objects.equals(this.multiIdpSupport, getStateResponseData.multiIdpSupport) &&
        Objects.equals(this.cometEngine, getStateResponseData.cometEngine) &&
        Objects.equals(this.asyncIOEnabled, getStateResponseData.asyncIOEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, fastAPIEnabled, objectCacheEnabled, multiIdpSupport, cometEngine, asyncIOEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStateResponseData {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    fastAPIEnabled: ").append(toIndentedString(fastAPIEnabled)).append("\n");
    sb.append("    objectCacheEnabled: ").append(toIndentedString(objectCacheEnabled)).append("\n");
    sb.append("    multiIdpSupport: ").append(toIndentedString(multiIdpSupport)).append("\n");
    sb.append("    cometEngine: ").append(toIndentedString(cometEngine)).append("\n");
    sb.append("    asyncIOEnabled: ").append(toIndentedString(asyncIOEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

