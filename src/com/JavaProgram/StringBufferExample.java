package com.JavaProgram;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append " world!" to the end of the StringBuffer object.
        sb.append(" world!");

        // Insert "Java" at the beginning of the StringBuffer object.
         sb.insert(0, "Java ");

        // Replace "Java" with "Python".
       sb.replace(0, 4, "Python");

        // Delete the last character.
        sb.deleteCharAt(sb.length() - 1);

        // Get the contents of the StringBuffer object as a string.
        String str = sb.toString();

        // Print the string.
        System.out.println(str);
    }
}
