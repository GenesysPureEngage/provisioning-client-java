package com.genesys.provisioning.models;

import java.util.List;
import java.util.ArrayList;

public class ImportStatus {

	private List<String> activeImporters = new ArrayList();
	private String adminName = null;
	private List<String> failed = new ArrayList();
	private String lastEntity = null;
	private String operation = null;
	private String sheetName = null;
	private Boolean stopRequested = null;
	private Boolean stopped = null;
	private Integer succeedCount = null;
	private Integer totalCount = null;

	public ImportStatus() {
		
	}

	public void setActiveImporters(List<String> activeImporters) {
		this.activeImporters = activeImporters;
	}

	public List<String> getActiveImporters() {
	  	return this.activeImporters;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setFailed(List<String> failed) {
		this.failed = failed;
	}

	public List<String> getFailed() {
		return this.failed;
	}

	public void setLastEntity(String lastEntity) {
	   	this.lastEntity = lastEntity;
	}

	public String getLastEntity() {
	   	return this.lastEntity;
	}

	public void setOperation(String operation) {
	   this.operation = operation;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public String getSheetName() {
	  return this.sheetName;
	}

	public void setStopRequested(Boolean stopRequested) {
	  	this.stopRequested = stopRequested;
	}

	public Boolean getStopRequested() {
	   	return this.stopRequested;
	}

	public void setStopped(Boolean stopped) {
		this.stopped = stopped;
	}

	public Boolean getStopped() {
		return this.stopped;
	}

	public void setSucceedCount(Integer succeedCount) {
		this.succeedCount = succeedCount;
	}

	public Integer getSucceedCount() {
		return this.succeedCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}
	
	@Override
	public String toString() {
		return "{"
			+ "activeImporters = " + this.activeImporters+" , "
			+ "adminName = " + this.adminName+" , "
			+ "failed = " + this.failed+" , "
			+ "lastEntity = " + this.lastEntity+" , "
			+ "operation = " + this.operation+" , "
			+ "sheetName = " + this.sheetName+" , "
			+ "stopRequested = " + this.stopRequested+" , "
			+ "stopped = " + this.stopped+" , "
			+ "succeedCount = " + this.succeedCount+" , "
			+ "totalCount = " + this.totalCount + "}";
	}
  
}