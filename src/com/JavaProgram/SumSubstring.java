package com.JavaProgram;
public class SumSubstring {

    public static int sumSubstrings(String s) {
        final int MOD = 1000000007;
        int n = s.length();
        long currentSum = 0;  // This will store the sum of all substrings mod MOD
        long totalSum = 0;

        // Traverse the string from right to left
        for (int i = n - 1; i >= 0; i--) {
       
            int digit = Character.getNumericValue(s.charAt(i));

            // Update currentSum with the contribution of s.charAt(i) in each iteration
            currentSum = (currentSum * 10 + (n - i) * digit) % MOD;

            // Add currentSum to totalSum
            totalSum = (totalSum + currentSum) % MOD;
        }

        return (int) totalSum;
    }

    public static void main(String[] args) {
        String s1 = "1234";
        System.out.println(sumSubstrings(s1));  // Output: 1670

        String s2 = "421";
        System.out.println(sumSubstrings(s2));  // Output: 491
    }
}
