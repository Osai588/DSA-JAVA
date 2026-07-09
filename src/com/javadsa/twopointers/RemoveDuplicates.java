package com.javadsa.twopointers;

import java.util.Arrays;

public class RemoveDuplicates {

	/*
	 * Remove Duplicates from an Unsorted Array
	 *
	 * Approach: 1. Sort the array. 2. Use two pointers to move unique elements to
	 * the front. 3. Fill the remaining positions with 0.
	 *
	 * Time Complexity: O(n log n) Space Complexity: O(1) (excluding the space used
	 * by the sorting algorithm)
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 4, 2 };
		Arrays.sort(nums);
		int l = 0;
		int r = 1;
		while (r < nums.length) {
			if (nums[l] == nums[r]) {
				r++;
			} else if (nums[l] != nums[r]) {
				l++;
				nums[l] = nums[r];
				r++;
			}
		}
		System.out.println(l);
		while (l < nums.length - 1) {

			nums[++l] = 0;
		}

		System.out.println(Arrays.toString(nums));

	}

}
//output:[1, 2, 3, 4, 0, 0]