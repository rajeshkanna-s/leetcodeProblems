package com.JavaProgram;

	public class Encryption {
	    public static void main(String[] args) {
	        String input = "RAJESHKANNA/kSJIDHgwev&(*q#r#q(r&#q*r,,,,,,,,,&#*(t^*(iy*(t(*#@yt(*#^t";
	        String encrypted = encrypt(input);
	        System.out.println("Encrypted: " + encrypted);
	    }

	    public static String encrypt(String input) {
	        StringBuilder encrypted = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            int encryptedValue = getEncryptedValue(c);
	            encrypted.append(encryptedValue).append(" ");
	        }
	        return encrypted.toString().trim();
	    }

	    public static int getEncryptedValue(char c) {
	        if (Character.isUpperCase(c)) {
	            return c - 'A' + 1;
	        } else if (Character.isLowerCase(c)) {
	            return c - 'a' + 27;
	        } else {
	            switch (c) {
	                case '~':
	                    return 53;
	                case '!':
	                    return 54;
	                case '@':
	                    return 55;
	                case '#':
	                    return 56;
	                case '$':
	                    return 57;
	                case '%':
	                    return 58;
	                case '^':
	                    return 59;
	                case '&':
	                    return 60;
	                case '*':
	                    return 61;
	                case '(':
	                    return 62;
	                case ')':
	                    return 63;
	                case '.':
	                    return 64;
	                case '/':
	                    return 65;
	                default:
	                    return 0; // Invalid character
	            }
	        }
	    }
	}


