package com.JavaProgram;

import java.util.ArrayList;

import com.google.common.base.CharMatcher;

public class StringProblems {

	public static int myAtoi(String input1) {

		String s = CharMatcher.inRange('0', '9').retainFrom(input1);

		double output = Math.pow(-2, 31);
		double output2 = Math.pow(2, 31) - 1;

		int output3 = 2147483647;
		int output4 = -2147483648;
		int a = 0;
		int negative = 0;

		try {
			a = Integer.parseInt(s);
			
			if (a<0) {
				negative=negative+1;
			}

		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(a);
			
			if(negative==1) {
				return output4;
			}else {
				return output4;
			}
		}

		if (a == 0) {

			return a;
		}

		return 1;

	}

	public static void main(String[] args) {

		String input1 = "cdsvcdsv";

		System.out.println("OUTPUT IS " + myAtoi(input1));

	}

}
