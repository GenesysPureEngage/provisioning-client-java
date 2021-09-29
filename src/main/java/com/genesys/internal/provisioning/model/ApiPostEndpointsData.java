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
 * ApiPostEndpointsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-24T20:41:05.788Z")
public class ApiPostEndpointsData {
  @SerializedName("apiEndpoints")
  private Object apiEndpoints = null;

  public ApiPostEndpointsData apiEndpoints(Object apiEndpoints) {
    this.apiEndpoints = apiEndpoints;
    return this;
  }

   /**
   * settings endpoints.
   * @return apiEndpoints
  **/
  @ApiModelProperty(value = "settings endpoints.")
  public Object getApiEndpoints() {
    return apiEndpoints;
  }

  public void setApiEndpoints(Object apiEndpoints) {
    this.apiEndpoints = apiEndpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPostEndpointsData apiPostEndpointsData = (ApiPostEndpointsData) o;
    return Objects.equals(this.apiEndpoints, apiPostEndpointsData.apiEndpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiEndpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPostEndpointsData {\n");
    
    sb.append("    apiEndpoints: ").append(toIndentedString(apiEndpoints)).append("\n");
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

