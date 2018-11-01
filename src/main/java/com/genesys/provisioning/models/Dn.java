package com.genesys.provisioning.models;

import java.util.Map;

public class Dn {

	private String DBID = null;
	private String switchDBID = null;
	private String tenantDBID = null;
	private String type = null;
	private String number = null;
	private String loginFlag = null;
	private String registerAll = null;
	private String groupDBID = null;
	private String trunks = null;
	private String routeType = null;
	private String state = null;
	private Object userProperties = null;
	private String name = null;
	private String useOverride = null;
	private String switchSpecificType = null;
	private String siteDBID = null;
	private String contractDBID = null;
	private String id = null;
	private Object folder = null;
	private Object switch_ = null;

	public Dn(){}
	
	public Dn(Map<String, Object> in) {
		if(in.containsKey("DBID")) this.DBID = (String)in.get("DBID");
		if(in.containsKey("switchDBID")) this.switchDBID = (String)in.get("switchDBID");
		if(in.containsKey("tenantDBID")) this.tenantDBID = (String)in.get("tenantDBID");
		if(in.containsKey("type")) this.type = (String)in.get("type");
		if(in.containsKey("number")) this.number = (String)in.get("number");
		if(in.containsKey("loginFlag")) this.loginFlag = (String)in.get("loginFlag");
		if(in.containsKey("registerAll")) this.registerAll = (String)in.get("registerAll");
		if(in.containsKey("groupDBID")) this.groupDBID = (String)in.get("groupDBID");
		if(in.containsKey("trunks")) this.trunks = (String)in.get("trunks");
		if(in.containsKey("routeType")) this.routeType = (String)in.get("routeType");
		if(in.containsKey("state")) this.state = (String)in.get("state");
		if(in.containsKey("userProperties")) this.userProperties = (Object)in.get("userProperties");
		if(in.containsKey("name")) this.name = (String)in.get("name");
		if(in.containsKey("useOverride")) this.useOverride = (String)in.get("useOverride");
		if(in.containsKey("switchSpecificType")) this.switchSpecificType = (String)in.get("switchSpecificType");
		if(in.containsKey("siteDBID")) this.siteDBID = (String)in.get("siteDBID");
		if(in.containsKey("contractDBID")) this.contractDBID = (String)in.get("contractDBID");
		if(in.containsKey("id")) this.id = (String)in.get("id");
		if(in.containsKey("folder")) this.folder = (Object)in.get("folder");
		if(in.containsKey("switch")) this.switch_ = (Object)in.get("switch");
	}

	public void setDBID(String DBID) {
		this.DBID = DBID;
	}

	public String getDBID() {
		return this.DBID;
	}

	public void setSwitchDBID(String switchDBID) {
		this.switchDBID = switchDBID;
	}

	public String getSwitchDBID() {
		return this.switchDBID;
	}

	public void setTenantDBID(String tenantDBID) {
		this.tenantDBID = tenantDBID;
	}

	public String getTenantDBID() {
		return this.tenantDBID;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	public String getLoginFlag() {
		return this.loginFlag;
	}

	public void setRegisterAll(String registerAll) {
		this.registerAll = registerAll;
	}

	public String getRegisterAll() {
		return this.registerAll;
	}

	public void setGroupDBID(String groupDBID) {
		this.groupDBID = groupDBID;
	}

	public String getGroupDBID() {
		return this.groupDBID;
	}

	public void setTrunks(String trunks) {
		this.trunks = trunks;
	}

	public String getTrunks() {
		return this.trunks;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getRouteType() {
		return this.routeType;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setUserProperties(Object userProperties) {
		this.userProperties = userProperties;
	}

	public Object getUserProperties() {
		return this.userProperties;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setUseOverride(String useOverride) {
		this.useOverride = useOverride;
	}

	public String getUseOverride() {
		return this.useOverride;
	}

	public void setSwitchSpecificType(String switchSpecificType) {
		this.switchSpecificType = switchSpecificType;
	}

	public String getSwitchSpecificType() {
		return this.switchSpecificType;
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

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setFolder(Object folder) {
		this.folder = folder;
	}

	public Object getFolder() {
		return this.folder;
	}

	public void setSwitch(Object switch_) {
		this.switch_ = switch_;
	}

	public Object getSwitch() {
		return this.switch_;
	}

	@Override
	public String toString() {
		return "{"
			+ "DBID = " + this.DBID+" ,\n "
			+ "switchDBID = " + this.switchDBID+" ,\n "
			+ "tenantDBID = " + this.tenantDBID+" ,\n "
			+ "type = " + this.type+" ,\n "
			+ "number = " + this.number+" ,\n "
			+ "loginFlag = " + this.loginFlag+" ,\n "
			+ "registerAll = " + this.registerAll+" ,\n "
			+ "groupDBID = " + this.groupDBID+" ,\n "
			+ "trunks = " + this.trunks+" ,\n "
			+ "routeType = " + this.routeType+" ,\n "
			+ "state = " + this.state+" ,\n "
			+ "userProperties = " + this.userProperties+" ,\n "
			+ "name = " + this.name+" ,\n "
			+ "useOverride = " + this.useOverride+" ,\n "
			+ "switchSpecificType = " + this.switchSpecificType+" ,\n "
			+ "siteDBID = " + this.siteDBID+" ,\n "
			+ "contractDBID = " + this.contractDBID+" ,\n "
			+ "id = " + this.id+" ,\n "
			+ "folder = " + this.folder+" ,\n "
			+ "switch = " + this.switch_ + "\n}";
	}
}

