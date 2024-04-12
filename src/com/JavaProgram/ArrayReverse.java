package com.JavaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayReverse {
	
	public List stackreverse(String[] s) {
		
		List<String> list = new ArrayList<>();
		Stack<String> stack =new Stack<>();
		
		for(String a :s) {
		stack.push(a);
		}
		for(int i=0; i< s.length; i++) {
			
			list.add(stack.pop());
			
			}
		return list;
	}
	
	public String stringBuilderreverse(String[] s) {
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		
		for(String a: s) {
			
			sb.append(a);
		}
		
		//System.out.println(sb.reverse().toString());
		

		return sb.reverse().toString();
	}
	
	
	public int[] normalreverse(int[] s) {
		
		int first = 0;
		int last =s.length-1;
		int temp =0;
		
		while(first<last) {
			
			temp= s[first];
			s[first]=s[last];
			s[last] = temp;
			first++;
			last--;
		}
		
		for(int a: s) {
			
			System.out.println(a);
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		ArrayReverse ss = new ArrayReverse();
		
		String[] s = {"1","2","3","4","5"};
		int [] i= {1,2,3,4,5};
		
		//System.out.println("OUTPUT: "+ss.stackreverse(s));
		//System.out.println("OUTPUT: "+ss.stringBuilderreverse(s));
		  System.out.println("OUTPUT: "+ss.normalreverse(i));
		
	}

}
