package com.app.log;

public class Test1 {
	
	
	public static void main(String[] args) {
	String slot="upgrade";
	String ver="3.0";
		getVersion(slot,ver);
	}
	
	public static String getVersion(String slot, String ver) {
			if (!(ver.equals("1.0") || ver.equals("2.0"))) {
				System.out.println("Txn");
			if (slot.equals("upgrade")) {
				ver = "2.0";
			} else {
				ver = "1.0";
			}			
		}
		System.out.println("Version:: " + ver);
		return ver;
	}

}
