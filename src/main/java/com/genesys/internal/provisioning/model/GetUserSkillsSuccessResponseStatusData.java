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
import com.genesys.internal.provisioning.model.GetUserSkillsSuccessResponseStatusDataSkills;
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
 * GetUserSkillsSuccessResponseStatusData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T23:59:45.181Z")
public class GetUserSkillsSuccessResponseStatusData {
  @SerializedName("skills")
  private List<GetUserSkillsSuccessResponseStatusDataSkills> skills = null;

  public GetUserSkillsSuccessResponseStatusData skills(List<GetUserSkillsSuccessResponseStatusDataSkills> skills) {
    this.skills = skills;
    return this;
  }

  public GetUserSkillsSuccessResponseStatusData addSkillsItem(GetUserSkillsSuccessResponseStatusDataSkills skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<GetUserSkillsSuccessResponseStatusDataSkills>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * skills assigned to any user. Available if dbid parameter is equal to &#39;skills&#39;.
   * @return skills
  **/
  @ApiModelProperty(value = "skills assigned to any user. Available if dbid parameter is equal to 'skills'.")
  public List<GetUserSkillsSuccessResponseStatusDataSkills> getSkills() {
    return skills;
  }

  public void setSkills(List<GetUserSkillsSuccessResponseStatusDataSkills> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserSkillsSuccessResponseStatusData getUserSkillsSuccessResponseStatusData = (GetUserSkillsSuccessResponseStatusData) o;
    return Objects.equals(this.skills, getUserSkillsSuccessResponseStatusData.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skills);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserSkillsSuccessResponseStatusData {\n");
    
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

