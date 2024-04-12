package com.JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringSample {

	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
			// System.out.println(s);
		}
	}

//**********************************************************************************************************************************	 

	public int strStr(String haystack, String needle) {
		int op = 0;
		int n = haystack.length();
		int m = needle.length();

		if (needle.isEmpty()) {
			op = 0;
		}

		else if (haystack.contains(needle)) {

			for (int i = 0; i <= n - m; i++) {
				if (haystack.substring(i, i + m).equals(needle)) {
					op = i;
				}

			}

		} else {
			op = -1;
		}

		return op;
	}

	// **********************************************************************************************************************************

	public int firstUniqChar(String s) {
		// System.out.println(s.charAt(0));

		HashSet<Character> uniqueChars = new HashSet<>();
		HashSet<Character> nonUniqueChars = new HashSet<>();

		for (char c : s.toCharArray()) {

			System.out.println("uniqueChars--" + uniqueChars.toString());
			System.out.println("c--" + c);
			if (uniqueChars.contains(c)) {
				uniqueChars.remove(c);
				nonUniqueChars.add(c);
			} else if (!nonUniqueChars.contains(c)) {
				uniqueChars.add(c);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (uniqueChars.contains(s.charAt(i))) {
				return i;
			}
		}

		return -1;
	}
	// **********************************************************************************************************************************

	public int reverse(int x) {
		int value = 0;
		try {
			int op = 0;
			int op1 = 0;
			long absNum = Math.abs((long) x);
			String reversedStr = new StringBuilder(Long.toString(absNum)).reverse().toString();
			System.out.println(reversedStr);
			if (x < 0) {
				reversedStr = "-" + reversedStr;
				System.out.println("reversedStr=" + reversedStr);
				value = Integer.parseInt(reversedStr);
				System.out.println("value=" + value);
				return value;
			} else {
				
				value = Integer.parseInt(reversedStr);
			}
		} catch (NumberFormatException ex) {
			value = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	// **********************************************************************************************************************************

	
public String addStrings(String num1, String num2) {
	
	StringBuilder result = new StringBuilder();
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    while (i >= 0 || j >= 0 || carry > 0) {
        int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int y = (j >= 0) ? num2.charAt(j) - '0' : 0;

        int sum = x + y + carry;
        carry = sum / 10;
        result.insert(0, sum % 10);

        i--;
        j--;
    }

    return result.toString();
}

// **********************************************************************************************************************************


	public static void main(String[] args) {

		// char[] s = {'a','b','c','d','e','f'};

		 //StringSample ss = new StringSample();
		
	        /*Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String ss =s.trim();
	        
	        String[] op= ss.split("[\\s,'?@*._!,]+");
	        
	        if (!ss.isEmpty()) {
	        
	        System.out.println(op.length);
	        for(String opt :op ) {
	        	
	        	System.out.println(opt);
	        }
	        }
	        else {
	        	System.out.println("0");
	        }
	        
	        
	        scan.close();*/
		
		// ss.reverseString(s);
		// **********************************************************************************************************************************

		// ss.strStr("sadbutsad","sad");
		// **********************************************************************************************************************************

		// System.out.println(ss.firstUniqChar("kkn"));
		//System.out.println(ss.reverse(1534236469));
		
		//System.out.println(ss.addStrings("3876620623801494171","6529364523802684779")); '
		
		
		//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. 
		//Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

		String s ="000.12.12.034";
		
		
		String IPV4_REGEX = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";


		

	}
	
	

}
