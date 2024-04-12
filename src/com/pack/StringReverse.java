package com.pack;
 import java.util.List;
 import java.util.ArrayList;

public class StringReverse {
	
	public static String stringReversed(String s) {
		//Iam From India
		String abc = "";

		System.out.println("length-"+s.length());
		
		
		for (int i=s.length()-1; i>=0; i--)
		{
			abc += s.charAt(i);
			
		}
		
		return abc;
	}
	

	public static void main(String[] args) {
String s ="Iam From India";

System.out.println("OUTPUT is "+stringReversed(s));

	}

}
