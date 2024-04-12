package com.pack;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
       
        System.out.println(intersection(nums1, nums2)); 

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        
        System.out.println(intersection(nums1, nums2)); // Output: 9 4
    }
}
