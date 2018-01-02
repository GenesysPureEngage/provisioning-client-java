/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.06.1279
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import com.genesys.internal.provisioning.model.ApiAuditSuccessResponseDataRows;
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
 * ApiAuditSuccessResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-02T15:04:47.562Z")
public class ApiAuditSuccessResponseData {
  @SerializedName("rows")
  private List<ApiAuditSuccessResponseDataRows> rows = new ArrayList<ApiAuditSuccessResponseDataRows>();

  public ApiAuditSuccessResponseData rows(List<ApiAuditSuccessResponseDataRows> rows) {
    this.rows = rows;
    return this;
  }

  public ApiAuditSuccessResponseData addRowsItem(ApiAuditSuccessResponseDataRows rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ApiAuditSuccessResponseDataRows> getRows() {
    return rows;
  }

  public void setRows(List<ApiAuditSuccessResponseDataRows> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAuditSuccessResponseData apiAuditSuccessResponseData = (ApiAuditSuccessResponseData) o;
    return Objects.equals(this.rows, apiAuditSuccessResponseData.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAuditSuccessResponseData {\n");
    
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

