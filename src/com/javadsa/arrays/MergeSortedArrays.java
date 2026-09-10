package com.javadsa.arrays;

/*
 * Problem: Merge Sorted Array
 * Approach: Merge both sorted arrays from right to left using three pointers.
 *           Place the larger element at the end of nums1 to avoid overwriting
 *           its existing elements. Copy remaining elements of nums2 afterward.
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
import java.util.Arrays;

class Solution9 {
	static public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums2[j] > nums1[i]) {
				nums1[k] = nums2[j];
				j--;
				k--;
			} else {
				nums1[k] = nums1[i];
				k--;
				i--;
			}
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
		System.out.println(Arrays.toString(nums1));
	}

}

public class MergeSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		Solution9.merge(nums1, m, nums2, n);
	}

}
