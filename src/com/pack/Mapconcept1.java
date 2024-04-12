package com.pack;
import java.util.HashMap;
import java.util.Map;
public class Mapconcept1 {
	

	public static String getNameForLoginId(String loginId) {
		
		Map<String, String> loginIdToName = new HashMap<>();
		loginIdToName.put("KETN13705", "AKASH GANESAN");
        loginIdToName.put("KETN13173", "RAJESHKHANNA");
        loginIdToName.put("KETN11709", "AKASH N");
        loginIdToName.put("KETN1584", "VINOTH KUMAR");
        loginIdToName.put("KETN1581", "AVINASH A");
        loginIdToName.put("KETN1580", "SENTHOOR PANDI");
        loginIdToName.put("KETN1569", "POORNIMA M");
        loginIdToName.put("KETN1468", "DHINESH");
        loginIdToName.put("KHMTN345", "RAJAPANDIYAN J");
        loginIdToName.put("KETN1371", "RAMIREDDY KARTHIK REDDY");
        loginIdToName.put("KCL301915", "BALAKUMAR P");
        loginIdToName.put("KETN229", "NAVEEN KUMAR A");
        loginIdToName.put("KETN356", "AMIT BHATTACHARYA");
        loginIdToName.put("svijayanand", "VIJAYANAND S");
        loginIdToName.put("sbalachandar", "BALACHANDAR S");
        loginIdToName.put("cvenkateswaran", "VENKATESWARAN");
        loginIdToName.put("rvignesh", "VIGNESH R");
        loginIdToName.put("arkarthickbabu", "KARTHICK BABU AR");
        loginIdToName.put("atkarthik", "KARTHIK AT");
    
        String name = loginIdToName.get(loginId);
        if (name != null) {
            return name;
        } else {
            return "NA";
        }
    }
public static void main(String[] args) {
    // Test the method
    String name = getNameForLoginId("KETN13705");
    System.out.println("Name for login ID KETN13705: " + name);

    // Test with a login ID not present in the map
    String nonExistentName = getNameForLoginId("NonExistentID");
    System.out.println("Name for login ID NonExistentID: " + nonExistentName);
}
	

}
