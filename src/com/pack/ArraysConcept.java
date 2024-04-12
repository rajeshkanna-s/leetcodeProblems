package com.pack;

public class ArraysConcept {
	
	public static int [] addArray(int[] a, int pos, int key) {
		a[a.length]=key;
		
		/*
		 * for(int i= a.length; i>pos; i--) {
		 * 
		 * if(a[i]==pos) {
		 * 
		 * } }
		 */
		
		return a;
	}
	

	/*
	 * public static void main(String[] args) {
	 * 
	 * int[] a= {1,2,3,4,5};
	 * 
	 * int pos = 2; int key = 100;
	 * 
	 * int[] result = addArray(a, pos,key);
	 * 
	 * 
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
        String string1 = "#50000#80000#60000#999999#11111";
        String string2 = "11111";

        // Extracting the last value from String1
        String[] parts = string1.split("#");
        String lastValueString1 = parts[parts.length - 1];

        // Comparing String2 with the last value from String1
        if (lastValueString1.equals(string2)) {
            System.out.println("String1 is equal to String2");
        } else {
            System.out.println("String1 is not equal to String2");
        }
    }

}
