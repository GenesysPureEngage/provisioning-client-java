/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.1086
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

/**
 * UpdateOptionsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-24T07:04:41.388Z")
public class UpdateOptionsData {
  @SerializedName("application")
  private String application = null;

  @SerializedName("newOptions")
  private Object newOptions = null;

  @SerializedName("changedOptions")
  private Object changedOptions = null;

  @SerializedName("deletedOptions")
  private Object deletedOptions = null;

  public UpdateOptionsData application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Application name to be updated. The CloudCluster app will be updated by default. 
   * @return application
  **/
  @ApiModelProperty(value = "Application name to be updated. The CloudCluster app will be updated by default. ")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public UpdateOptionsData newOptions(Object newOptions) {
    this.newOptions = newOptions;
    return this;
  }

   /**
   * New application Options.  Effect: Adds sections, keys and values in CloudCluster/Options 
   * @return newOptions
  **/
  @ApiModelProperty(value = "New application Options.  Effect: Adds sections, keys and values in CloudCluster/Options ")
  public Object getNewOptions() {
    return newOptions;
  }

  public void setNewOptions(Object newOptions) {
    this.newOptions = newOptions;
  }

  public UpdateOptionsData changedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
    return this;
  }

   /**
   * Changed application Options.  Effect: Updates existing values in CloudCluster/Options 
   * @return changedOptions
  **/
  @ApiModelProperty(value = "Changed application Options.  Effect: Updates existing values in CloudCluster/Options ")
  public Object getChangedOptions() {
    return changedOptions;
  }

  public void setChangedOptions(Object changedOptions) {
    this.changedOptions = changedOptions;
  }

  public UpdateOptionsData deletedOptions(Object deletedOptions) {
    this.deletedOptions = deletedOptions;
    return this;
  }

   /**
   * Deleted application Options.  Effect: Deletes sections, keys and values in CloudCluster/Options 
   * @return deletedOptions
  **/
  @ApiModelProperty(value = "Deleted application Options.  Effect: Deletes sections, keys and values in CloudCluster/Options ")
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
    UpdateOptionsData updateOptionsData = (UpdateOptionsData) o;
    return Objects.equals(this.application, updateOptionsData.application) &&
        Objects.equals(this.newOptions, updateOptionsData.newOptions) &&
        Objects.equals(this.changedOptions, updateOptionsData.changedOptions) &&
        Objects.equals(this.deletedOptions, updateOptionsData.deletedOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, newOptions, changedOptions, deletedOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOptionsData {\n");
    
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

