package com.genesys.provisioning.models;

import java.util.List;
import java.util.Map;

public class AgentGroup {
  	
  	private String tenantDBID = null;
  	private String capacityTableDBID = null;
  	private String quotaTableDBID = null;
  	private String siteDBID = null;
  	private String contractDBID = null;
  	private String sate = null;
  	private String name = null;
  	private String DBID = null;
  	private List<String> agentDBIDs = null;
  	
  	public AgentGroup() {}
  	
  	public AgentGroup(Map<String, Object> in) {
  		if(in.containsKey("CfgGroup")) {
  			Map<String, Object> group = (Map<String, Object>)in.get("CfgGroup");
  			
			if(group.containsKey("tenantDBID")) this.tenantDBID = (String)group.get("tenantDBID");
			if(group.containsKey("capacityTableDBID")) this.capacityTableDBID = (String)group.get("capacityTableDBID");
			if(group.containsKey("quotaTableDBID")) this.quotaTableDBID = (String)group.get("quotaTableDBID");
			if(group.containsKey("siteDBID")) this.siteDBID = (String)group.get("siteDBID");
			if(group.containsKey("contractDBID")) this.contractDBID = (String)group.get("contractDBID");
			if(group.containsKey("sate")) this.sate = (String)group.get("sate");
			if(group.containsKey("name")) this.name = (String)group.get("name");
			if(group.containsKey("DBID")) this.DBID = (String)group.get("DBID");
		}
  		if(in.containsKey("agentDBIDs")) this.agentDBIDs = (List<String>)in.get("agentDBIDs");
  	}
  	
    public void setTenantDBID(String tenantDBID) {
        this.tenantDBID = tenantDBID;
    }
    
    public String getTenantDBID() {
    	return this.tenantDBID;
    }
  	
    public AgentGroup tenantDBID(String tenantDBID) {
    	this.tenantDBID = tenantDBID;
    	return this;
    }
  	
    public void setCapacityTableDBID(String capacityTableDBID) {
        this.capacityTableDBID = capacityTableDBID;
    }
    
    public String getCapacityTableDBID() {
    	return this.capacityTableDBID;
    }
  	
    public AgentGroup capacityTableDBID(String capacityTableDBID) {
    	this.capacityTableDBID = capacityTableDBID;
    	return this;
    }
  	
    public void setQuotaTableDBID(String quotaTableDBID) {
        this.quotaTableDBID = quotaTableDBID;
    }
    
    public String getQuotaTableDBID() {
    	return this.quotaTableDBID;
    }
  	
    public AgentGroup quotaTableDBID(String quotaTableDBID) {
    	this.quotaTableDBID = quotaTableDBID;
    	return this;
    }
  	
    public void setSiteDBID(String siteDBID) {
        this.siteDBID = siteDBID;
    }
    
    public String getSiteDBID() {
    	return this.siteDBID;
    }
  	
    public AgentGroup siteDBID(String siteDBID) {
    	this.siteDBID = siteDBID;
    	return this;
    }
  	
    public void setContractDBID(String contractDBID) {
        this.contractDBID = contractDBID;
    }
    
    public String getContractDBID() {
    	return this.contractDBID;
    }
  	
    public AgentGroup contractDBID(String contractDBID) {
    	this.contractDBID = contractDBID;
    	return this;
    }
  	
    public void setSate(String sate) {
        this.sate = sate;
    }
    
    public String getSate() {
    	return this.sate;
    }
  	
    public AgentGroup sate(String sate) {
    	this.sate = sate;
    	return this;
    }
  	
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
  	
    public AgentGroup name(String name) {
    	this.name = name;
    	return this;
    }
  	
    public void setDBID(String DBID) {
        this.DBID = DBID;
    }
    
    public String getDBID() {
    	return this.DBID;
    }
  	
    public AgentGroup DBID(String DBID) {
    	this.DBID = DBID;
    	return this;
    }
  	
    public void setAgentDBIDs(List<String> agentDBIDs) {
        this.agentDBIDs = agentDBIDs;
    }
    
    public List<String> getAgentDBIDs() {
    	return this.agentDBIDs;
    }
  	
    public AgentGroup agentDBIDs(List<String> agentDBIDs) {
    	this.agentDBIDs = agentDBIDs;
    	return this;
    }
    
    @Override
	public String toString() {
		return "{"
			+ "tenantDBID = " + this.tenantDBID+" , "
			+ "capacityTableDBID = " + this.capacityTableDBID+" , "
			+ "quotaTableDBID = " + this.quotaTableDBID+" , "
			+ "siteDBID = " + this.siteDBID+" , "
			+ "contractDBID = " + this.contractDBID+" , "
			+ "sate = " + this.sate+" , "
			+ "name = " + this.name+" , "
			+ "DBID = " + this.DBID+" , "
			+ "agentDBIDs = " + this.agentDBIDs + "}";
	}
}
    
    