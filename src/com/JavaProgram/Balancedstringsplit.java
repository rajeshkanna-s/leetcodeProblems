package com.JavaProgram;



public class Balancedstringsplit {
	
	public int balancedStringSplit(String s) {
		
		
		int lCount=0;
		int rcount=0;
		int balcount=0;
		
		for(char a: s.toCharArray()){
			
			if (a=='L') {
				lCount++;
				
			}else{
				
				rcount++;
			}
			
			if (lCount==rcount) {
				balcount++;
				
			}
			
		
		}
		
		
		return balcount;
	}	
	
	
	public static void main (String args[]) {
		
		Balancedstringsplit ss=new Balancedstringsplit();
		
		System.out.println("OUTPUT: "+ss.balancedStringSplit("RLRRLLRLRL"));
	}

}
