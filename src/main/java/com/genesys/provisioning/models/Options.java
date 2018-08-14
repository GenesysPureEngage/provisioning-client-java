package com.genesys.provisioning.models;

import java.util.Map;

public class Options {
  
	private Map<String, Object> options = null;
	private String cmeAppName = null;
	private String cmeAppDBID = null;

	public Options(){}

	public void setOptions(Map<String, Object> options) {
		this.options = options;
	}

	public Map<String, Object> getOptions() {
		return this.options;
	}

	public void setCmeAppName(String cmeAppName) {
		this.cmeAppName = cmeAppName;
	}

	public String getCmeAppName() {
		return this.cmeAppName;
	}

	public void setCmeAppDBID(String cmeAppDBID) {
		this.cmeAppDBID = cmeAppDBID;
	}

	public String getCmeAppDBID() {
		return this.cmeAppDBID;
	}
  	
  	
	@Override
	public String toString() {
		return "{"
			+ "options = " + this.options+" , "
			+ "cmeAppName = " + this.cmeAppName+" , "
			+ "cmeAppDBID = " + this.cmeAppDBID + "}";
	}
  
}