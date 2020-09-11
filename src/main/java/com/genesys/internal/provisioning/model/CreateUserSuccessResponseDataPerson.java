/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.85.4562
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.provisioning.model.CreateUserSuccessResponseDataPersonCfgAgentInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateUserSuccessResponseDataPerson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-09T20:06:47.736Z")
public class CreateUserSuccessResponseDataPerson {
  @SerializedName("DBID")
  private String DBID = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isAdmin")
  private String isAdmin = null;

  @SerializedName("isAgent")
  private String isAgent = null;

  @SerializedName("isExternalAuth")
  private String isExternalAuth = null;

  @SerializedName("passwordHashAlgorithm")
  private String passwordHashAlgorithm = null;

  @SerializedName("PasswordUpdatingDate")
  private String passwordUpdatingDate = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("employeeID")
  private String employeeID = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("tenantDBID")
  private String tenantDBID = null;

  @SerializedName("changePasswordOnNextLogin")
  private String changePasswordOnNextLogin = null;

  @SerializedName("CfgAgentInfo")
  private CreateUserSuccessResponseDataPersonCfgAgentInfo cfgAgentInfo = null;

  public CreateUserSuccessResponseDataPerson DBID(String DBID) {
    this.DBID = DBID;
    return this;
  }

   /**
   * Get DBID
   * @return DBID
  **/
  @ApiModelProperty(value = "")
  public String getDBID() {
    return DBID;
  }

  public void setDBID(String DBID) {
    this.DBID = DBID;
  }

  public CreateUserSuccessResponseDataPerson id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateUserSuccessResponseDataPerson isAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "")
  public String getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

  public CreateUserSuccessResponseDataPerson isAgent(String isAgent) {
    this.isAgent = isAgent;
    return this;
  }

   /**
   * Get isAgent
   * @return isAgent
  **/
  @ApiModelProperty(value = "")
  public String getIsAgent() {
    return isAgent;
  }

  public void setIsAgent(String isAgent) {
    this.isAgent = isAgent;
  }

  public CreateUserSuccessResponseDataPerson isExternalAuth(String isExternalAuth) {
    this.isExternalAuth = isExternalAuth;
    return this;
  }

   /**
   * Get isExternalAuth
   * @return isExternalAuth
  **/
  @ApiModelProperty(value = "")
  public String getIsExternalAuth() {
    return isExternalAuth;
  }

  public void setIsExternalAuth(String isExternalAuth) {
    this.isExternalAuth = isExternalAuth;
  }

  public CreateUserSuccessResponseDataPerson passwordHashAlgorithm(String passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

   /**
   * Get passwordHashAlgorithm
   * @return passwordHashAlgorithm
  **/
  @ApiModelProperty(value = "")
  public String getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(String passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public CreateUserSuccessResponseDataPerson passwordUpdatingDate(String passwordUpdatingDate) {
    this.passwordUpdatingDate = passwordUpdatingDate;
    return this;
  }

   /**
   * Get passwordUpdatingDate
   * @return passwordUpdatingDate
  **/
  @ApiModelProperty(value = "")
  public String getPasswordUpdatingDate() {
    return passwordUpdatingDate;
  }

  public void setPasswordUpdatingDate(String passwordUpdatingDate) {
    this.passwordUpdatingDate = passwordUpdatingDate;
  }

  public CreateUserSuccessResponseDataPerson state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CreateUserSuccessResponseDataPerson employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Get employeeID
   * @return employeeID
  **/
  @ApiModelProperty(value = "")
  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public CreateUserSuccessResponseDataPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateUserSuccessResponseDataPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateUserSuccessResponseDataPerson userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CreateUserSuccessResponseDataPerson emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CreateUserSuccessResponseDataPerson password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserSuccessResponseDataPerson tenantDBID(String tenantDBID) {
    this.tenantDBID = tenantDBID;
    return this;
  }

   /**
   * Get tenantDBID
   * @return tenantDBID
  **/
  @ApiModelProperty(value = "")
  public String getTenantDBID() {
    return tenantDBID;
  }

  public void setTenantDBID(String tenantDBID) {
    this.tenantDBID = tenantDBID;
  }

  public CreateUserSuccessResponseDataPerson changePasswordOnNextLogin(String changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    return this;
  }

   /**
   * Get changePasswordOnNextLogin
   * @return changePasswordOnNextLogin
  **/
  @ApiModelProperty(value = "")
  public String getChangePasswordOnNextLogin() {
    return changePasswordOnNextLogin;
  }

  public void setChangePasswordOnNextLogin(String changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
  }

  public CreateUserSuccessResponseDataPerson cfgAgentInfo(CreateUserSuccessResponseDataPersonCfgAgentInfo cfgAgentInfo) {
    this.cfgAgentInfo = cfgAgentInfo;
    return this;
  }

   /**
   * Get cfgAgentInfo
   * @return cfgAgentInfo
  **/
  @ApiModelProperty(value = "")
  public CreateUserSuccessResponseDataPersonCfgAgentInfo getCfgAgentInfo() {
    return cfgAgentInfo;
  }

  public void setCfgAgentInfo(CreateUserSuccessResponseDataPersonCfgAgentInfo cfgAgentInfo) {
    this.cfgAgentInfo = cfgAgentInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserSuccessResponseDataPerson createUserSuccessResponseDataPerson = (CreateUserSuccessResponseDataPerson) o;
    return Objects.equals(this.DBID, createUserSuccessResponseDataPerson.DBID) &&
        Objects.equals(this.id, createUserSuccessResponseDataPerson.id) &&
        Objects.equals(this.isAdmin, createUserSuccessResponseDataPerson.isAdmin) &&
        Objects.equals(this.isAgent, createUserSuccessResponseDataPerson.isAgent) &&
        Objects.equals(this.isExternalAuth, createUserSuccessResponseDataPerson.isExternalAuth) &&
        Objects.equals(this.passwordHashAlgorithm, createUserSuccessResponseDataPerson.passwordHashAlgorithm) &&
        Objects.equals(this.passwordUpdatingDate, createUserSuccessResponseDataPerson.passwordUpdatingDate) &&
        Objects.equals(this.state, createUserSuccessResponseDataPerson.state) &&
        Objects.equals(this.employeeID, createUserSuccessResponseDataPerson.employeeID) &&
        Objects.equals(this.firstName, createUserSuccessResponseDataPerson.firstName) &&
        Objects.equals(this.lastName, createUserSuccessResponseDataPerson.lastName) &&
        Objects.equals(this.userName, createUserSuccessResponseDataPerson.userName) &&
        Objects.equals(this.emailAddress, createUserSuccessResponseDataPerson.emailAddress) &&
        Objects.equals(this.password, createUserSuccessResponseDataPerson.password) &&
        Objects.equals(this.tenantDBID, createUserSuccessResponseDataPerson.tenantDBID) &&
        Objects.equals(this.changePasswordOnNextLogin, createUserSuccessResponseDataPerson.changePasswordOnNextLogin) &&
        Objects.equals(this.cfgAgentInfo, createUserSuccessResponseDataPerson.cfgAgentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DBID, id, isAdmin, isAgent, isExternalAuth, passwordHashAlgorithm, passwordUpdatingDate, state, employeeID, firstName, lastName, userName, emailAddress, password, tenantDBID, changePasswordOnNextLogin, cfgAgentInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserSuccessResponseDataPerson {\n");
    
    sb.append("    DBID: ").append(toIndentedString(DBID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isAgent: ").append(toIndentedString(isAgent)).append("\n");
    sb.append("    isExternalAuth: ").append(toIndentedString(isExternalAuth)).append("\n");
    sb.append("    passwordHashAlgorithm: ").append(toIndentedString(passwordHashAlgorithm)).append("\n");
    sb.append("    passwordUpdatingDate: ").append(toIndentedString(passwordUpdatingDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tenantDBID: ").append(toIndentedString(tenantDBID)).append("\n");
    sb.append("    changePasswordOnNextLogin: ").append(toIndentedString(changePasswordOnNextLogin)).append("\n");
    sb.append("    cfgAgentInfo: ").append(toIndentedString(cfgAgentInfo)).append("\n");
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

