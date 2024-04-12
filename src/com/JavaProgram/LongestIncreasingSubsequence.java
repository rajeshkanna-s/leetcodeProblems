package com.JavaProgram;

public class LongestIncreasingSubsequence {
	
	 public int lengthOfLIS(int[] nums) {
		
		 int output = 0;
		 int[] lis= new int[nums.length];
		 
		 int pre =0;
		 for(int k=0; k<nums.length; k++) {
			 lis[k]=1;
			 
		 }
		 //{0,1,0,3,2,3}
		 
		 //{1,1,1,1,1,1}
		 //{1,2,1,2,2,2}
		 //{1,2,1,3,3,3}
		 //{1,2,1,2,2,2}
		 //{1,2,1,2,2,3}
		 for(int j=0; j<nums.length; j++) {
			 
			 for(int i=j+1; i<nums.length; i++) {
				 
				 if (nums[i]>nums[j] && lis[i]>=lis[j]) {
					 
					 pre=lis[i];
					 lis[i]=1+lis[j];
					 if(lis[i]<pre) {
						 lis[i]=pre;
					 }
					 
				 }
				 
				// System.out.println(j+"----"+lis[i]);
			 }
			 
		 }
	       
		 
		 for(int k=0; k<nums.length; k++) {
			 System.out.println(lis[k]);
			 
		 }
		 int maxNum = lis[0];
		 for (int num : lis) {
	            if (num > maxNum) {
	                maxNum = num;
	            }
	        }
		 output=maxNum;
if(output==0) {
	output=1;
}

		 return output;
	    }
	
	public static void main(String[] args) {
		
		LongestIncreasingSubsequence lis=new LongestIncreasingSubsequence();
		int [] nums= {1,3,6,7,9,4,10,5,6};
		System.out.println("OUTPUT IS : "+lis.lengthOfLIS(nums));
	}
	
	

	

}
