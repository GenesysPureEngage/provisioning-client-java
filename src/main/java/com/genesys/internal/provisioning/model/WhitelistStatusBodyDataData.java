/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.85.4562
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
 * WhitelistStatusBodyDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-09T20:06:47.736Z")
public class WhitelistStatusBodyDataData {
  @SerializedName("whitelistStatus")
  private String whitelistStatus = null;

  public WhitelistStatusBodyDataData whitelistStatus(String whitelistStatus) {
    this.whitelistStatus = whitelistStatus;
    return this;
  }

   /**
   * Value of status to set.
   * @return whitelistStatus
  **/
  @ApiModelProperty(value = "Value of status to set.")
  public String getWhitelistStatus() {
    return whitelistStatus;
  }

  public void setWhitelistStatus(String whitelistStatus) {
    this.whitelistStatus = whitelistStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhitelistStatusBodyDataData whitelistStatusBodyDataData = (WhitelistStatusBodyDataData) o;
    return Objects.equals(this.whitelistStatus, whitelistStatusBodyDataData.whitelistStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhitelistStatusBodyDataData {\n");
    
    sb.append("    whitelistStatus: ").append(toIndentedString(whitelistStatus)).append("\n");
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

