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

/**
 * DeleteUserData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-23T19:23:00.230Z")
public class DeleteUserData {
  @SerializedName("keep_places")
  private Boolean keepPlaces = null;

  public DeleteUserData keepPlaces(Boolean keepPlaces) {
    this.keepPlaces = keepPlaces;
    return this;
  }

   /**
   * If 'true' or absent, user's places and their DNs will not be deleted Effect: Controls if user's places and their DNs will be deleted 
   * @return keepPlaces
  **/
  @ApiModelProperty(example = "null", value = "If 'true' or absent, user's places and their DNs will not be deleted Effect: Controls if user's places and their DNs will be deleted ")
  public Boolean getKeepPlaces() {
    return keepPlaces;
  }

  public void setKeepPlaces(Boolean keepPlaces) {
    this.keepPlaces = keepPlaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUserData deleteUserData = (DeleteUserData) o;
    return Objects.equals(this.keepPlaces, deleteUserData.keepPlaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepPlaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserData {\n");
    
    sb.append("    keepPlaces: ").append(toIndentedString(keepPlaces)).append("\n");
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

