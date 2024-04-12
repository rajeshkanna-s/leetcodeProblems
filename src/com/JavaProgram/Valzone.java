package com.JavaProgram;

import java.util.regex.Pattern;

public class Valzone {
	
	public static boolean isValidPAN(String pan) {
        String panPattern = "[A-Z]{3}[ABCFGHLJPTF]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}";
        return Pattern.compile(panPattern).matcher(pan).matches();
    }
    public static String isValidGmail(String email) {
        String gmailPattern = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*(\\.[a-zA-Z]{2,})$";
        return Pattern.compile(gmailPattern).matcher(email).matches() ? email.toLowerCase()+" - IS Valid Email" : email+" - Invalid Email";
    }
    public static String isValidMOB(String mob) {
        if (!mob.matches("[6-9]\\d{9}")) return "Invalid MOB";
        if (mob.matches("(\\d)\\1{9}")) return "Invalid MOB (Repeated digit)";
        return "Verified MOB";
    }
    public static String isValidAad(String aad) {
        String aadPattern = "[2-9]\\d{11}";
        return Pattern.compile(aadPattern).matcher(aad).matches() ? "Verified AAD" : "Invalid AAD";
    }
    public static String isValidAge(String cusAge) {
        int age = Integer.parseInt(cusAge);
        String ageeligible = "";
        if(age >= 15 && age <= 80)ageeligible = "Eligible";
        else ageeligible = "Not Eligible";
        return ageeligible;
      
    }
    public static void main(String []args) {
        
        System.out.println(isValidPAN("DPUPG5260Q"));
        System.out.println(isValidGmail("Akashg2203@gmail.com"));
        System.out.println(isValidMOB("8870356890"));
        System.out.println(isValidAad("859095961938"));
        System.out.println(isValidAad("859095961938"));
        System.out.println(isValidAge("17"));
        
        
        
    }

}
