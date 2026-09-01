package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Problem: Median of Two Sorted Arrays
 *
 * Approach:
 * - Merge both arrays into a single array.
 * - Sort the merged array.
 * - Calculate the median from the middle element(s).
 *
 * Time Complexity: O((m + n) log(m + n))
 * Space Complexity: O(m + n)
 *
 * Note: Correct approach, but not the optimal solution.
 */
public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		int m = nums1.length;
		int n = nums2.length;
		int[] nums3 = new int[m + n];
		int i = 0;
		for (i = 0; i < m; i++) {
			nums3[i] = nums1[i];
		}

		for (int j = 0; j < n; j++) {
			nums3[i] = nums2[j];
			i++;
		}

		Arrays.sort(nums3);
		System.out.println(Arrays.toString(nums3));
		int l = 0;
		int h = nums3.length;
		int mid = (l + h) / 2;
		double median = 0;

		if (nums3.length % 2 == 0) {

			median = (double) (nums3[mid - 1] + nums3[mid]) / 2;

		} else {
			median = nums3[mid];
		}
		System.out.println(median);

	}

}
