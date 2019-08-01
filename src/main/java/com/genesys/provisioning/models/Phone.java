package com.genesys.provisioning.models;

import java.util.Map;

public class Phone {

    private String number;
    private String description;
    private Boolean isDefault;
    private String placeName;

    
    public Phone() {
    	
    }
    
    public Phone(Map<String, Object> in) {
		if(in.containsKey("number")) this.number = (String)in.get("number");
		if(in.containsKey("description")) this.description = (String)in.get("description");
		if(in.containsKey("isDefault")) this.isDefault = (Boolean)in.get("isDefault");
		if(in.containsKey("placeName")) this.placeName = (String)in.get("placeName");
	}
	
    
    public Phone(String number, String description, Boolean isDefault, String placeName) {
        super();
        this.number = number;
        this.description = description;
        this.isDefault = isDefault;
        this.placeName = placeName;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getNumber() {
    	return this.number;
    }
  	
    public Phone number(String number) {
    	this.number = number;
    	return this;
    }
  	
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
    	return this.description;
    }
  	
    public Phone description(String description) {
    	this.description = description;
    	return this;
    }
  	
    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
    
    public boolean getIsDefault() {
    	return this.isDefault;
    }
  	
    public Phone isDefault(boolean isDefault) {
    	this.isDefault = isDefault;
    	return this;
    }
  	
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    
    public String getPlaceName() {
    	return this.placeName;
    }
  	
    public Phone placeName(String placeName) {
    	this.placeName = placeName;
    	return this;
    }

}
