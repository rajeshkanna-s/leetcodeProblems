package com.JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

	
	public static int climbStairs(int n) {
		
		 Map<Integer, Integer> integerMap = new HashMap<>();
		 
		 int step1=1;
		 int step2=2;
		 int sum=0;
		 int remaining=0;
		 
		 for (int i = 1; i <= n; i++)
		 {
			 if (i==step1) {
				 integerMap.put(i,step1);
			 }else if (i==step2) 
			 {
				 integerMap.put(i,step2); 
			 }else {
				 remaining= i-step1;
				 if (integerMap.containsKey(remaining)) {
					 
						sum = integerMap.get(remaining);
						
						remaining= i-step2;
						 if (integerMap.containsKey(remaining)) {
							 sum = sum+integerMap.get(remaining);
						 }
						integerMap.put(i, sum);
						System.out.println(i+","+sum);
					}
			 }
		 }
		 System.out.println("SUM="+integerMap.get(n));
		 int value = integerMap.get(n);
			
		return value;
	}
	
	
	public static void main(String arg[]) {
		
		ClimbStairs cs = new ClimbStairs();
		System.out.println(cs.climbStairs(10)); 
		System.out.println(fibonacci(3));
	}

	
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
	}
}
