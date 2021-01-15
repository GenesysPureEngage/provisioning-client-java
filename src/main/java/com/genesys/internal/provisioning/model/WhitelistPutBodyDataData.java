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
 * WhitelistPutBodyDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-08T16:07:06.990Z")
public class WhitelistPutBodyDataData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("address")
  private String address = null;

  public WhitelistPutBodyDataData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of IP Address to update
   * @return id
  **/
  @ApiModelProperty(value = "ID of IP Address to update")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WhitelistPutBodyDataData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * New IP Address value
   * @return address
  **/
  @ApiModelProperty(value = "New IP Address value")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhitelistPutBodyDataData whitelistPutBodyDataData = (WhitelistPutBodyDataData) o;
    return Objects.equals(this.id, whitelistPutBodyDataData.id) &&
        Objects.equals(this.address, whitelistPutBodyDataData.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhitelistPutBodyDataData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

