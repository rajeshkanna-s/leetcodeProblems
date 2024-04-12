package com.JavaProgram;
import java.util.ArrayList;
import java.util.List;

public class Newclass {
	
	
	public static void main(String args[]) {
		
		final String name = "Rajesh";
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(final int number : list) {
			
			System.out.println(number);
		}
		
	}

}
