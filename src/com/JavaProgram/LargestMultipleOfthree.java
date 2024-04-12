package com.JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestMultipleOfthree {
	
	
	 public String largestMultipleOfThree(int[] digits) {
	        //{8,6,7,1,0}
		 int sum=0;
		 int finalvalue=1;
		 List<Integer> list = new ArrayList<>();
		 
		if (Collections.min(list).equals(0)) {
			
			finalvalue=0;
			list.remove(Collections.min(list));
		}
		 
		 
		 for(int a:digits) {
			 list.add(a);
		 }
		 //{8,7,6,1,0}
		 Collections.sort(list);
		 
		 for(int k=0; k<list.size(); k++) {
		 System.out.println("List size==="+list.size());
		 for(int i=list.size()-1; i>=0; i--) {
			 
			 sum=sum+list.get(i);
			 
		 }
		 System.out.println("sum==="+sum);
		 if (sum%3==0) {
			 return "HI"; 
		  }else {
			  list.remove(Collections.min(list));
			  sum=0;
		  }
		 }
		 return "";
	    }
	
	public static void main(String [] args) {
		
		int[] a = {8,6,7,1,0};
		
		LargestMultipleOfthree ss = new LargestMultipleOfthree();
		
		
		System.out.println("OUTPUT: "+ss.largestMultipleOfThree(a));
		
		
		
	}

}
