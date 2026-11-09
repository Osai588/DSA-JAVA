package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Problem: Minimum Moves to Equal Array Elements II
 * Approach: Sort the array and select the median as the target value.
 *           The median minimizes the sum of absolute differences.
 *           Calculate the total moves required to make every element
 *           equal to the median.
 * Time Complexity: O(n log n)
 * Space Complexity: Depends on the sorting implementation
 */
public class MinimumMovestoEqualArrayElementsII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };

		Arrays.sort(nums);

		int median = nums[nums.length / 2];

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count += Math.abs(nums[i] - median);
		}
		System.out.println(count);
	}

}
