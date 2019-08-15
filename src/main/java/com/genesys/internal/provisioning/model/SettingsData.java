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
 * SettingsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-15T18:48:36.605Z")
public class SettingsData {
  @SerializedName("useExternalUserId")
  private Boolean useExternalUserId = null;

  @SerializedName("accessGroups")
  private List<String> accessGroups = null;

  @SerializedName("serviceProviderBaseURL")
  private String serviceProviderBaseURL = null;

  public SettingsData useExternalUserId(Boolean useExternalUserId) {
    this.useExternalUserId = useExternalUserId;
    return this;
  }

   /**
   * Defines if uses ExternalUserId.
   * @return useExternalUserId
  **/
  @ApiModelProperty(value = "Defines if uses ExternalUserId.")
  public Boolean isUseExternalUserId() {
    return useExternalUserId;
  }

  public void setUseExternalUserId(Boolean useExternalUserId) {
    this.useExternalUserId = useExternalUserId;
  }

  public SettingsData accessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
    return this;
  }

  public SettingsData addAccessGroupsItem(String accessGroupsItem) {
    if (this.accessGroups == null) {
      this.accessGroups = new ArrayList<String>();
    }
    this.accessGroups.add(accessGroupsItem);
    return this;
  }

   /**
   * Defines which Access Groups use SAML.
   * @return accessGroups
  **/
  @ApiModelProperty(value = "Defines which Access Groups use SAML.")
  public List<String> getAccessGroups() {
    return accessGroups;
  }

  public void setAccessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
  }

  public SettingsData serviceProviderBaseURL(String serviceProviderBaseURL) {
    this.serviceProviderBaseURL = serviceProviderBaseURL;
    return this;
  }

   /**
   * Defines Service Provider Base URL.
   * @return serviceProviderBaseURL
  **/
  @ApiModelProperty(value = "Defines Service Provider Base URL.")
  public String getServiceProviderBaseURL() {
    return serviceProviderBaseURL;
  }

  public void setServiceProviderBaseURL(String serviceProviderBaseURL) {
    this.serviceProviderBaseURL = serviceProviderBaseURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsData settingsData = (SettingsData) o;
    return Objects.equals(this.useExternalUserId, settingsData.useExternalUserId) &&
        Objects.equals(this.accessGroups, settingsData.accessGroups) &&
        Objects.equals(this.serviceProviderBaseURL, settingsData.serviceProviderBaseURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useExternalUserId, accessGroups, serviceProviderBaseURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsData {\n");
    
    sb.append("    useExternalUserId: ").append(toIndentedString(useExternalUserId)).append("\n");
    sb.append("    accessGroups: ").append(toIndentedString(accessGroups)).append("\n");
    sb.append("    serviceProviderBaseURL: ").append(toIndentedString(serviceProviderBaseURL)).append("\n");
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

