package com.genesys.provisioning.models;

public class UserSearchParams {
  	
  	private Integer limit = null;
  	private Integer offset = null;
  	private String order = null;
  	private String sortBy = null;
  	private String filterName = null;
  	private String filterParameters = null;
  	private String roles = null;
  	private String skills = null;
  	private Boolean userEnabled = null;
  	private String userValid = null;
  	
  	public UserSearchParams() {}
  	
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public Integer getLimit() {
    	return this.limit;
    }
  	
    public UserSearchParams limit(Integer limit) {
    	this.limit = limit;
    	return this;
    }
  	
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getOffset() {
    	return this.offset;
    }
  	
    public UserSearchParams offset(Integer offset) {
    	this.offset = offset;
    	return this;
    }
  	
    public void setOrder(String order) {
        this.order = order;
    }
    
    public String getOrder() {
    	return this.order;
    }
  	
    public UserSearchParams order(String order) {
    	this.order = order;
    	return this;
    }
  	
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    
    public String getSortBy() {
    	return this.sortBy;
    }
  	
    public UserSearchParams sortBy(String sortBy) {
    	this.sortBy = sortBy;
    	return this;
    }
  	
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
    
    public String getFilterName() {
    	return this.filterName;
    }
  	
    public UserSearchParams filterName(String filterName) {
    	this.filterName = filterName;
    	return this;
    }
  	
    public void setFilterParameters(String filterParameters) {
        this.filterParameters = filterParameters;
    }
    
    public String getFilterParameters() {
    	return this.filterParameters;
    }
  	
    public UserSearchParams filterParameters(String filterParameters) {
    	this.filterParameters = filterParameters;
    	return this;
    }
  	
    public void setRoles(String roles) {
        this.roles = roles;
    }
    
    public String getRoles() {
    	return this.roles;
    }
  	
    public UserSearchParams roles(String roles) {
    	this.roles = roles;
    	return this;
    }
  	
    public void setSkills(String skills) {
        this.skills = skills;
    }
    
    public String getSkills() {
    	return this.skills;
    }
  	
    public UserSearchParams skills(String skills) {
    	this.skills = skills;
    	return this;
    }
  	
    public void setUserEnabled(Boolean userEnabled) {
        this.userEnabled = userEnabled;
    }
    
    public Boolean getUserEnabled() {
    	return this.userEnabled;
    }
  	
    public UserSearchParams userEnabled(Boolean userEnabled) {
    	this.userEnabled = userEnabled;
    	return this;
    }
  	
    public void setUserValid(String userValid) {
        this.userValid = userValid;
    }
    
    public String getUserValid() {
    	return this.userValid;
    }
  	
    public UserSearchParams userValid(String userValid) {
    	this.userValid = userValid;
    	return this;
    }
}