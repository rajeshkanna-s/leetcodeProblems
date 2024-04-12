package com.JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedianSortedArrays {
	
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 double op=0.0;
		 int d=nums1.length-1;
		 int a=0,b=0;
		 double sum1=0.0,sum2=0.0;
		 double total=0.0;
		 List<Integer> list = new ArrayList<>();
		 int len=nums1.length+nums2.length;
		 
		 int [] newnums =new int[len];
		 
		 for(int i=0; i<nums1.length;i++) {
			 
			 list.add(nums1[i]);
		 }
		 System.out.println("d before-"+d);
          for(int i=0; i<nums2.length;i++) {
        	  d++;
        	  System.out.println("d After-"+d);
        	  list.add(nums2[i]);
		 }
          //{1,2,3,4,5,6,7,8,9,10}
          //{1,2,3,4,5,6,7,8,9,10,11}
          Collections.sort(list);
          for(int i=0; i<list.size();i++) {
        	  newnums[i]= list.get(i);
 		 }
          
          for(int s: newnums) {
        	  System.out.println("Final Array is :"+s);
          }
          
          if(len%2==0) {
        	  
        	   a= len/2; 
        	   
        	   sum1=newnums[a-1]+newnums[a];
        	   System.out.println("sum1-"+sum1);
        	   total=sum1/2;
        	   
          }else {
        	  b= (len+1)/2; 
        	  sum2=newnums[b-1];
        	  total=sum2;
          }
          
        System.out.println(total);
		 
		 return total;
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String []arges) {
		int [] nums1 = {1,3};
		int [] nums2 = {2};
		FindMedianSortedArrays ss= new FindMedianSortedArrays();
		System.out.println("OUTPUT IS :"+ss.findMedianSortedArrays(nums1,nums2));
		
	}

}
