/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.840
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
import java.util.ArrayList;
import java.util.List;

/**
 * GetObjectsSuccessResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-24T13:16:55.957Z")
public class GetObjectsSuccessResponseData {
  @SerializedName("dns")
  private List<Object> dns = null;

  @SerializedName("agent-groups")
  private List<Object> agentGroups = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  public GetObjectsSuccessResponseData dns(List<Object> dns) {
    this.dns = dns;
    return this;
  }

  public GetObjectsSuccessResponseData addDnsItem(Object dnsItem) {
    if (this.dns == null) {
      this.dns = new ArrayList<Object>();
    }
    this.dns.add(dnsItem);
    return this;
  }

   /**
   * List of DN objects fetched
   * @return dns
  **/
  @ApiModelProperty(value = "List of DN objects fetched")
  public List<Object> getDns() {
    return dns;
  }

  public void setDns(List<Object> dns) {
    this.dns = dns;
  }

  public GetObjectsSuccessResponseData agentGroups(List<Object> agentGroups) {
    this.agentGroups = agentGroups;
    return this;
  }

  public GetObjectsSuccessResponseData addAgentGroupsItem(Object agentGroupsItem) {
    if (this.agentGroups == null) {
      this.agentGroups = new ArrayList<Object>();
    }
    this.agentGroups.add(agentGroupsItem);
    return this;
  }

   /**
   * List of Agent Group objects fetched.
   * @return agentGroups
  **/
  @ApiModelProperty(value = "List of Agent Group objects fetched.")
  public List<Object> getAgentGroups() {
    return agentGroups;
  }

  public void setAgentGroups(List<Object> agentGroups) {
    this.agentGroups = agentGroups;
  }

  public GetObjectsSuccessResponseData totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of object.
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of object.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
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
    GetObjectsSuccessResponseData getObjectsSuccessResponseData = (GetObjectsSuccessResponseData) o;
    return Objects.equals(this.dns, getObjectsSuccessResponseData.dns) &&
        Objects.equals(this.agentGroups, getObjectsSuccessResponseData.agentGroups) &&
        Objects.equals(this.totalCount, getObjectsSuccessResponseData.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns, agentGroups, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetObjectsSuccessResponseData {\n");
    
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    agentGroups: ").append(toIndentedString(agentGroups)).append("\n");
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
