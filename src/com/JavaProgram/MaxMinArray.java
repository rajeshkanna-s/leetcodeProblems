package com.JavaProgram;
public class MaxMinArray {
	
	
	public void minMaxarray(int[] nums){
		//{5, 12, 3, 7, 25, 8}
		
		int a= nums[0];
		int b= nums[0];
      for(int i=1;i<nums.length;i++) {
    	   if (a<nums[i]) {
    		   
    		   a=nums[i];
    	   }
    	  
      }
      
      for(int i=1; i<nums.length;i++) {
    	   if(b>nums[i]) {
    		   b=nums[i];
    	   }
    	  
      }
       
       
        System.out.println("max----"+a);
        System.out.println("min----"+b);
	}
	
	
	public static void main(String [] args) {
		
		int[] nums = {5, 12, 3, 7, 25, 8};
		MaxMinArray ss= new MaxMinArray();
		ss.minMaxarray(nums);
		
	
		
	}

}
