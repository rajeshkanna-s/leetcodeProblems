package com.JavaProgram;

import java.util.Scanner;

public class Solution {

	 public static void main(String[] args){
	        Scanner in = new Scanner("000.12.12.034\r\n"
	        		+ "121.234.12.12\r\n"
	        		+ "23.45.12.56\r\n"
	        		+ "00.12.123.123123.123\r\n"
	        		+ "122.23\r\n"
	        		+ "Hello.IP");
	        while(in.hasNext()){
	            String IP =in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
}
