package com.pack;

public class StringParser {

	 public static void main(String[] args) {
	        String input1 = "akjdcjiadcjn";
	        String input2 = "com.kuwy.ld.controller.LenderController";
	        String input3 = "com.master.loan.daoimpl.LoanProductDaoImpl";

	        System.out.println(modifyString(input1));
	       
	    }
	 private static String modifyString(String input) {
	        if (input== null || input.isEmpty()) {
	            return "-";
	        } else {
	            String[] parts = input.split("\\.");
	            if (parts.length > 0) {
	                String lastWord = parts[parts.length - 1];
	                if (lastWord.equals("java")) {
	                    if (parts.length >= 2) {
	                        String secondLastWord = parts[parts.length - 2];
	                        return secondLastWord + ".java";
	                    }
	                } else {
	                    return lastWord;
	                }
	            }
	            return "-";
	        }
	    }
}

