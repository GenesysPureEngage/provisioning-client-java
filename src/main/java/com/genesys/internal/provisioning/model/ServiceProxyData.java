/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.18.2300
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ServiceProxyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T21:13:44.154Z")
public class ServiceProxyData {
  @SerializedName("service")
  private String service = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("args")
  private Object args = null;

  public ServiceProxyData service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Service name
   * @return service
  **/
  @ApiModelProperty(required = true, value = "Service name")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ServiceProxyData method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Method name
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method name")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ServiceProxyData args(Object args) {
    this.args = args;
    return this;
  }

   /**
   * Optional method arguments array
   * @return args
  **/
  @ApiModelProperty(value = "Optional method arguments array")
  public Object getArgs() {
    return args;
  }

  public void setArgs(Object args) {
    this.args = args;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProxyData serviceProxyData = (ServiceProxyData) o;
    return Objects.equals(this.service, serviceProxyData.service) &&
        Objects.equals(this.method, serviceProxyData.method) &&
        Objects.equals(this.args, serviceProxyData.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, method, args);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProxyData {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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

