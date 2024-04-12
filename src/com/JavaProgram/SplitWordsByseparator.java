package com.JavaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SplitWordsByseparator {
	
	
public List<String> splitWordsBySeparator(List<String> words, char separator) {
	List<String> result = new ArrayList<>();
	int count=0;
	
	for(String item : words) {
		count = item.length() - item.replace(String.valueOf(separator), "").length();
		
		if (separator==item.charAt(0)&& separator==item.charAt(item.length()-1) && count <3 ) {
			//System.out.println(item.charAt(0));
			//System.out.println(item.charAt(item.length()-1));
			
				result.add(item.replace(separator, ' ').trim());
				if(result.contains("")) {
					result.remove("");
				}
				
				
			
			  
		}
		else {
			//System.out.println(item.split(String.valueOf(separator)));
			String[] parts = item.split(Pattern.quote(String.valueOf(separator)));
			for(String part : parts) {
				
				if (part!=Pattern.quote(String.valueOf(separator))) {
					//System.out.println(part);
			result.add(part);
			if(result.contains("")) {
				result.remove("");
			}
			
				}
		}
		
	}
	}
	
	return result;
    }
	
	
	public static void main(String[] args) {
		
		SplitWordsByseparator ss= new SplitWordsByseparator();
		
		List<String> words = new ArrayList<>();
		words.add("|,,|,|||");
		//words.add("four.five");
		//words.add("six");
		char separator='|';
		
		System.out.println(ss.splitWordsBySeparator(words,separator));
	}

}
