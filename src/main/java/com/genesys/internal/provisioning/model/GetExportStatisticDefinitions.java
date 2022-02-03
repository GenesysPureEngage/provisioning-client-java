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
import com.genesys.internal.provisioning.model.CheckMigrateConflictsStatus;
import com.genesys.internal.provisioning.model.GetExportStatisticDefinitionsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetExportStatisticDefinitions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-27T00:26:09.820Z")
public class GetExportStatisticDefinitions {
  @SerializedName("status")
  private CheckMigrateConflictsStatus status = null;

  @SerializedName("data")
  private GetExportStatisticDefinitionsData data = null;

  public GetExportStatisticDefinitions status(CheckMigrateConflictsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public CheckMigrateConflictsStatus getStatus() {
    return status;
  }

  public void setStatus(CheckMigrateConflictsStatus status) {
    this.status = status;
  }

  public GetExportStatisticDefinitions data(GetExportStatisticDefinitionsData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public GetExportStatisticDefinitionsData getData() {
    return data;
  }

  public void setData(GetExportStatisticDefinitionsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExportStatisticDefinitions getExportStatisticDefinitions = (GetExportStatisticDefinitions) o;
    return Objects.equals(this.status, getExportStatisticDefinitions.status) &&
        Objects.equals(this.data, getExportStatisticDefinitions.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExportStatisticDefinitions {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

