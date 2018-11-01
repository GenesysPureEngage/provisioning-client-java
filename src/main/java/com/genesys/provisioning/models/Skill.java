package com.genesys.provisioning.models;

import java.util.Map;

public class Skill {

    private Integer level;
    private String name;

    
    public Skill() {
    	
    }
	
	public Skill(Map<String, Object> in) {
		try {
	    	if(in.containsKey("level")) this.level = Integer.parseInt((String)in.get("level"));
	    } catch(NumberFormatException e) {}
  		if(in.containsKey("name")) this.name = (String)in.get("name");
	}
  	
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getLevel() {
    	return this.level;
    }
  	
    public Skill level(int level) {
    	this.level = level;
    	return this;
    }
  	
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
  	
    public Skill name(String name) {
    	this.name = name;
    	return this;
    }
    
    @Override
    public String toString() {
		return "{"
			+ "name = " + this.name + " , "
			+ "level = " + this.level + "}";
    }

}
