package com.genesys.provisioning.models;

public class SearchParams {
  	
  	private Integer limit = null;
  	private Integer offset = null;
  	private String searchTerm = null;
  	private String searchKey = null;
  	private String matchMethod = null;
  	private String sortKey = null;
  	private Boolean sortAscending = null;
  	private String sortMethod = null;
  	
  	public SearchParams() {}
  	
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    public Integer getLimit() {
    	return this.limit;
    }
  	
    public SearchParams limit(Integer limit) {
    	this.limit = limit;
    	return this;
    }
  	
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    
    public Integer getOffset() {
    	return this.offset;
    }
  	
    public SearchParams offset(Integer offset) {
    	this.offset = offset;
    	return this;
    }
  	
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
    
    public String getSearchTerm() {
    	return this.searchTerm;
    }
  	
    public SearchParams searchTerm(String searchTerm) {
    	this.searchTerm = searchTerm;
    	return this;
    }
  	
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    
    public String getSearchKey() {
    	return this.searchKey;
    }
  	
    public SearchParams searchKey(String searchKey) {
    	this.searchKey = searchKey;
    	return this;
    }
  	
    public void setMatchMethod(String matchMethod) {
        this.matchMethod = matchMethod;
    }
    
    public String getMatchMethod() {
    	return this.matchMethod;
    }
  	
    public SearchParams matchMethod(String matchMethod) {
    	this.matchMethod = matchMethod;
    	return this;
    }
  	
    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }
    
    public String getSortKey() {
    	return this.sortKey;
    }
  	
    public SearchParams sortKey(String sortKey) {
    	this.sortKey = sortKey;
    	return this;
    }
  	
    public void setSortAscending(Boolean sortAscending) {
        this.sortAscending = sortAscending;
    }
    
    public Boolean getSortAscending() {
    	return this.sortAscending;
    }
  	
    public SearchParams sortAscending(Boolean sortAscending) {
    	this.sortAscending = sortAscending;
    	return this;
    }
  	
    public void setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
    }
    
    public String getSortMethod() {
    	return this.sortMethod;
    }
  	
    public SearchParams sortMethod(String sortMethod) {
    	this.sortMethod = sortMethod;
    	return this;
    }
}