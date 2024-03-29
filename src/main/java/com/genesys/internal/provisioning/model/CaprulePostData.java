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
 * CaprulePostData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:44:33.854Z")
public class CaprulePostData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("mediaRules")
  private Object mediaRules = null;

  public CaprulePostData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * CfgScript name 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "CfgScript name ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CaprulePostData mediaRules(Object mediaRules) {
    this.mediaRules = mediaRules;
    return this;
  }

   /**
   * Key/values pairs where keys are media types and vaules are objects representing logical expressions for their capacities 
   * @return mediaRules
  **/
  @ApiModelProperty(value = "Key/values pairs where keys are media types and vaules are objects representing logical expressions for their capacities ")
  public Object getMediaRules() {
    return mediaRules;
  }

  public void setMediaRules(Object mediaRules) {
    this.mediaRules = mediaRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaprulePostData caprulePostData = (CaprulePostData) o;
    return Objects.equals(this.name, caprulePostData.name) &&
        Objects.equals(this.mediaRules, caprulePostData.mediaRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mediaRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaprulePostData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaRules: ").append(toIndentedString(mediaRules)).append("\n");
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

