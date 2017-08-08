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
import java.util.ArrayList;
import java.util.List;

/**
 * Map containing parameters to filter and sort users.  Effect: Only users passed the filter will be exported. 
 */
@ApiModel(description = "Map containing parameters to filter and sort users.  Effect: Only users passed the filter will be exported. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-08T19:23:02.551Z")
public class ExportFileDataFilterParameters {
  @SerializedName("agentGroupFilter")
  private List<String> agentGroupFilter = new ArrayList<String>();

  @SerializedName("order")
  private String order = null;

  @SerializedName("sortBy")
  private List<String> sortBy = new ArrayList<String>();

  @SerializedName("subresources")
  private String subresources = "skills,devices";

  public ExportFileDataFilterParameters agentGroupFilter(List<String> agentGroupFilter) {
    this.agentGroupFilter = agentGroupFilter;
    return this;
  }

  public ExportFileDataFilterParameters addAgentGroupFilterItem(String agentGroupFilterItem) {
    this.agentGroupFilter.add(agentGroupFilterItem);
    return this;
  }

   /**
   * Array of group names to which user should be included.
   * @return agentGroupFilter
  **/
  @ApiModelProperty(example = "null", value = "Array of group names to which user should be included.")
  public List<String> getAgentGroupFilter() {
    return agentGroupFilter;
  }

  public void setAgentGroupFilter(List<String> agentGroupFilter) {
    this.agentGroupFilter = agentGroupFilter;
  }

  public ExportFileDataFilterParameters order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Sort order - Ascending or Descending
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "Sort order - Ascending or Descending")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ExportFileDataFilterParameters sortBy(List<String> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public ExportFileDataFilterParameters addSortByItem(String sortByItem) {
    this.sortBy.add(sortByItem);
    return this;
  }

   /**
   * Comma-separated list of fields to sort on.
   * @return sortBy
  **/
  @ApiModelProperty(example = "null", value = "Comma-separated list of fields to sort on.")
  public List<String> getSortBy() {
    return sortBy;
  }

  public void setSortBy(List<String> sortBy) {
    this.sortBy = sortBy;
  }

  public ExportFileDataFilterParameters subresources(String subresources) {
    this.subresources = subresources;
    return this;
  }

   /**
   * Comma-separated list of subresources to include to export.
   * @return subresources
  **/
  @ApiModelProperty(example = "null", value = "Comma-separated list of subresources to include to export.")
  public String getSubresources() {
    return subresources;
  }

  public void setSubresources(String subresources) {
    this.subresources = subresources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportFileDataFilterParameters exportFileDataFilterParameters = (ExportFileDataFilterParameters) o;
    return Objects.equals(this.agentGroupFilter, exportFileDataFilterParameters.agentGroupFilter) &&
        Objects.equals(this.order, exportFileDataFilterParameters.order) &&
        Objects.equals(this.sortBy, exportFileDataFilterParameters.sortBy) &&
        Objects.equals(this.subresources, exportFileDataFilterParameters.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentGroupFilter, order, sortBy, subresources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportFileDataFilterParameters {\n");
    
    sb.append("    agentGroupFilter: ").append(toIndentedString(agentGroupFilter)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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

