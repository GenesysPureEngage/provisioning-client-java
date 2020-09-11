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
import com.genesys.internal.provisioning.model.GetAuditResponseMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * GetAuditResponseRows
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-09T20:06:47.736Z")
public class GetAuditResponseRows {
  @SerializedName("createdat")
  private String createdat = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("message")
  private GetAuditResponseMessage message = null;

  public GetAuditResponseRows createdat(String createdat) {
    this.createdat = createdat;
    return this;
  }

   /**
   * Date when record creaded.
   * @return createdat
  **/
  @ApiModelProperty(value = "Date when record creaded.")
  public String getCreatedat() {
    return createdat;
  }

  public void setCreatedat(String createdat) {
    this.createdat = createdat;
  }

  public GetAuditResponseRows id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Record id.
   * @return id
  **/
  @ApiModelProperty(value = "Record id.")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public GetAuditResponseRows level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Record level.
   * @return level
  **/
  @ApiModelProperty(value = "Record level.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public GetAuditResponseRows msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Full message.
   * @return msg
  **/
  @ApiModelProperty(value = "Full message.")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public GetAuditResponseRows username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of User that created record.
   * @return username
  **/
  @ApiModelProperty(value = "Username of User that created record.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public GetAuditResponseRows message(GetAuditResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public GetAuditResponseMessage getMessage() {
    return message;
  }

  public void setMessage(GetAuditResponseMessage message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuditResponseRows getAuditResponseRows = (GetAuditResponseRows) o;
    return Objects.equals(this.createdat, getAuditResponseRows.createdat) &&
        Objects.equals(this.id, getAuditResponseRows.id) &&
        Objects.equals(this.level, getAuditResponseRows.level) &&
        Objects.equals(this.msg, getAuditResponseRows.msg) &&
        Objects.equals(this.username, getAuditResponseRows.username) &&
        Objects.equals(this.message, getAuditResponseRows.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdat, id, level, msg, username, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuditResponseRows {\n");
    
    sb.append("    createdat: ").append(toIndentedString(createdat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

