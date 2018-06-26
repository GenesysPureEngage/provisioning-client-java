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
    
    public Skill(Integer level, String name) {
        super();
        this.level = level;
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
