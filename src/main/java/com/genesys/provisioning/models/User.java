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
  	private boolean isAgent = false;
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
  	private String DBID = null;
  	
  	public User() {}
  	
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
		
		if(in.containsKey("sipPhoneType")) {
			Object sipPhoneType = in.get("sipPhoneType");
			if(sipPhoneType instanceof Map) this.sipPhoneType = SipPhoneType.fromString((String)((Map<String, Object>)sipPhoneType).get("name"));
			if(sipPhoneType instanceof String) this.sipPhoneType = SipPhoneType.fromString((String) sipPhoneType);
		}
		if(in.containsKey("skills")) this.skills = Converters.convertMapListToSkills((List<Map>)in.get("skills"));
		if(in.containsKey("agentGroups")) this.agentGroups = (List<String>)in.get("agentGroups");
		if(in.containsKey("accessGroups")) this.accessGroups = (List<String>)in.get("accessGroups");
		try {
			if(in.containsKey("voiceMail")) this.voiceMail = Integer.parseInt((String)in.get("voiceMail"));
		} catch(java.lang.NumberFormatException e) {}
		if(in.containsKey("wrapUpTime")) this.wrapUpTime = (Double)in.get("wrapUpTime");
		if(in.containsKey("DBID")) this.DBID = (String)in.get("DBID");
  	}
  	
    public void setChangePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
        this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    }
    
    public Boolean getChangePasswordOnNextLogin() {
    	return this.changePasswordOnNextLogin;
    }
  	
    public User changePasswordOnNextLogin(Boolean changePasswordOnNextLogin) {
    	this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    	return this;
    }
  	
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress() {
    	return this.emailAddress;
    }
  	
    public User emailAddress(String emailAddress) {
    	this.emailAddress = emailAddress;
    	return this;
    }
  	
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID() {
    	return this.employeeID;
    }
  	
    public User employeeID(String employeeID) {
    	this.employeeID = employeeID;
    	return this;
    }
  	
    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }
    
    public String getExternalID() {
    	return this.externalID;
    }
  	
    public User externalID(String externalID) {
    	this.externalID = externalID;
    	return this;
    }
  	
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    public Boolean getEnabled() {
    	return this.enabled;
    }
  	
    public User enabled(Boolean enabled) {
    	this.enabled = enabled;
    	return this;
    }
  	
    public void setFolder(String folder) {
        this.folder = folder;
    }
    
    public String getFolder() {
    	return this.folder;
    }
  	
    public User folder(String folder) {
    	this.folder = folder;
    	return this;
    }
  	
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserName() {
    	return this.userName;
    }
  	
    public User userName(String userName) {
    	this.userName = userName;
    	return this;
    }
  	
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
    	return this.firstName;
    }
  	
    public User firstName(String firstName) {
    	this.firstName = firstName;
    	return this;
    }
  	
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
  	
    public User lastName(String lastName) {
    	this.lastName = lastName;
    	return this;
    }
  	
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
    
    public String getLoginCode() {
    	return this.loginCode;
    }
  	
    public User loginCode(String loginCode) {
    	this.loginCode = loginCode;
    	return this;
    }
  	
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
    	return this.password;
    }
  	
    public User password(String password) {
    	this.password = password;
    	return this;
    }
  	
    public void setPlaceNames(List<String> placeNames) {
        this.placeNames = placeNames;
    }
    
    public List<String> getPlaceNames() {
    	return this.placeNames;
    }
  	
    public User placeNames(List<String> placeNames) {
    	this.placeNames = placeNames;
    	return this;
    }
  	
    public void setIsAgent(boolean isAgent) {
        this.isAgent = isAgent;
    }
    
    public boolean getIsAgent() {
    	return this.isAgent;
    }
  	
    public User isAgent(boolean isAgent) {
    	this.isAgent = isAgent;
    	return this;
    }
  	
    public void setWwe(WweProperties wwe) {
        this.wwe = wwe;
    }
    
    public WweProperties getWwe() {
    	return this.wwe;
    }
  	
    public User wwe(WweProperties wwe) {
    	this.wwe = wwe;
    	return this;
    }
  	
    public void setSwitchNames(List<String> switchNames) {
        this.switchNames = switchNames;
    }
    
    public List<String> getSwitchNames() {
    	return this.switchNames;
    }
  	
    public User switchNames(List<String> switchNames) {
    	this.switchNames = switchNames;
    	return this;
    }
  	
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
    
    public List<Phone> getPhones() {
    	return this.phones;
    }
  	
    public User phones(List<Phone> phones) {
    	this.phones = phones;
    	return this;
    }
  	
    public void setSupportSoftPhone(Boolean supportSoftPhone) {
        this.supportSoftPhone = supportSoftPhone;
    }
    
    public Boolean getSupportSoftPhone() {
    	return this.supportSoftPhone;
    }
  	
    public User supportSoftPhone(Boolean supportSoftPhone) {
    	this.supportSoftPhone = supportSoftPhone;
    	return this;
    }
  	
    public void setSipPhoneType(SipPhoneType sipPhoneType) {
        this.sipPhoneType = sipPhoneType;
    }
    
    public SipPhoneType getSipPhoneType() {
    	return this.sipPhoneType;
    }
  	
    public User sipPhoneType(SipPhoneType sipPhoneType) {
    	this.sipPhoneType = sipPhoneType;
    	return this;
    }
  	
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    
    public List<Skill> getSkills() {
    	return this.skills;
    }
  	
    public User skills(List<Skill> skills) {
    	this.skills = skills;
    	return this;
    }
  	
    public void setAgentGroups(List<String> agentGroups) {
        this.agentGroups = agentGroups;
    }
    
    public List<String> getAgentGroups() {
    	return this.agentGroups;
    }
  	
    public User agentGroups(List<String> agentGroups) {
    	this.agentGroups = agentGroups;
    	return this;
    }
  	
    public void setAccessGroups(List<String> accessGroups) {
        this.accessGroups = accessGroups;
    }
    
    public List<String> getAccessGroups() {
    	return this.accessGroups;
    }
  	
    public User accessGroups(List<String> accessGroups) {
    	this.accessGroups = accessGroups;
    	return this;
    }
  	
    public void setVoiceMail(Integer voiceMail) {
        this.voiceMail = voiceMail;
    }
    
    public Integer getVoiceMail() {
    	return this.voiceMail;
    }
  	
    public User voiceMail(Integer voiceMail) {
    	this.voiceMail = voiceMail;
    	return this;
    }
  	
    public void setWrapUpTime(Double wrapUpTime) {
        this.wrapUpTime = wrapUpTime;
    }
    
    public Double getWrapUpTime() {
    	return this.wrapUpTime;
    }
  	
    public User wrapUpTime(Double wrapUpTime) {
    	this.wrapUpTime = wrapUpTime;
    	return this;
    }
    
    public void setDBID(String DBID) {
        this.DBID = DBID;
    }
    
    public String getDBID() {
    	return this.DBID;
    }
  	
    public User dbid(String DBID) {
    	this.DBID = DBID;
    	return this;
    }
  
	@Override
	public String toString() {
		return "{"
			+ "changePasswordOnNextLogin = " + this.changePasswordOnNextLogin+" ,\n "
			+ "emailAddress = " + this.emailAddress+" ,\n "
			+ "employeeID = " + this.employeeID+" ,\n "
			+ "externalID = " + this.externalID+" ,\n "
			+ "enabled = " + this.enabled+" ,\n "
			+ "folder = " + this.folder+" ,\n "
			+ "userName = " + this.userName+" ,\n "
			+ "firstName = " + this.firstName+" ,\n "
			+ "lastName = " + this.lastName+" ,\n "
			+ "loginCode = " + this.loginCode+" ,\n "
			+ "password = " + this.password+" ,\n "
			+ "placeNames = " + this.placeNames+" ,\n "
			+ "isAgent = " + this.isAgent+" ,\n "
			+ "wwe = " + this.wwe+" ,\n "
			+ "switchNames = " + this.switchNames+" ,\n "
			+ "phones = " + this.phones+" ,\n "
			+ "supportSoftPhone = " + this.supportSoftPhone+" ,\n "
			+ "sipPhoneType = " + this.sipPhoneType+" ,\n "
			+ "skills = " + this.skills+" ,\n "
			+ "agentGroups = " + this.agentGroups+" ,\n "
			+ "accessGroups = " + this.accessGroups+" ,\n "
			+ "voiceMail = " + this.voiceMail+" ,\n "
			+ "wrapUpTime = " + this.wrapUpTime + "\n"
			+ "DBID = " + this.DBID + "\n}";
	}
  
}
