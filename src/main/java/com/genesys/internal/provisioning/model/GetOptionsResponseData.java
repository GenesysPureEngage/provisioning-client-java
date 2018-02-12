/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.08.1664
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
 * GetOptionsResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T23:17:01.762Z")
public class GetOptionsResponseData {
  @SerializedName("options")
  private Object options = null;

  @SerializedName("cmeAppName")
  private String cmeAppName = null;

  @SerializedName("cmeAppDBID")
  private String cmeAppDBID = null;

  public GetOptionsResponseData options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * The option sections, keys and values for the specified application.
   * @return options
  **/
  @ApiModelProperty(value = "The option sections, keys and values for the specified application.")
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }

  public GetOptionsResponseData cmeAppName(String cmeAppName) {
    this.cmeAppName = cmeAppName;
    return this;
  }

   /**
   * The name of the application.
   * @return cmeAppName
  **/
  @ApiModelProperty(value = "The name of the application.")
  public String getCmeAppName() {
    return cmeAppName;
  }

  public void setCmeAppName(String cmeAppName) {
    this.cmeAppName = cmeAppName;
  }

  public GetOptionsResponseData cmeAppDBID(String cmeAppDBID) {
    this.cmeAppDBID = cmeAppDBID;
    return this;
  }

   /**
   * The DBID of the application.
   * @return cmeAppDBID
  **/
  @ApiModelProperty(value = "The DBID of the application.")
  public String getCmeAppDBID() {
    return cmeAppDBID;
  }

  public void setCmeAppDBID(String cmeAppDBID) {
    this.cmeAppDBID = cmeAppDBID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOptionsResponseData getOptionsResponseData = (GetOptionsResponseData) o;
    return Objects.equals(this.options, getOptionsResponseData.options) &&
        Objects.equals(this.cmeAppName, getOptionsResponseData.cmeAppName) &&
        Objects.equals(this.cmeAppDBID, getOptionsResponseData.cmeAppDBID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, cmeAppName, cmeAppDBID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOptionsResponseData {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    cmeAppName: ").append(toIndentedString(cmeAppName)).append("\n");
    sb.append("    cmeAppDBID: ").append(toIndentedString(cmeAppDBID)).append("\n");
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

