package com.genesys.provisioning.models;

public class AgentInfo {
  	
  	private String placeDBID = null;
  	private String siteDBID = null;
  	private String contractDBID = null;
  	private String capacityRuleDBID = null;
  	
  	public AgentInfo() {}
  	
    public void setPlaceDBID(String placeDBID) {
        this.placeDBID = placeDBID;
    }
    
    public String getPlaceDBID() {
    	return this.placeDBID;
    }
  	
    public AgentInfo placeDBID(String placeDBID) {
    	this.placeDBID = placeDBID;
    	return this;
    }
  	
    public void setSiteDBID(String siteDBID) {
        this.siteDBID = siteDBID;
    }
    
    public String getSiteDBID() {
    	return this.siteDBID;
    }
  	
    public AgentInfo siteDBID(String siteDBID) {
    	this.siteDBID = siteDBID;
    	return this;
    }
  	
    public void setContractDBID(String contractDBID) {
        this.contractDBID = contractDBID;
    }
    
    public String getContractDBID() {
    	return this.contractDBID;
    }
  	
    public AgentInfo contractDBID(String contractDBID) {
    	this.contractDBID = contractDBID;
    	return this;
    }
  	
    public void setCapacityRuleDBID(String capacityRuleDBID) {
        this.capacityRuleDBID = capacityRuleDBID;
    }
    
    public String getCapacityRuleDBID() {
    	return this.capacityRuleDBID;
    }
  	
    public AgentInfo capacityRuleDBID(String capacityRuleDBID) {
    	this.capacityRuleDBID = capacityRuleDBID;
    	return this;
    }
    
    @Override
	public String toString() {
		return "{"
			+ "placeDBID = " + this.placeDBID+" , "
			+ "siteDBID = " + this.siteDBID+" , "
			+ "contractDBID = " + this.contractDBID+" , "
			+ "capacityRuleDBID = " + this.capacityRuleDBID + "}";
	}
    
}