package com.genesys.provisioning.models;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.genesys.internal.provisioning.model.AddUserDataData;
import com.genesys.internal.provisioning.model.AddUserDataDataWwe;
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
		out.setSipPhoneType(convertSipPhoneTypeToSipPhoneTypeEnum(in.getSipPhoneType()));
		out.setSkills(convertSkillsToSkills(in.getSkills()));
		out.setAgentGroups(in.getAgentGroups());
		out.setAccessGroups(in.getAccessGroups());
		out.setVoiceMail(in.getVoiceMail());
		out.setWrapUpTime(in.getWrapUpTime().toString());

		return out;
	}
	
	public static List<Extension> convertPhonesToExtensions(List<Phone> in) {
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
	
	public static AddUserDataData.SipPhoneTypeEnum convertSipPhoneTypeToSipPhoneTypeEnum(SipPhoneType in) {
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
	
	public static List<Skill> convertMapListToSkills(List<Map> in) {
		List<Skill> out = new ArrayList();
		for(Map i:in) out.add(new Skill(i));
		return out;
	}
	
	public static List<Phone> convertMapListToPhones(List<Map> in) {
		List<Phone> out = new ArrayList();
		for(Map i:in) out.add(new Phone(i));
		return out;
	}
	
	
	
}