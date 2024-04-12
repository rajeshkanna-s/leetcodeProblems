package com.JavaProgram;
public class ArrayEmpty {
	
	
	
public long countOperationsToEmptyArray(int[] nums) {
	 
	int n = nums.length;
    int operations = 0;
    System.out.println("operations--"+operations);
    while (n > 0) {
        int minIndex = findMinIndex(nums);

        // If the first element is the smallest, remove it
        if (minIndex == 0) {
            removeElement(nums, 0, n);
            n--;
        } else {
        // Move the first element to the end of the array
            rotateArray(nums, minIndex);
        }
        operations++;
    }

    return operations;
}

private static int findMinIndex(int[] nums) {
    int minIndex = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < nums[minIndex]) {
            minIndex = i;
        }
    }
    return minIndex;
}

private static void removeElement(int[] nums, int index, int size) {
    for (int i = index; i < size - 1; i++) {
        nums[i] = nums[i + 1];
    }
}

private static void rotateArray(int[] nums, int k) {
    int temp = nums[k];
    for (int i = k; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = temp;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {3,4,-1};
		
				ArrayEmpty ae = new ArrayEmpty();
				
				System.out.println("OUTPUT==="+ae.countOperationsToEmptyArray(nums));
	}

}
