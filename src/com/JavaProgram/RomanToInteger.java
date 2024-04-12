package com.JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
	
	public int romanToInt(String s) {
		Map<String, Integer> romanToIntMap = new HashMap<>();
		int sum=0;
		int finalsum=0;
		String string=s;
		 int digit =0;
		romanToIntMap.put("I", 1);
		romanToIntMap.put("V", 5);
		romanToIntMap.put("X", 10);
		romanToIntMap.put("L", 50);
		romanToIntMap.put("C", 100);
		romanToIntMap.put("D", 500);
		romanToIntMap.put("M", 1000);
		romanToIntMap.put("IV", 4);
		romanToIntMap.put("IX", 9);
		romanToIntMap.put("XL", 40);
		romanToIntMap.put("XC", 90);
		romanToIntMap.put("CD", 400);
		romanToIntMap.put("CM", 900);
		
		
		for (int i = 0; i < string.length(); i++) {
			System.out.println("string length="+string.length());
		if (string.contains("IV")) {
			sum=romanToIntMap.get("IV");
			finalsum=finalsum+sum;
			string=string.replaceFirst("IV","");
			System.out.println("newString---+"+s);
		}
		if (string.contains("IX")) {
			sum=romanToIntMap.get("IX");
			finalsum=finalsum+sum;
			string=string.replaceFirst("IX","");
		}
		if (string.contains("XL")) {
			sum=romanToIntMap.get("XL");
			finalsum=finalsum+sum;
			string=string.replaceFirst("XL","");
		}
		if (string.contains("XC")) {
			sum=romanToIntMap.get("XC");
			finalsum=finalsum+sum;
			string=string.replaceFirst("XC","");
		}
		if (string.contains("CD")) {
			sum=romanToIntMap.get("CD");
			finalsum=finalsum+sum;
			string=string.replaceFirst("CD","");
		}
		if (string.contains("CM")) {
			sum=romanToIntMap.get("CM");
			finalsum=finalsum+sum;
			string=string.replaceFirst("CM","");
			System.out.println("s is -"+string);
			System.out.println("sum is -"+sum);
		}
		 }
		System.out.println("string length="+string.length());
		for(int i=0; i<string.length();i++) {
		
		if (string.contains("I")) {
			digit=digit+romanToIntMap.get("I");
			string=string.replaceFirst("I","#");
			
		}
		if (string.contains("V")) {
			digit=digit+romanToIntMap.get("V");
			string=string.replaceFirst("V","#");
		}
		if (string.contains("V")) {
			digit=digit+romanToIntMap.get("V");
			string=string.replaceFirst("V","#");
		}
		if (string.contains("X")) {
			digit=digit+romanToIntMap.get("X");
			string=string.replaceFirst("X","#");
		}
		if (string.contains("L")) {
			digit=digit+romanToIntMap.get("L");
			string=string.replaceFirst("L","#");
		}
		if (string.contains("C")) {
			digit=digit+romanToIntMap.get("C");
			string=string.replaceFirst("C","#");
		}
		if (string.contains("D")) {
			digit=digit+romanToIntMap.get("D");
			string=string.replaceFirst("D","#");
		}
		if (string.contains("M")) {
			digit=digit+romanToIntMap.get("M");
			string=string.replaceFirst("M","#");
		}
		}
		System.out.println("Final String is  -"+string);
		
		System.out.println("digit=="+finalsum+"+"+digit);
		return finalsum+digit;
	}
	
	public static int romanToInt1(String s) {
    	int value = 0;
    	int data = 0;
    	List<String> list = new ArrayList<>();
    	try {

    		char[] arr = s.toCharArray();
    		for (char e : arr) 
    			list.add(String.valueOf(e));

    		//for(String roman :list) {
    		for(int i=0; i<list.size(); i++) {
    			System.out.println(list.get(i));
        		if(list.get(i).equals("I")) {
        			if(i != list.size()-1) {
	        			if(list.get(i+1).equals("V")) {
	        				data = 4;
	        				list.remove(i+1);
	        			}else if(list.get(i+1).equals("X")) {
	        				data = 9;
	        				list.remove(i+1);
	        			}
	        			else 
	        				data = 1;
        			}else 
        				data = 1;
        		}
        		if(list.get(i).equals("V")) 
        			data = 5;
        		if(list.get(i).equals("X")) {
        			if(i != list.size()-1) {
            			if(list.get(i+1).equals("L")) {
            				data = 40;
            				list.remove(i+1);
            			}else if(list.get(i+1).equals("C")) {
            				data = 90;
            				list.remove(i+1);
            			}else 
            				data = 10;
        			}else 
        				data = 10;
        		}
        		if(list.get(i).equals("L")) data = 50;
        		if(list.get(i).equals("C")) {
        			if(i != list.size()-1) {
            			if(list.get(i+1).equals("M")) {
            				data = 900;
            				list.remove(i+1);
            			}else if(list.get(i+1).equals("D")) {
            				data = 400;
            				list.remove(i+1);
            			}else
            				data = 100;
        			}else
        				data = 100;
        		}
        		if(list.get(i).equals("D"))
        			data = 500;
        		if(list.get(i).equals("M"))
        			data = 1000;
        		value +=data;
    		}

    		System.out.println(value);

    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}
		return value;
    }
	public static void main(String args[]) {
		
		RomanToInteger RI=new RomanToInteger();
		
	System.out.println("OUTPUT--"+RI.romanToInt("CMCMCM"));	
	System.out.println("OUTPUT--"+RI.romanToInt1("CMCMCM"));
		
	}

}
