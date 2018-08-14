package com.genesys.provisioning.models;

import java.util.Map;
import java.util.List;

public class ExportFilterParams {

    private List<String> agentGroupFilter = null;
    private String order = null;
	private List<String> sortBy = null;
	private String subResources = null;
    
    public ExportFilterParams() {
    	
    }

    public List<String> getAgentGroupFilter() {
        return agentGroupFilter;
    }

    public void setAgentGroupFilter(List<String> agentGroupFilter) {
        this.agentGroupFilter = agentGroupFilter;
    }
    
    public ExportFilterParams agentGroupFilter(List<String> agentGroupFilter) {
    	this.agentGroupFilter = agentGroupFilter;
    	return this;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
    public ExportFilterParams order(String order) {
    	this.order = order;
    	return this;
    }
    
    public List<String> getSortBy() {
        return sortBy;
    }

    public void setSortBy(List<String> sortBy) {
        this.sortBy = sortBy;
    }
    
    public ExportFilterParams sortBy(List<String> sortBy) {
    	this.sortBy = sortBy;
    	return this;
    }
    
    public String getSubResources() {
        return subResources;
    }

    public void setSubResources(String subResources) {
        this.subResources = subResources;
    }
    
    public ExportFilterParams subResources(String subResources) {
    	this.subResources = subResources;
    	return this;
    }
    
    @Override
    public String toString() {
		return "{"
			+ "agentGroupFilter = " + this.agentGroupFilter + " , "
			+ "order = " + this.order + " , "
			+ "sortBy = " + this.sortBy + " , "
			+ "subResources = " + this.subResources + "}";
    }

}
