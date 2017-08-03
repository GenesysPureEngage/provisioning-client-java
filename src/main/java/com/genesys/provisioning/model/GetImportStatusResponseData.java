/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model.  The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.722
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.provisioning.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * GetImportStatusResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T11:23:05.378Z")
public class GetImportStatusResponseData {
  @SerializedName("activeImporters")
  private List<String> activeImporters = new ArrayList<String>();

  @SerializedName("adminName")
  private String adminName = null;

  @SerializedName("failed")
  private List<String> failed = new ArrayList<String>();

  @SerializedName("lastEntity")
  private String lastEntity = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("sheetName")
  private String sheetName = null;

  @SerializedName("stopRequested")
  private Boolean stopRequested = null;

  @SerializedName("stopped")
  private Boolean stopped = null;

  @SerializedName("succeedCount")
  private BigDecimal succeedCount = null;

  @SerializedName("totalCount")
  private BigDecimal totalCount = null;

  public GetImportStatusResponseData activeImporters(List<String> activeImporters) {
    this.activeImporters = activeImporters;
    return this;
  }

  public GetImportStatusResponseData addActiveImportersItem(String activeImportersItem) {
    this.activeImporters.add(activeImportersItem);
    return this;
  }

   /**
   * Active importers IDs.
   * @return activeImporters
  **/
  @ApiModelProperty(example = "null", value = "Active importers IDs.")
  public List<String> getActiveImporters() {
    return activeImporters;
  }

  public void setActiveImporters(List<String> activeImporters) {
    this.activeImporters = activeImporters;
  }

  public GetImportStatusResponseData adminName(String adminName) {
    this.adminName = adminName;
    return this;
  }

   /**
   * Admin login.
   * @return adminName
  **/
  @ApiModelProperty(example = "null", value = "Admin login.")
  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public GetImportStatusResponseData failed(List<String> failed) {
    this.failed = failed;
    return this;
  }

  public GetImportStatusResponseData addFailedItem(String failedItem) {
    this.failed.add(failedItem);
    return this;
  }

   /**
   * Array of errors during import.
   * @return failed
  **/
  @ApiModelProperty(example = "null", value = "Array of errors during import.")
  public List<String> getFailed() {
    return failed;
  }

  public void setFailed(List<String> failed) {
    this.failed = failed;
  }

  public GetImportStatusResponseData lastEntity(String lastEntity) {
    this.lastEntity = lastEntity;
    return this;
  }

   /**
   * Last object name processed.
   * @return lastEntity
  **/
  @ApiModelProperty(example = "null", value = "Last object name processed.")
  public String getLastEntity() {
    return lastEntity;
  }

  public void setLastEntity(String lastEntity) {
    this.lastEntity = lastEntity;
  }

  public GetImportStatusResponseData operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Current operation.
   * @return operation
  **/
  @ApiModelProperty(example = "null", value = "Current operation.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public GetImportStatusResponseData sheetName(String sheetName) {
    this.sheetName = sheetName;
    return this;
  }

   /**
   * Sheet name processed.
   * @return sheetName
  **/
  @ApiModelProperty(example = "null", value = "Sheet name processed.")
  public String getSheetName() {
    return sheetName;
  }

  public void setSheetName(String sheetName) {
    this.sheetName = sheetName;
  }

  public GetImportStatusResponseData stopRequested(Boolean stopRequested) {
    this.stopRequested = stopRequested;
    return this;
  }

   /**
   * true if user pressed Stop Import
   * @return stopRequested
  **/
  @ApiModelProperty(example = "null", value = "true if user pressed Stop Import")
  public Boolean getStopRequested() {
    return stopRequested;
  }

  public void setStopRequested(Boolean stopRequested) {
    this.stopRequested = stopRequested;
  }

  public GetImportStatusResponseData stopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

   /**
   * true if import stopped.
   * @return stopped
  **/
  @ApiModelProperty(example = "null", value = "true if import stopped.")
  public Boolean getStopped() {
    return stopped;
  }

  public void setStopped(Boolean stopped) {
    this.stopped = stopped;
  }

  public GetImportStatusResponseData succeedCount(BigDecimal succeedCount) {
    this.succeedCount = succeedCount;
    return this;
  }

   /**
   * Number of records processed successfully.
   * @return succeedCount
  **/
  @ApiModelProperty(example = "null", value = "Number of records processed successfully.")
  public BigDecimal getSucceedCount() {
    return succeedCount;
  }

  public void setSucceedCount(BigDecimal succeedCount) {
    this.succeedCount = succeedCount;
  }

  public GetImportStatusResponseData totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Number of records processed total.
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "Number of records processed total.")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImportStatusResponseData getImportStatusResponseData = (GetImportStatusResponseData) o;
    return Objects.equals(this.activeImporters, getImportStatusResponseData.activeImporters) &&
        Objects.equals(this.adminName, getImportStatusResponseData.adminName) &&
        Objects.equals(this.failed, getImportStatusResponseData.failed) &&
        Objects.equals(this.lastEntity, getImportStatusResponseData.lastEntity) &&
        Objects.equals(this.operation, getImportStatusResponseData.operation) &&
        Objects.equals(this.sheetName, getImportStatusResponseData.sheetName) &&
        Objects.equals(this.stopRequested, getImportStatusResponseData.stopRequested) &&
        Objects.equals(this.stopped, getImportStatusResponseData.stopped) &&
        Objects.equals(this.succeedCount, getImportStatusResponseData.succeedCount) &&
        Objects.equals(this.totalCount, getImportStatusResponseData.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeImporters, adminName, failed, lastEntity, operation, sheetName, stopRequested, stopped, succeedCount, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImportStatusResponseData {\n");
    
    sb.append("    activeImporters: ").append(toIndentedString(activeImporters)).append("\n");
    sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    lastEntity: ").append(toIndentedString(lastEntity)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
    sb.append("    stopRequested: ").append(toIndentedString(stopRequested)).append("\n");
    sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
    sb.append("    succeedCount: ").append(toIndentedString(succeedCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

