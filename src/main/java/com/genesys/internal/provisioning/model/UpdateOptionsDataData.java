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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateOptionsDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:44:33.854Z")
public class UpdateOptionsDataData {
  @SerializedName("application")
  private String application = null;

  @SerializedName("newOptions")
  private Object newOptions = null;

  @SerializedName("changedOptions")
  private Object changedOptions = null;

  @SerializedName("deletedOptions")
  private Object deletedOptions = null;

  public UpdateOptionsDataData application(String application) {
    this.application = application;
    return this;
  }

   /**
   * The name of the application where the options should be updated. This value is set to &#x60;CloudCluster&#x60; by default. 
   * @return application
  **/
  @ApiModelProperty(value = "The name of the application where the options should be updated. This value is set to `CloudCluster` by default. ")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public UpdateOptionsDataData newOptions(Object newOptions) {
    this.newOptions = newOptions;
    return this;
  }

   /**
   * The options to add in the application. 
   * @return newOptions
  **/
  @ApiModelProperty(value = "The options to add in the application. ")
  public Object getNewOptions() {
    return newOptions;
  }

  public void setNewOptions(Object newOptions) {
    this.newOptions = newOptions;
  }

  public UpdateOptionsDataData changedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
    return this;
  }

   /**
   * The option values to update in the application. 
   * @return changedOptions
  **/
  @ApiModelProperty(value = "The option values to update in the application. ")
  public Object getChangedOptions() {
    return changedOptions;
  }

  public void setChangedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
  }

  public UpdateOptionsDataData deletedOptions(Object deletedOptions) {
    this.deletedOptions = deletedOptions;
    return this;
  }

   /**
   * The options to delete in the application. 
   * @return deletedOptions
  **/
  @ApiModelProperty(value = "The options to delete in the application. ")
  public Object getDeletedOptions() {
    return deletedOptions;
  }

  public void setDeletedOptions(Object deletedOptions) {
    this.deletedOptions = deletedOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOptionsDataData updateOptionsDataData = (UpdateOptionsDataData) o;
    return Objects.equals(this.application, updateOptionsDataData.application) &&
        Objects.equals(this.newOptions, updateOptionsDataData.newOptions) &&
        Objects.equals(this.changedOptions, updateOptionsDataData.changedOptions) &&
        Objects.equals(this.deletedOptions, updateOptionsDataData.deletedOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, newOptions, changedOptions, deletedOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOptionsDataData {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    newOptions: ").append(toIndentedString(newOptions)).append("\n");
    sb.append("    changedOptions: ").append(toIndentedString(changedOptions)).append("\n");
    sb.append("    deletedOptions: ").append(toIndentedString(deletedOptions)).append("\n");
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

