package com.JavaProgram;


public class RepeatedSubstringpattern {
	
	public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int i=1; i<= n/2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                System.out.println("substring--"+substring);
                StringBuilder repeated = new StringBuilder();
                
                for (int j = 0; j < n/i; j++) {
                    repeated.append(substring);
                }
                if (s.equals(repeated.toString())) {
                    return true;
                }
            }
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		RepeatedSubstringpattern ss = new RepeatedSubstringpattern();
		
		String s = "ababab";
		
		System.out.println("OUTPUT: "+ss.repeatedSubstringPattern(s));
		
		
		
	}

}