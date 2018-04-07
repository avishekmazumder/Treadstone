package com.avi.common;

public enum BusinessDayConventions {
	
	NONE("None"),
	FOLLOWING("Following");
	
	private String value;
	
	private BusinessDayConventions(String value) {
		this.setValue(value);

	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static boolean contains(String enumString) {		
		
		for(BusinessDayConventions bdc : BusinessDayConventions.values()) {
			if(bdc.value.equals(enumString)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static BusinessDayConventions fromValue(String enumString) {
		
		for(BusinessDayConventions bdc : BusinessDayConventions.values()) {
			if(bdc.value.equals(enumString)) {
				return bdc;
			}
		}
		throw new IllegalArgumentException();
	}

}
