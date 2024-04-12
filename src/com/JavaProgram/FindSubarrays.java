package com.JavaProgram;

public class FindSubarrays {
	
	
public boolean findSubarrays(int[] nums) {
	//{4,2,4}
	int pre=0;
	int sec=0;
	int a1=0;
	int a2=0;
	int a3=0;
	int a4=0;
		for(int i=0; i<nums.length-1;i++) {
			for(int j=0; j<nums.length-1;j++) {
				if(i!=j) {
				pre=nums[i]+nums[j];
				a1=nums[i];
				a2=nums[j];
				i++;
				j++;
				System.out.println("a1a2--"+a1+" "+a2);
				if(pre==nums[i]+nums[j]) {
					a3=nums[i];
					a4=nums[j];
					System.out.println("a3a4--"+a3+" "+a4);
					return true;
					
				}else {
					return false;
				}
				}
			}
			
		}
		
		//System.out.println(a1+" "+a2);
		//System.out.println(a3+" "+a4);
		
	
        
	return false;
    }
	
	
	public static void main(String[] args) {
		FindSubarrays ss=new FindSubarrays();
		int[] in = {1,2,3,2,1};
		System.out.println("OUTPUT: "+ss.findSubarrays(in));
	}

}
