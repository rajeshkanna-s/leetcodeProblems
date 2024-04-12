package com.JavaProgram;

public class ArrayExample1 {
	
	public static int[] arrayop(int[]  nums, int target) {
		int[] outputarray = new int[2];
		System.out.println("target="+target);
		System.out.println("nums="+nums[0]);
		boolean found = false;
		 for (int i = 0; i<nums.length;i++)
			
		 {
			 for (int j = 1; j<nums.length;j++)
			 if (target==nums[i]+nums[j]&& i!=j) {
				 System.out.println(nums[i]+nums[j]+"==Matched target");
				 outputarray[0] =i;
				 outputarray[1] =j;
				 found = true; 
		            break;
			 }
			 if (found) {
			        break; 
			    }
		 }
		 System.out.print("outputarray: ");
		 for (int i = 0; i < outputarray.length; i++) {
		     System.out.print(outputarray[i] + " ");
		 }
		
		return  outputarray;
	}
	
	public static void main(String args[]) {
		
		int[] nums = {2,6,5,11};
		
		int target = 13;
		
		arrayop(nums,target);
	}

}
