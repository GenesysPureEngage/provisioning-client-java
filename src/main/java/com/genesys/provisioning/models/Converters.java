package com.genesys.provisioning.models;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.genesys.internal.provisioning.model.AddUserDataData;
import com.genesys.internal.provisioning.model.AddUserDataDataWwe;
import com.genesys.internal.provisioning.model.UpdateUserDataData;
import com.genesys.internal.provisioning.model.UpdateUserDataDataWwe;
import com.genesys.internal.provisioning.model.CreateUserSuccessResponseDataPerson;
import com.genesys.internal.provisioning.model.CreateUserSuccessResponseDataPersonCfgAgentInfo;
import com.genesys.internal.provisioning.model.GetImportStatusResponseData;
import com.genesys.internal.provisioning.model.ExportFileDataFilterParameters;
import com.genesys.internal.provisioning.model.Extension;

public class Converters {
	
	public static AddUserDataData convertUserToAddUserDataData(User in) {
		if(in == null) return null;
		
		AddUserDataData out = new AddUserDataData();

		out.setChangePasswordOnNextLogin(in.getChangePasswordOnNextLogin());
		out.setEmailAddress(in.getEmailAddress());
		out.setEmployeeID(in.getEmployeeID());
		out.setExternalID(in.getExternalID());
		out.setEnabled(in.getEnabled());
		out.setFolder(in.getFolder());
		out.setUserName(in.getUserName());
		out.setFirstName(in.getFirstName());
		out.setLastName(in.getLastName());
		out.setLoginCode(in.getLoginCode());
		out.setPassword(in.getPassword());
		out.setPlaceNames(in.getPlaceNames());
		out.setIsAgent(in.getIsAgent());
		out.setWwe(convertWwePropertiesToAddUserDataDataWwe(in.getWwe()));
		out.setSwitchNames(in.getSwitchNames());
		out.setPhones(convertPhonesToExtensions(in.getPhones()));
		out.setSupportSoftPhone(in.getSupportSoftPhone());
		out.setSipPhoneType(convertSipPhoneTypeToAddUserSipPhoneTypeEnum(in.getSipPhoneType()));
		out.setSkills(convertSkillsToSkills(in.getSkills()));
		out.setAgentGroups(in.getAgentGroups());
		out.setAccessGroups(in.getAccessGroups());
		out.setVoiceMail(in.getVoiceMail());
		out.setWrapUpTime(doubleToString(in.getWrapUpTime()));

		return out;
	}
	
	public static UpdateUserDataData convertUserToUpdateUserDataData(User in) {
		if(in == null) return null;
		
		UpdateUserDataData out = new UpdateUserDataData();

		out.setChangePasswordOnNextLogin(in.getChangePasswordOnNextLogin());
		out.setEmailAddress(in.getEmailAddress());
		out.setEmployeeID(in.getEmployeeID());
		out.setExternalID(in.getExternalID());
		out.setEnabled(in.getEnabled());
		out.setUserName(in.getUserName());
		out.setFirstName(in.getFirstName());
		out.setLastName(in.getLastName());
		out.setLoginCode(in.getLoginCode());
		out.setPassword(in.getPassword());
		out.setPlaceNames(in.getPlaceNames());
		out.setWwe(convertWwePropertiesToUpdateUserDataDataWwe(in.getWwe()));
		out.setSwitchNames(in.getSwitchNames());
		out.setPhones(convertPhonesToExtensions(in.getPhones()));
		out.setSupportSoftPhone(in.getSupportSoftPhone());
		//out.setSipPhoneType(convertSipPhoneTypeToUpdateUserSipPhoneTypeEnum(in.getSipPhoneType()));
		out.setSkills(convertSkillsToSkills(in.getSkills()));
		out.setAgentGroups(in.getAgentGroups());
		out.setAccessGroups(in.getAccessGroups());
		out.setVoiceMail(in.getVoiceMail());
		out.setWrapUpTime(in.getWrapUpTime().toString());

		return out;
	}
	
	public static Person convertCreateUserSuccessResponseDataPersonToPerson(CreateUserSuccessResponseDataPerson in) {
		Person out = new Person();

		out.setDBID(in.getDBID());
		out.setTenantDBID(in.getTenantDBID());
		out.setLastName(in.getLastName());
		out.setFirstName(in.getFirstName());
		out.setUserName(in.getUserName());
		out.setPassword(in.getPassword());
		out.setIsAgent(in.getIsAgent());
		out.setIsAdmin(in.getIsAdmin());
		out.setState(in.getState());
		out.setIsExternalAuth(in.getIsExternalAuth());
		out.setChangePasswordOnNextLogin(in.getChangePasswordOnNextLogin());
		out.setPasswordHashAlgorithm(in.getPasswordHashAlgorithm());
		out.setPasswordUpdatingDate(in.getPasswordUpdatingDate());
		out.setEmailAddress(in.getEmailAddress());
		out.setAgentInfo(convertCreateUserSuccessResponseDataPersonCfgAgentInfoToAgentInfo(in.getCfgAgentInfo()));
		out.setId(in.getId());

		return out;
	}
	
	public static AgentInfo convertCreateUserSuccessResponseDataPersonCfgAgentInfoToAgentInfo(CreateUserSuccessResponseDataPersonCfgAgentInfo in) {
		AgentInfo out = new AgentInfo();

		out.setPlaceDBID(in.getPlaceDBID());
		out.setSiteDBID(in.getSiteDBID());
		out.setContractDBID(in.getContractDBID());
		out.setCapacityRuleDBID(in.getCapacityRuleDBID());

		return out;
	}
	
	public static List<Extension> convertPhonesToExtensions(List<Phone> in) {
		if(in == null) return null;
		
		List<Extension> out = new ArrayList();
		for(Phone i:in) out.add(convertPhoneToExtension(i));
		return out;
	}
	
	public static Extension convertPhoneToExtension(Phone in) {
		if(in == null) return null;
		
		Extension out = new Extension();

		out.setNumber(in.getNumber());
		out.setDescription(in.getDescription());
		out.setIsDefault(in.getIsDefault());
		out.setPlaceName(in.getPlaceName());

		return out;
	}
	
	public static List<com.genesys.internal.provisioning.model.Skill> convertSkillsToSkills(List<Skill> in) {
		if(in == null) return null;
		
		List<com.genesys.internal.provisioning.model.Skill> out = new ArrayList();
		for(Skill i:in) out.add(convertSkillToSkill(i));
		return out;
	}
	
	public static com.genesys.internal.provisioning.model.Skill convertSkillToSkill(Skill in) {
		if(in == null) return null;
		
		com.genesys.internal.provisioning.model.Skill out = new com.genesys.internal.provisioning.model.Skill();

		out.setLevel(in.getLevel());
		out.setName(in.getName());

		return out;
	}
	
	public static AddUserDataData.SipPhoneTypeEnum convertSipPhoneTypeToAddUserSipPhoneTypeEnum(SipPhoneType in) {
		if(in == null) return null;
		
		switch(in) {
			case DISABLE_CTI: return AddUserDataData.SipPhoneTypeEnum.DISABLE_CTI;
			case GENESYS_SOFTPHONE: return AddUserDataData.SipPhoneTypeEnum.GENESYS_SOFTPHONE;
			case GENESYS_420HT_AUDIOCODES_4XXHD: return AddUserDataData.SipPhoneTypeEnum.GENESYS_420HT_AUDIOCODES_4XXHD;
			case GENERIC_PHONE: return AddUserDataData.SipPhoneTypeEnum.GENERIC_PHONE;
			
		}
		return null;
	}
	
	public static AddUserDataDataWwe convertWwePropertiesToAddUserDataDataWwe(WweProperties in) {
		if(in == null) return null;
		
		AddUserDataDataWwe out = new AddUserDataDataWwe();

		out.setRoles(in.getRoles());

		return out;
	}
	
	public static UpdateUserDataDataWwe convertWwePropertiesToUpdateUserDataDataWwe(WweProperties in) {
		if(in == null) return null;
		
		UpdateUserDataDataWwe out = new UpdateUserDataDataWwe();

		out.setRoles(in.getRoles());

		return out;
	}
	
	public static List<Skill> convertMapListToSkills(List<Map> in) {
		if(in == null) return null;
		
		List<Skill> out = new ArrayList();
		for(Map i:in) out.add(new Skill(i));
		return out;
	}
	
	public static List<Phone> convertMapListToPhones(List<Map> in) {
		if(in == null) return null;
		
		List<Phone> out = new ArrayList();
		for(Map i:in) out.add(new Phone(i));
		return out;
	}
	
	public static ExportFileDataFilterParameters convertExportFilterParamsToExportFileDataFilterParameters(ExportFilterParams in) {
		if(in == null) return null;
		
		ExportFileDataFilterParameters out = new ExportFileDataFilterParameters();
		
		out.setAgentGroupFilter(in.getAgentGroupFilter());
		out.setOrder(in.getOrder());
		out.setSortBy(in.getSortBy());
		out.setSubresources(in.getSubResources());
	
		return out;
	}
	
	public static ImportStatus convertGetImportStatusResponseDataToImportStatus(GetImportStatusResponseData in) {
		if(in == null) return null;
		
		ImportStatus out = new ImportStatus();

		out.setActiveImporters(in.getActiveImporters());
		out.setAdminName(in.getAdminName());
		out.setFailed(in.getFailed());
		out.setLastEntity(in.getLastEntity());
		out.setOperation(in.getOperation());
		out.setSheetName(in.getSheetName());
		out.setStopRequested(in.StopRequested());
		out.setStopped(in.Stopped());
		out.setSucceedCount(in.getSucceedCount());
		out.setTotalCount(in.getTotalCount());

		return out;
	}
	
	public static List<Dn> convertMapListToDnList(List<Object> in) {
		if(in == null) return null;
		
		List<Dn> out = new ArrayList();
		for(Object i:in) out.add(new Dn((Map<String,Object>)i));
		return out;
	}
	
	public static List<AgentGroup> convertMapListToAgentGroupList(List<Object> in) {
		if(in == null) return null;
		
		List<AgentGroup> out = new ArrayList();
		for(Object i:in) out.add(new AgentGroup((Map<String,Object>)i));
		return out;
	}
	
	public static List<DnGroup> convertMapListToDnGroupList(List<Object> in) {
		if(in == null) return null;
		
		List<DnGroup> out = new ArrayList();
		for(Object i:in) out.add(new DnGroup((Map<String,Object>)i));
		return out;
	}
	
	public static String doubleToString(Double d) {
		if(d == null) return null;
		return d.toString();
	}
	
	
}