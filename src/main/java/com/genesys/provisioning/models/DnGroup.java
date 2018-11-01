package com.genesys.provisioning.models;

import java.util.List;
import java.util.Map;

public class DnGroup {
	
  	private String tenantDBID = null;
  	private String capacityTableDBID = null;
  	private String quotaTableDBID = null;
  	private String siteDBID = null;
  	private String contractDBID = null;
  	private String sate = null;
  	private String name = null;
  	private String DBID = null;
  	private String type = null;
  	private List<Object> DNs = null;
  	
  	public DnGroup() {}
  	
  	public DnGroup(Map<String, Object> in) {
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
		if(in.containsKey("type")) this.type = (String)in.get("type");
  		if(in.containsKey("DNs")) this.DNs = (List<Object>)in.get("DNs");
  	}
  	
    public void setTenantDBID(String tenantDBID) {
        this.tenantDBID = tenantDBID;
    }
    
    public String getTenantDBID() {
    	return this.tenantDBID;
    }
  	
    public void setCapacityTableDBID(String capacityTableDBID) {
        this.capacityTableDBID = capacityTableDBID;
    }
    
    public String getCapacityTableDBID() {
    	return this.capacityTableDBID;
    }
  	
    public void setQuotaTableDBID(String quotaTableDBID) {
        this.quotaTableDBID = quotaTableDBID;
    }
    
    public String getQuotaTableDBID() {
    	return this.quotaTableDBID;
    }
  	
    public void setSiteDBID(String siteDBID) {
        this.siteDBID = siteDBID;
    }
    
    public String getSiteDBID() {
    	return this.siteDBID;
    }
  	
    public void setContractDBID(String contractDBID) {
        this.contractDBID = contractDBID;
    }
    
    public String getContractDBID() {
    	return this.contractDBID;
    }
  	
    public void setSate(String sate) {
        this.sate = sate;
    }
    
    public String getSate() {
    	return this.sate;
    }
  	
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
  	
    public void setDBID(String DBID) {
        this.DBID = DBID;
    }
    
    public String getDBID() {
    	return this.DBID;
    }
  	
    public void setDNs(List<Object> DNs) {
        this.DNs = DNs;
    }
    
    public List<Object> getDNs() {
    	return this.DNs;
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
			+ "type = " + this.type+" , "
			+ "DNs = " + this.DNs + "}";
	}
}