package com.genesys.provisioning.models;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class WweProperties {
	private List<String> roles = new ArrayList();
	
	WweProperties() {}
	
	WweProperties(Map<String, Object> in) {
		if(in.containsKey("roles")) this.roles = (List<String>)in.get("roles");
	}
	
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	public List<String> getRoles() {
		return this.roles;
	}
}