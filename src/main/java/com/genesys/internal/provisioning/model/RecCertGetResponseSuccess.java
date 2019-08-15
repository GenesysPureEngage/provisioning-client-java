/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.57.3612
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.provisioning.model.RecCertGetResponseStatusSuccess;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RecCertGetResponseSuccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-15T18:48:36.605Z")
public class RecCertGetResponseSuccess {
  @SerializedName("data")
  private List<Object> data = null;

  @SerializedName("status")
  private RecCertGetResponseStatusSuccess status = null;

  public RecCertGetResponseSuccess data(List<Object> data) {
    this.data = data;
    return this;
  }

  public RecCertGetResponseSuccess addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Object>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }

  public RecCertGetResponseSuccess status(RecCertGetResponseStatusSuccess status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public RecCertGetResponseStatusSuccess getStatus() {
    return status;
  }

  public void setStatus(RecCertGetResponseStatusSuccess status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecCertGetResponseSuccess recCertGetResponseSuccess = (RecCertGetResponseSuccess) o;
    return Objects.equals(this.data, recCertGetResponseSuccess.data) &&
        Objects.equals(this.status, recCertGetResponseSuccess.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecCertGetResponseSuccess {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

