package com.JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class Shuffledstring {
	
	
	
public String restoreString(String s, int[] indices) {
	
	StringBuilder result = new StringBuilder();
	
	Map<Integer, Character> map= new HashMap<>();
	
	String[] opt = new String[indices.length];
	
	
	for(int i=0; i<opt.length; i++) {
		
		map.put(indices[i], s.charAt(i));
		
	}
	for(int i=0; i<opt.length; i++) {
	result.insert(i, map.get(i));
	}
	return result.toString();
    }


	public static void main(String args[]) {
		
		Shuffledstring ss = new Shuffledstring();
		
		String s = "codeleet"; 
		int [] ind  = {4,5,6,7,0,2,1,3};
		ss.restoreString(s,ind);
		
	}

}
