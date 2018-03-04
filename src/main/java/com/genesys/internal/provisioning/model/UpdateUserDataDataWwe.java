/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.08.1664
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
 * Properties related to Workspace Web Edition. 
 */
@ApiModel(description = "Properties related to Workspace Web Edition. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-04T19:04:45.803Z")
public class UpdateUserDataDataWwe {
  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("deletedRoles")
  private List<String> deletedRoles = null;

  public UpdateUserDataDataWwe roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UpdateUserDataDataWwe addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The roles that are added to the user. 
   * @return roles
  **/
  @ApiModelProperty(value = "The roles that are added to the user. ")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public UpdateUserDataDataWwe deletedRoles(List<String> deletedRoles) {
    this.deletedRoles = deletedRoles;
    return this;
  }

  public UpdateUserDataDataWwe addDeletedRolesItem(String deletedRolesItem) {
    if (this.deletedRoles == null) {
      this.deletedRoles = new ArrayList<String>();
    }
    this.deletedRoles.add(deletedRolesItem);
    return this;
  }

   /**
   * The roles that are removed from the user. 
   * @return deletedRoles
  **/
  @ApiModelProperty(value = "The roles that are removed from the user. ")
  public List<String> getDeletedRoles() {
    return deletedRoles;
  }

  public void setDeletedRoles(List<String> deletedRoles) {
    this.deletedRoles = deletedRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserDataDataWwe updateUserDataDataWwe = (UpdateUserDataDataWwe) o;
    return Objects.equals(this.roles, updateUserDataDataWwe.roles) &&
        Objects.equals(this.deletedRoles, updateUserDataDataWwe.deletedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, deletedRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserDataDataWwe {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    deletedRoles: ").append(toIndentedString(deletedRoles)).append("\n");
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

