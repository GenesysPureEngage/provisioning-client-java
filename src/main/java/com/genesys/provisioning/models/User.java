package com.genesys.provisioning.models;


import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class User {
  
  private Boolean changePasswordOnNextLogin = null;
  private String emailAddress = null;
  private String employeeID = null;
  private String externalID = null;
  private Boolean enabled = null;
  private String folder = null;
  private String userName = null;
  private String firstName = null;
  private String lastName = null;
  private String loginCode = null;
  private String password = null;
  private List<String> placeNames = new ArrayList();
  private Boolean isAgent = null;
  private WweProperties wwe = null;
  private List<String> switchNames = new ArrayList();
  private List<Phone> phones = new ArrayList();
  private Boolean supportSoftPhone = null;
  private SipPhoneType sipPhoneType = null;
  private List<Skill> skills = new ArrayList();
  private List<String> agentGroups = new ArrayList();
  private List<String> accessGroups = new ArrayList();
  private Integer voiceMail = null;
  private Double wrapUpTime = null;
  
  public User() {
  	   
  }
  
  public User(Map<String, Object> in) {
	  if(in.containsKey("changePasswordOnNextLogin")) this.changePasswordOnNextLogin = (Boolean)in.get("changePasswordOnNextLogin");
	  if(in.containsKey("emailAddress")) this.emailAddress = (String)in.get("emailAddress");
	  if(in.containsKey("employeeID")) this.employeeID = (String)in.get("employeeID");
	  if(in.containsKey("externalID")) this.externalID = (String)in.get("externalID");
	  if(in.containsKey("enabled")) this.enabled = (Boolean)in.get("enabled");
	  if(in.containsKey("folder")) this.folder = in.get("folder").toString();
	  if(in.containsKey("userName")) this.userName = (String)in.get("userName");
	  if(in.containsKey("firstName")) this.firstName = (String)in.get("firstName");
	  if(in.containsKey("lastName")) this.lastName = (String)in.get("lastName");
	  if(in.containsKey("loginCode")) this.loginCode = (String)in.get("loginCode");
	  if(in.containsKey("password")) this.password = (String)in.get("password");
	  if(in.containsKey("placeNames")) this.placeNames = (List<String>)in.get("placeNames");
	  if(in.containsKey("isAgent")) this.isAgent = (Boolean)in.get("isAgent");
	  if(in.containsKey("wwe")) this.wwe = new WweProperties((Map<String, Object>)in.get("wwe"));
	  if(in.containsKey("switchNames")) this.switchNames = (List<String>)in.get("switchNames");
	  if(in.containsKey("phones")) this.phones = Converters.convertMapListToPhones((List<Map>)in.get("phones"));
	  if(in.containsKey("supportSoftPhone")) this.supportSoftPhone = (Boolean)in.get("supportSoftPhone");
	  if(in.containsKey("sipPhoneType")) this.sipPhoneType = SipPhoneType.fromString((String)((Map<String, Object>)in.get("sipPhoneType")).get("name"));
	  if(in.containsKey("skills")) this.skills = Converters.convertMapListToSkills((List<Map>)in.get("skills"));
	  if(in.containsKey("agentGroups")) this.agentGroups = (List<String>)in.get("agentGroups");
	  if(in.containsKey("accessGroups")) this.accessGroups = (List<String>)in.get("accessGroups");
	  try {
	  	if(in.containsKey("voiceMail")) this.voiceMail = Integer.parseInt((String)in.get("voiceMail"));
	  } catch(java.lang.NumberFormatException e) {}
	  if(in.containsKey("wrapUpTime")) this.wrapUpTime = (Double)in.get("wrapUpTime");
  }


  
  public void setChangePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    this.changePasswordOnNextLogin = changePasswordOnNextLogin;
  }
  
  public Boolean getChangePasswordOnNextLogin() {
    return this.changePasswordOnNextLogin;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public String getEmailAddress() {
    return this.emailAddress;
  }
  
  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }
  
  public String getEmployeeID() {
    return this.employeeID;
  }
  
  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }
  
  public String getExternalID() {
    return this.externalID;
  }
  
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  
  public Boolean getEnabled() {
    return this.enabled;
  }
  
  public void setFolder(String folder) {
    this.folder = folder;
  }
  
  public String getFolder() {
    return this.folder;
  }
  
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLoginCode(String loginCode) {
    this.loginCode = loginCode;
  }
  
  public String getLoginCode() {
    return this.loginCode;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPlaceNames(List<String> placeNames) {
    this.placeNames = placeNames;
  }
  
  public List<String> getPlaceNames() {
    return this.placeNames;
  }
  
  public void setIsAgent(Boolean isAgent) {
    this.isAgent = isAgent;
  }
  
  public Boolean getIsAgent() {
    return this.isAgent;
  }
  
  public void setWwe(WweProperties wwe) {
    this.wwe = wwe;
  }
  
  public WweProperties getWwe() {
    return this.wwe;
  }
  
  public void setSwitchNames(List<String> switchNames) {
    this.switchNames = switchNames;
  }
  
  public List<String> getSwitchNames() {
    return this.switchNames;
  }
  
  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }
  
  public List<Phone> getPhones() {
    return this.phones;
  }
  
  public void setSupportSoftPhone(Boolean supportSoftPhone) {
    this.supportSoftPhone = supportSoftPhone;
  }
  
  public Boolean getSupportSoftPhone() {
    return this.supportSoftPhone;
  }
  
  public void setSipPhoneType(SipPhoneType sipPhoneType) {
    this.sipPhoneType = sipPhoneType;
  }
  
  public SipPhoneType getSipPhoneType() {
    return this.sipPhoneType;
  }
  
  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }
  
  public List<Skill> getSkills() {
    return this.skills;
  }
  
  public void setAgentGroups(List<String> agentGroups) {
    this.agentGroups = agentGroups;
  }
  
  public List<String> getAgentGroups() {
    return this.agentGroups;
  }
  
  public void setAccessGroups(List<String> accessGroups) {
    this.accessGroups = accessGroups;
  }
  
  public List<String> getAccessGroups() {
    return this.accessGroups;
  }
  
  public void setVoiceMail(Integer voiceMail) {
    this.voiceMail = voiceMail;
  }
  
  public Integer getVoiceMail() {
    return this.voiceMail;
  }
  
  public void setWrapUpTime(Double wrapUpTime) {
    this.wrapUpTime = wrapUpTime;
  }
  
  public Double getWrapUpTime() {
    return this.wrapUpTime;
  }
  
  public String toString() {
	return "{"
		+ "changePasswordOnNextLogin = " + this.changePasswordOnNextLogin+" , "
		+ "emailAddress = " + this.emailAddress+" , "
		+ "employeeID = " + this.employeeID+" , "
		+ "externalID = " + this.externalID+" , "
		+ "enabled = " + this.enabled+" , "
		+ "folder = " + this.folder+" , "
		+ "userName = " + this.userName+" , "
		+ "firstName = " + this.firstName+" , "
		+ "lastName = " + this.lastName+" , "
		+ "loginCode = " + this.loginCode+" , "
		+ "password = " + this.password+" , "
		+ "placeNames = " + this.placeNames+" , "
		+ "isAgent = " + this.isAgent+" , "
		+ "wwe = " + this.wwe+" , "
		+ "switchNames = " + this.switchNames+" , "
		+ "phones = " + this.phones+" , "
		+ "supportSoftPhone = " + this.supportSoftPhone+" , "
		+ "sipPhoneType = " + this.sipPhoneType+" , "
		+ "skills = " + this.skills+" , "
		+ "agentGroups = " + this.agentGroups+" , "
		+ "accessGroups = " + this.accessGroups+" , "
		+ "voiceMail = " + this.voiceMail+" , "
		+ "wrapUpTime = " + this.wrapUpTime + "}";
	}
  
}
