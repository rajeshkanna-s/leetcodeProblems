package com.JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Freqalphabets {
	
	


public String decode(String s) {
    StringBuilder result = new StringBuilder();
    int i = s.length() - 1;
    
    while (i >= 0) {
        if (s.charAt(i) == '#') {
            int num = Integer.parseInt(s.substring(i - 2, i));
            i -= 3;
            System.out.println("num-"+num);
            System.out.println((char)('a' + num - 1));
            result.append((char)('a' + num - 1));
           
        } else {
            int num = Integer.parseInt(s.substring(i, i + 1));
            i = i -1;
            result.append((char)('a' + num - 1));
        }
    }
    
    return result.reverse().toString();
}

	public static void main(String[] args) {

		Freqalphabets ss = new Freqalphabets();
		String s = "10#11#12";
		System.out.println("OUTPUT:  "+ss.decode(s));
	}

}
