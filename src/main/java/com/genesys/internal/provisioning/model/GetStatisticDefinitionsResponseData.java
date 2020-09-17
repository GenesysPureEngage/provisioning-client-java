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
 * GetStatisticDefinitionsResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-17T14:40:57.389Z")
public class GetStatisticDefinitionsResponseData {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("statisticDefinitions")
  private Object statisticDefinitions = null;

  public GetStatisticDefinitionsResponseData statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Returns status coed of operation.
   * @return statusCode
  **/
  @ApiModelProperty(value = "Returns status coed of operation.")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public GetStatisticDefinitionsResponseData statisticDefinitions(Object statisticDefinitions) {
    this.statisticDefinitions = statisticDefinitions;
    return this;
  }

   /**
   * Returns statistic.
   * @return statisticDefinitions
  **/
  @ApiModelProperty(value = "Returns statistic.")
  public Object getStatisticDefinitions() {
    return statisticDefinitions;
  }

  public void setStatisticDefinitions(Object statisticDefinitions) {
    this.statisticDefinitions = statisticDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatisticDefinitionsResponseData getStatisticDefinitionsResponseData = (GetStatisticDefinitionsResponseData) o;
    return Objects.equals(this.statusCode, getStatisticDefinitionsResponseData.statusCode) &&
        Objects.equals(this.statisticDefinitions, getStatisticDefinitionsResponseData.statisticDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statisticDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatisticDefinitionsResponseData {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statisticDefinitions: ").append(toIndentedString(statisticDefinitions)).append("\n");
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

