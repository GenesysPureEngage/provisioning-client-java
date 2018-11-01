package com.genesys.provisioning.models;

import java.util.List;

public class Results<ObjectType> {
	private List<ObjectType> results = null;
	private Integer totalCount = null;
	
	public Results() {
		
	}
	
	public List<ObjectType> getResults() {
		return results;
	}
	
	public void setResults(List<ObjectType> results) {
		this.results = results;
	}
	
	public Integer getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}