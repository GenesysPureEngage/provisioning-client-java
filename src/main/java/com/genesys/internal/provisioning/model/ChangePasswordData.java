/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.877
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
 * ChangePasswordData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-08T17:04:16.211Z")
public class ChangePasswordData {
  @SerializedName("domain_username")
  private String domainUsername = null;

  @SerializedName("oldPassword")
  private String oldPassword = null;

  @SerializedName("newPassword")
  private String newPassword = null;

  public ChangePasswordData domainUsername(String domainUsername) {
    this.domainUsername = domainUsername;
    return this;
  }

   /**
   * User unique login in form: domain.com\\login 
   * @return domainUsername
  **/
  @ApiModelProperty(required = true, value = "User unique login in form: domain.com\\login ")
  public String getDomainUsername() {
    return domainUsername;
  }

  public void setDomainUsername(String domainUsername) {
    this.domainUsername = domainUsername;
  }

  public ChangePasswordData oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Old password as plain text. 
   * @return oldPassword
  **/
  @ApiModelProperty(required = true, value = "Old password as plain text. ")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public ChangePasswordData newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New password as plain text. 
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "New password as plain text. ")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordData changePasswordData = (ChangePasswordData) o;
    return Objects.equals(this.domainUsername, changePasswordData.domainUsername) &&
        Objects.equals(this.oldPassword, changePasswordData.oldPassword) &&
        Objects.equals(this.newPassword, changePasswordData.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainUsername, oldPassword, newPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordData {\n");
    
    sb.append("    domainUsername: ").append(toIndentedString(domainUsername)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

