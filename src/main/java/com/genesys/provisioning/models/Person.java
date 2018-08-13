package com.genesys.provisioning.models;

public class Person {
  	
  	private String DBID = null;
  	private String tenantDBID = null;
  	private String lastName = null;
  	private String firstName = null;
  	private String userName = null;
  	private String password = null;
  	private String isAgent = null;
  	private String isAdmin = null;
  	private String state = null;
  	private String isExternalAuth = null;
  	private String changePasswordOnNextLogin = null;
  	private String passwordHashAlgorithm = null;
  	private String passwordUpdatingDate = null;
  	private String emailAddress = null;
  	private AgentInfo agentInfo = null;
  	private String id = null;
  	
  	public Person() {}
  	
    public void setDBID(String DBID) {
        this.DBID = DBID;
    }
    
    public String getDBID() {
    	return this.DBID;
    }
  	
    public Person DBID(String DBID) {
    	this.DBID = DBID;
    	return this;
    }
  	
    public void setTenantDBID(String tenantDBID) {
        this.tenantDBID = tenantDBID;
    }
    
    public String getTenantDBID() {
    	return this.tenantDBID;
    }
  	
    public Person tenantDBID(String tenantDBID) {
    	this.tenantDBID = tenantDBID;
    	return this;
    }
  	
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
  	
    public Person lastName(String lastName) {
    	this.lastName = lastName;
    	return this;
    }
  	
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
    	return this.firstName;
    }
  	
    public Person firstName(String firstName) {
    	this.firstName = firstName;
    	return this;
    }
  	
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserName() {
    	return this.userName;
    }
  	
    public Person userName(String userName) {
    	this.userName = userName;
    	return this;
    }
  	
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
    	return this.password;
    }
  	
    public Person password(String password) {
    	this.password = password;
    	return this;
    }
  	
    public void setIsAgent(String isAgent) {
        this.isAgent = isAgent;
    }
    
    public String getIsAgent() {
    	return this.isAgent;
    }
  	
    public Person isAgent(String isAgent) {
    	this.isAgent = isAgent;
    	return this;
    }
  	
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    public String getIsAdmin() {
    	return this.isAdmin;
    }
  	
    public Person isAdmin(String isAdmin) {
    	this.isAdmin = isAdmin;
    	return this;
    }
  	
    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
    	return this.state;
    }
  	
    public Person state(String state) {
    	this.state = state;
    	return this;
    }
  	
    public void setIsExternalAuth(String isExternalAuth) {
        this.isExternalAuth = isExternalAuth;
    }
    
    public String getIsExternalAuth() {
    	return this.isExternalAuth;
    }
  	
    public Person isExternalAuth(String isExternalAuth) {
    	this.isExternalAuth = isExternalAuth;
    	return this;
    }
  	
    public void setChangePasswordOnNextLogin(String changePasswordOnNextLogin) {
        this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    }
    
    public String getChangePasswordOnNextLogin() {
    	return this.changePasswordOnNextLogin;
    }
  	
    public Person changePasswordOnNextLogin(String changePasswordOnNextLogin) {
    	this.changePasswordOnNextLogin = changePasswordOnNextLogin;
    	return this;
    }
  	
    public void setPasswordHashAlgorithm(String passwordHashAlgorithm) {
        this.passwordHashAlgorithm = passwordHashAlgorithm;
    }
    
    public String getPasswordHashAlgorithm() {
    	return this.passwordHashAlgorithm;
    }
  	
    public Person passwordHashAlgorithm(String passwordHashAlgorithm) {
    	this.passwordHashAlgorithm = passwordHashAlgorithm;
    	return this;
    }
  	
    public void setPasswordUpdatingDate(String passwordUpdatingDate) {
        this.passwordUpdatingDate = passwordUpdatingDate;
    }
    
    public String getPasswordUpdatingDate() {
    	return this.passwordUpdatingDate;
    }
  	
    public Person passwordUpdatingDate(String passwordUpdatingDate) {
    	this.passwordUpdatingDate = passwordUpdatingDate;
    	return this;
    }
  	
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress() {
    	return this.emailAddress;
    }
  	
    public Person emailAddress(String emailAddress) {
    	this.emailAddress = emailAddress;
    	return this;
    }
  	
    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }
    
    public AgentInfo getAgentInfo() {
    	return this.agentInfo;
    }
  	
    public Person agentInfo(AgentInfo agentInfo) {
    	this.agentInfo = agentInfo;
    	return this;
    }
  	
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
    	return this.id;
    }
  	
    public Person id(String id) {
    	this.id = id;
    	return this;
    }
    
    @Override
	public String toString() {
   		 return "{"
			+ "DBID = " + this.DBID+" , "
			+ "tenantDBID = " + this.tenantDBID+" , "
			+ "lastName = " + this.lastName+" , "
			+ "firstName = " + this.firstName+" , "
			+ "userName = " + this.userName+" , "
			+ "password = " + this.password+" , "
			+ "isAgent = " + this.isAgent+" , "
			+ "isAdmin = " + this.isAdmin+" , "
			+ "state = " + this.state+" , "
			+ "isExternalAuth = " + this.isExternalAuth+" , "
			+ "changePasswordOnNextLogin = " + this.changePasswordOnNextLogin+" , "
			+ "passwordHashAlgorithm = " + this.passwordHashAlgorithm+" , "
			+ "passwordUpdatingDate = " + this.passwordUpdatingDate+" , "
			+ "emailAddress = " + this.emailAddress+" , "
			+ "agentInfo = " + this.agentInfo+" , "
			+ "id = " + this.id + "}";
	}
}