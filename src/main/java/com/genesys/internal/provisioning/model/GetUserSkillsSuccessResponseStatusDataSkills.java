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
 * GetUserSkillsSuccessResponseStatusDataSkills
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-06T13:04:19.470Z")
public class GetUserSkillsSuccessResponseStatusDataSkills {
  @SerializedName("DBID")
  private String DBID = null;

  @SerializedName("name")
  private String name = null;

  public GetUserSkillsSuccessResponseStatusDataSkills DBID(String DBID) {
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

  public GetUserSkillsSuccessResponseStatusDataSkills name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserSkillsSuccessResponseStatusDataSkills getUserSkillsSuccessResponseStatusDataSkills = (GetUserSkillsSuccessResponseStatusDataSkills) o;
    return Objects.equals(this.DBID, getUserSkillsSuccessResponseStatusDataSkills.DBID) &&
        Objects.equals(this.name, getUserSkillsSuccessResponseStatusDataSkills.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DBID, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserSkillsSuccessResponseStatusDataSkills {\n");
    
    sb.append("    DBID: ").append(toIndentedString(DBID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

