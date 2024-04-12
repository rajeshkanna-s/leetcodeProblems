package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicateArray {
	
	 public static ArrayList<Integer> duplicates(int arr[], int n) {
		    ArrayList<Integer> al = new ArrayList<>();
		    Set<Integer> set = new HashSet<>();
		    
		    Set<Integer> duplicatesSet = new HashSet<>();
		    
		    for (int num : arr) {
		        if (!set.add(num)) {
		            duplicatesSet.add(num);
		        }
		    }
		    
		    al.addAll(duplicatesSet);
		    
		    if (al.isEmpty()) {
		        al.add(-1);
		    } else {
		        Collections.sort(al);
		    }
		    
		    return al;
		}
		
	 
	 public static void main(String[] args) {
		 
		 int arr[]= {4,3,1,8,9,1};
		 int size = 5;
		 System.out.println("OUTPUT IS---"+duplicates(arr,size));
	 }

}
