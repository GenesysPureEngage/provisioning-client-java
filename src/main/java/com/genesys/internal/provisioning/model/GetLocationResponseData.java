/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.79.4215
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
 * GetLocationResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-24T13:59:00.983Z")
public class GetLocationResponseData {
  @SerializedName("locations")
  private List<String> locations = null;

  public GetLocationResponseData locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public GetLocationResponseData addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * An array with all exist regions.
   * @return locations
  **/
  @ApiModelProperty(value = "An array with all exist regions.")
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLocationResponseData getLocationResponseData = (GetLocationResponseData) o;
    return Objects.equals(this.locations, getLocationResponseData.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLocationResponseData {\n");
    
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

