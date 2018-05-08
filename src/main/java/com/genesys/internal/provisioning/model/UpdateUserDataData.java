/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.15.2202
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import com.genesys.internal.provisioning.model.Extension;
import com.genesys.internal.provisioning.model.Skill;
import com.genesys.internal.provisioning.model.UpdateUserDataDataWwe;
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
 * UpdateUserDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-08T12:47:36.548Z")
public class UpdateUserDataData {
  @SerializedName("changePasswordOnNextLogin")
  private Boolean changePasswordOnNextLogin = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("employeeID")
  private String employeeID = null;

  @SerializedName("externalID")
  private String externalID = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("loginCode")
  private String loginCode = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("placeNames")
  private List<String> placeNames = null;

  @SerializedName("wwe")
  private UpdateUserDataDataWwe wwe = null;

  @SerializedName("switchNames")
  private List<String> switchNames = null;

  @SerializedName("deletedSwitchNames")
  private List<String> deletedSwitchNames = null;

  @SerializedName("phones")
  private List<Extension> phones = null;

  @SerializedName("supportSoftPhone")
  private Boolean supportSoftPhone = null;

  /**
   * Specifies the SIP phone type if you set the **supportSoftPhone** parameter to &#x60;true&#x60;. This specifies the SIP phone type and corresponding annex to be written to the DN&#39;s \&quot;TServer\&quot; section. 
   */
  @JsonAdapter(SipPhoneTypeEnum.Adapter.class)
  public enum SipPhoneTypeEnum {
    CTI("Disable CTI");

    private String value;

    SipPhoneTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SipPhoneTypeEnum fromValue(String text) {
      for (SipPhoneTypeEnum b : SipPhoneTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SipPhoneTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SipPhoneTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SipPhoneTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SipPhoneTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sipPhoneType")
  private SipPhoneTypeEnum sipPhoneType = null;

  @SerializedName("skills")
  private List<Skill> skills = null;

  @SerializedName("deletedSkills")
  private List<String> deletedSkills = null;

  @SerializedName("agentGroups")
  private List<String> agentGroups = null;

  @SerializedName("deletedAgentGroups")
  private List<String> deletedAgentGroups = null;

  @SerializedName("accessGroups")
  private List<String> accessGroups = null;

  @SerializedName("deletedAccessGroups")
  private List<String> deletedAccessGroups = null;

  @SerializedName("voiceMail")
  private Integer voiceMail = null;

  @SerializedName("wrapUpTime")
  private String wrapUpTime = null;

  public UpdateUserDataData changePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the user is asked to change their password on first login. 
   * @return changePasswordOnNextLogin
  **/
  @ApiModelProperty(value = "If `true`, the user is asked to change their password on first login. ")
  public Boolean ChangePasswordOnNextLogin() {
    return changePasswordOnNextLogin;
  }

  public void setChangePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
  }

  public UpdateUserDataData emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address. 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The user's email address. ")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UpdateUserDataData employeeID(String employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * The user&#39;s employee ID. 
   * @return employeeID
  **/
  @ApiModelProperty(value = "The user's employee ID. ")
  public String getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }

  public UpdateUserDataData externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * The user&#39;s external ID. 
   * @return externalID
  **/
  @ApiModelProperty(value = "The user's external ID. ")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public UpdateUserDataData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Specifies whether the user is enabled. 
   * @return enabled
  **/
  @ApiModelProperty(value = "Specifies whether the user is enabled. ")
  public Boolean Enabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UpdateUserDataData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user&#39;s unique login. 
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "The user's unique login. ")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UpdateUserDataData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name. 
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The user's first name. ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserDataData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * User&#39;s last name. 
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "User's last name. ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateUserDataData loginCode(String loginCode) {
    this.loginCode = loginCode;
    return this;
  }

   /**
   * The user&#39;s login code. This creates a corresponding [CfgAgentLogin](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentLogin) on all switches in the **switchNames** collection. It&#39;s then assigned to the CfgPerson being modified. 
   * @return loginCode
  **/
  @ApiModelProperty(value = "The user's login code. This creates a corresponding [CfgAgentLogin](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentLogin) on all switches in the **switchNames** collection. It's then assigned to the CfgPerson being modified. ")
  public String getLoginCode() {
    return loginCode;
  }

  public void setLoginCode(String loginCode) {
    this.loginCode = loginCode;
  }

  public UpdateUserDataData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The user&#39;s password as plain text. 
   * @return password
  **/
  @ApiModelProperty(required = true, value = "The user's password as plain text. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateUserDataData placeNames(List<String> placeNames) {
    this.placeNames = placeNames;
    return this;
  }

  public UpdateUserDataData addPlaceNamesItem(String placeNamesItem) {
    if (this.placeNames == null) {
      this.placeNames = new ArrayList<String>();
    }
    this.placeNames.add(placeNamesItem);
    return this;
  }

   /**
   * A list of places available to the user (for multimedia only users). The list is written to the current ([CfgPerson&#39;s](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson)) \&quot;htcc\&quot; annex. For example, CfgPerson/userProperties/htcc/place &#x3D; p1, p2, p3. 
   * @return placeNames
  **/
  @ApiModelProperty(value = "A list of places available to the user (for multimedia only users). The list is written to the current ([CfgPerson's](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson)) \"htcc\" annex. For example, CfgPerson/userProperties/htcc/place = p1, p2, p3. ")
  public List<String> getPlaceNames() {
    return placeNames;
  }

  public void setPlaceNames(List<String> placeNames) {
    this.placeNames = placeNames;
  }

  public UpdateUserDataData wwe(UpdateUserDataDataWwe wwe) {
    this.wwe = wwe;
    return this;
  }

   /**
   * Get wwe
   * @return wwe
  **/
  @ApiModelProperty(value = "")
  public UpdateUserDataDataWwe getWwe() {
    return wwe;
  }

  public void setWwe(UpdateUserDataDataWwe wwe) {
    this.wwe = wwe;
  }

  public UpdateUserDataData switchNames(List<String> switchNames) {
    this.switchNames = switchNames;
    return this;
  }

  public UpdateUserDataData addSwitchNamesItem(String switchNamesItem) {
    if (this.switchNames == null) {
      this.switchNames = new ArrayList<String>();
    }
    this.switchNames.add(switchNamesItem);
    return this;
  }

   /**
   * The switch names the user will work on (where their DNs, agent logins and so on are created). 
   * @return switchNames
  **/
  @ApiModelProperty(value = "The switch names the user will work on (where their DNs, agent logins and so on are created). ")
  public List<String> getSwitchNames() {
    return switchNames;
  }

  public void setSwitchNames(List<String> switchNames) {
    this.switchNames = switchNames;
  }

  public UpdateUserDataData deletedSwitchNames(List<String> deletedSwitchNames) {
    this.deletedSwitchNames = deletedSwitchNames;
    return this;
  }

  public UpdateUserDataData addDeletedSwitchNamesItem(String deletedSwitchNamesItem) {
    if (this.deletedSwitchNames == null) {
      this.deletedSwitchNames = new ArrayList<String>();
    }
    this.deletedSwitchNames.add(deletedSwitchNamesItem);
    return this;
  }

   /**
   * The switch names the user will not work on (where their DNs, agent logins and so on are not created). 
   * @return deletedSwitchNames
  **/
  @ApiModelProperty(value = "The switch names the user will not work on (where their DNs, agent logins and so on are not created). ")
  public List<String> getDeletedSwitchNames() {
    return deletedSwitchNames;
  }

  public void setDeletedSwitchNames(List<String> deletedSwitchNames) {
    this.deletedSwitchNames = deletedSwitchNames;
  }

  public UpdateUserDataData phones(List<Extension> phones) {
    this.phones = phones;
    return this;
  }

  public UpdateUserDataData addPhonesItem(Extension phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Extension>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * A list of phone number descriptors used to create the user&#39;s DNs. For each phone number, a corresponding DN is created on all switches specified by **switchNames** and assigned to the specified place. 
   * @return phones
  **/
  @ApiModelProperty(value = "A list of phone number descriptors used to create the user's DNs. For each phone number, a corresponding DN is created on all switches specified by **switchNames** and assigned to the specified place. ")
  public List<Extension> getPhones() {
    return phones;
  }

  public void setPhones(List<Extension> phones) {
    this.phones = phones;
  }

  public UpdateUserDataData supportSoftPhone(Boolean supportSoftPhone) {
    this.supportSoftPhone = supportSoftPhone;
    return this;
  }

   /**
   * Specifies whether to enable a SIP phone. This writes the corresponding information to the T-Server annex of the created DNs (see **sipPhoneType** below). 
   * @return supportSoftPhone
  **/
  @ApiModelProperty(value = "Specifies whether to enable a SIP phone. This writes the corresponding information to the T-Server annex of the created DNs (see **sipPhoneType** below). ")
  public Boolean SupportSoftPhone() {
    return supportSoftPhone;
  }

  public void setSupportSoftPhone(Boolean supportSoftPhone) {
    this.supportSoftPhone = supportSoftPhone;
  }

  public UpdateUserDataData sipPhoneType(SipPhoneTypeEnum sipPhoneType) {
    this.sipPhoneType = sipPhoneType;
    return this;
  }

   /**
   * Specifies the SIP phone type if you set the **supportSoftPhone** parameter to &#x60;true&#x60;. This specifies the SIP phone type and corresponding annex to be written to the DN&#39;s \&quot;TServer\&quot; section. 
   * @return sipPhoneType
  **/
  @ApiModelProperty(value = "Specifies the SIP phone type if you set the **supportSoftPhone** parameter to `true`. This specifies the SIP phone type and corresponding annex to be written to the DN's \"TServer\" section. ")
  public SipPhoneTypeEnum getSipPhoneType() {
    return sipPhoneType;
  }

  public void setSipPhoneType(SipPhoneTypeEnum sipPhoneType) {
    this.sipPhoneType = sipPhoneType;
  }

  public UpdateUserDataData skills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public UpdateUserDataData addSkillsItem(Skill skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<Skill>();
    }
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * A list of skills to assign to the user. If the Provisioning API finds the corresponding skill, it assigns it to the user with the specified level. If not found, the API creates the skill and assigns it to the user. 
   * @return skills
  **/
  @ApiModelProperty(value = "A list of skills to assign to the user. If the Provisioning API finds the corresponding skill, it assigns it to the user with the specified level. If not found, the API creates the skill and assigns it to the user. ")
  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  public UpdateUserDataData deletedSkills(List<String> deletedSkills) {
    this.deletedSkills = deletedSkills;
    return this;
  }

  public UpdateUserDataData addDeletedSkillsItem(String deletedSkillsItem) {
    if (this.deletedSkills == null) {
      this.deletedSkills = new ArrayList<String>();
    }
    this.deletedSkills.add(deletedSkillsItem);
    return this;
  }

   /**
   * A list of skills to delete from the user. 
   * @return deletedSkills
  **/
  @ApiModelProperty(value = "A list of skills to delete from the user. ")
  public List<String> getDeletedSkills() {
    return deletedSkills;
  }

  public void setDeletedSkills(List<String> deletedSkills) {
    this.deletedSkills = deletedSkills;
  }

  public UpdateUserDataData agentGroups(List<String> agentGroups) {
    this.agentGroups = agentGroups;
    return this;
  }

  public UpdateUserDataData addAgentGroupsItem(String agentGroupsItem) {
    if (this.agentGroups == null) {
      this.agentGroups = new ArrayList<String>();
    }
    this.agentGroups.add(agentGroupsItem);
    return this;
  }

   /**
   * A list of agent groups that the user should be assigned to. If a group doesn&#39;t exist, it&#39;s created by the Provisioning API. 
   * @return agentGroups
  **/
  @ApiModelProperty(value = "A list of agent groups that the user should be assigned to. If a group doesn't exist, it's created by the Provisioning API. ")
  public List<String> getAgentGroups() {
    return agentGroups;
  }

  public void setAgentGroups(List<String> agentGroups) {
    this.agentGroups = agentGroups;
  }

  public UpdateUserDataData deletedAgentGroups(List<String> deletedAgentGroups) {
    this.deletedAgentGroups = deletedAgentGroups;
    return this;
  }

  public UpdateUserDataData addDeletedAgentGroupsItem(String deletedAgentGroupsItem) {
    if (this.deletedAgentGroups == null) {
      this.deletedAgentGroups = new ArrayList<String>();
    }
    this.deletedAgentGroups.add(deletedAgentGroupsItem);
    return this;
  }

   /**
   * A list of agent groups that the user should be deleted from. 
   * @return deletedAgentGroups
  **/
  @ApiModelProperty(value = "A list of agent groups that the user should be deleted from. ")
  public List<String> getDeletedAgentGroups() {
    return deletedAgentGroups;
  }

  public void setDeletedAgentGroups(List<String> deletedAgentGroups) {
    this.deletedAgentGroups = deletedAgentGroups;
  }

  public UpdateUserDataData accessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
    return this;
  }

  public UpdateUserDataData addAccessGroupsItem(String accessGroupsItem) {
    if (this.accessGroups == null) {
      this.accessGroups = new ArrayList<String>();
    }
    this.accessGroups.add(accessGroupsItem);
    return this;
  }

   /**
   * A list of access groups that the user should belong to. If a group doesn&#39;t exist, it is **NOT** created by the Provisioning API. 
   * @return accessGroups
  **/
  @ApiModelProperty(value = "A list of access groups that the user should belong to. If a group doesn't exist, it is **NOT** created by the Provisioning API. ")
  public List<String> getAccessGroups() {
    return accessGroups;
  }

  public void setAccessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
  }

  public UpdateUserDataData deletedAccessGroups(List<String> deletedAccessGroups) {
    this.deletedAccessGroups = deletedAccessGroups;
    return this;
  }

  public UpdateUserDataData addDeletedAccessGroupsItem(String deletedAccessGroupsItem) {
    if (this.deletedAccessGroups == null) {
      this.deletedAccessGroups = new ArrayList<String>();
    }
    this.deletedAccessGroups.add(deletedAccessGroupsItem);
    return this;
  }

   /**
   * A list of access groups that the user should be deleted from. 
   * @return deletedAccessGroups
  **/
  @ApiModelProperty(value = "A list of access groups that the user should be deleted from. ")
  public List<String> getDeletedAccessGroups() {
    return deletedAccessGroups;
  }

  public void setDeletedAccessGroups(List<String> deletedAccessGroups) {
    this.deletedAccessGroups = deletedAccessGroups;
  }

  public UpdateUserDataData voiceMail(Integer voiceMail) {
    this.voiceMail = voiceMail;
    return this;
  }

   /**
   * The user&#39;s voice mail. This is written to the user&#39;s CfgAgentLogin.userProperties.TServer.gvm_mailbox. 
   * @return voiceMail
  **/
  @ApiModelProperty(value = "The user's voice mail. This is written to the user's CfgAgentLogin.userProperties.TServer.gvm_mailbox. ")
  public Integer getVoiceMail() {
    return voiceMail;
  }

  public void setVoiceMail(Integer voiceMail) {
    this.voiceMail = voiceMail;
  }

  public UpdateUserDataData wrapUpTime(String wrapUpTime) {
    this.wrapUpTime = wrapUpTime;
    return this;
  }

   /**
   * The user&#39;s Wrap Up Time. This is configured for each [CfgAgentLogin](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentLogin). 
   * @return wrapUpTime
  **/
  @ApiModelProperty(value = "The user's Wrap Up Time. This is configured for each [CfgAgentLogin](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentLogin). ")
  public String getWrapUpTime() {
    return wrapUpTime;
  }

  public void setWrapUpTime(String wrapUpTime) {
    this.wrapUpTime = wrapUpTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserDataData updateUserDataData = (UpdateUserDataData) o;
    return Objects.equals(this.changePasswordOnNextLogin, updateUserDataData.changePasswordOnNextLogin) &&
        Objects.equals(this.emailAddress, updateUserDataData.emailAddress) &&
        Objects.equals(this.employeeID, updateUserDataData.employeeID) &&
        Objects.equals(this.externalID, updateUserDataData.externalID) &&
        Objects.equals(this.enabled, updateUserDataData.enabled) &&
        Objects.equals(this.userName, updateUserDataData.userName) &&
        Objects.equals(this.firstName, updateUserDataData.firstName) &&
        Objects.equals(this.lastName, updateUserDataData.lastName) &&
        Objects.equals(this.loginCode, updateUserDataData.loginCode) &&
        Objects.equals(this.password, updateUserDataData.password) &&
        Objects.equals(this.placeNames, updateUserDataData.placeNames) &&
        Objects.equals(this.wwe, updateUserDataData.wwe) &&
        Objects.equals(this.switchNames, updateUserDataData.switchNames) &&
        Objects.equals(this.deletedSwitchNames, updateUserDataData.deletedSwitchNames) &&
        Objects.equals(this.phones, updateUserDataData.phones) &&
        Objects.equals(this.supportSoftPhone, updateUserDataData.supportSoftPhone) &&
        Objects.equals(this.sipPhoneType, updateUserDataData.sipPhoneType) &&
        Objects.equals(this.skills, updateUserDataData.skills) &&
        Objects.equals(this.deletedSkills, updateUserDataData.deletedSkills) &&
        Objects.equals(this.agentGroups, updateUserDataData.agentGroups) &&
        Objects.equals(this.deletedAgentGroups, updateUserDataData.deletedAgentGroups) &&
        Objects.equals(this.accessGroups, updateUserDataData.accessGroups) &&
        Objects.equals(this.deletedAccessGroups, updateUserDataData.deletedAccessGroups) &&
        Objects.equals(this.voiceMail, updateUserDataData.voiceMail) &&
        Objects.equals(this.wrapUpTime, updateUserDataData.wrapUpTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changePasswordOnNextLogin, emailAddress, employeeID, externalID, enabled, userName, firstName, lastName, loginCode, password, placeNames, wwe, switchNames, deletedSwitchNames, phones, supportSoftPhone, sipPhoneType, skills, deletedSkills, agentGroups, deletedAgentGroups, accessGroups, deletedAccessGroups, voiceMail, wrapUpTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserDataData {\n");
    
    sb.append("    changePasswordOnNextLogin: ").append(toIndentedString(changePasswordOnNextLogin)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginCode: ").append(toIndentedString(loginCode)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    placeNames: ").append(toIndentedString(placeNames)).append("\n");
    sb.append("    wwe: ").append(toIndentedString(wwe)).append("\n");
    sb.append("    switchNames: ").append(toIndentedString(switchNames)).append("\n");
    sb.append("    deletedSwitchNames: ").append(toIndentedString(deletedSwitchNames)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    supportSoftPhone: ").append(toIndentedString(supportSoftPhone)).append("\n");
    sb.append("    sipPhoneType: ").append(toIndentedString(sipPhoneType)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    deletedSkills: ").append(toIndentedString(deletedSkills)).append("\n");
    sb.append("    agentGroups: ").append(toIndentedString(agentGroups)).append("\n");
    sb.append("    deletedAgentGroups: ").append(toIndentedString(deletedAgentGroups)).append("\n");
    sb.append("    accessGroups: ").append(toIndentedString(accessGroups)).append("\n");
    sb.append("    deletedAccessGroups: ").append(toIndentedString(deletedAccessGroups)).append("\n");
    sb.append("    voiceMail: ").append(toIndentedString(voiceMail)).append("\n");
    sb.append("    wrapUpTime: ").append(toIndentedString(wrapUpTime)).append("\n");
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

