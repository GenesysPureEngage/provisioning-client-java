package com.genesys.provisioning.models;

public enum SipPhoneType {
	
    DISABLE_CTI(),
    
    GENESYS_SOFTPHONE(),
    
    GENESYS_420HT_AUDIOCODES_4XXHD(),
    
    GENERIC_PHONE();

    public static SipPhoneType fromString(String in) {
    	 switch(in) {
    	 	case "DISABLE_CTI": return DISABLE_CTI;
    	 	case "GENESYS_SOFTPHONE": return GENESYS_SOFTPHONE;
    	 	case "GENESYS_420HT_AUDIOCODES_4XXHD": return GENESYS_420HT_AUDIOCODES_4XXHD;
    	 	case "GENERIC_PHONE": return GENERIC_PHONE;
    	 }
    	 return null;
    }
    
    public String toString() {
    	switch(this) {
    		case DISABLE_CTI: return "DISABLE_CTI";
    	 	case GENESYS_SOFTPHONE: return "GENESYS_SOFTPHONE";
    	 	case GENESYS_420HT_AUDIOCODES_4XXHD: return "GENESYS_420HT_AUDIOCODES_4XXHD";
    	 	case GENERIC_PHONE: return "GENERIC_PHONE";
    	}
    	return null;
    }
    
}