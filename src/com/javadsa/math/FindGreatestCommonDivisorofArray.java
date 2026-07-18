package com.javadsa.math;

/*
 * Approach:
 * 1. Traverse the array to find the minimum and maximum elements.
 * 2. Apply the Euclidean Algorithm to find the GCD of the minimum and maximum.
 * 3. Return the computed GCD.
 *
 * Time Complexity: O(n + log(max))
 * Space Complexity: O(1)
 */

public class FindGreatestCommonDivisorofArray {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 9, 10 };
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}

		}
		while (min != 0) {
			int temp = min;
			min = max % min;
			max = temp;
		}
		System.out.println(max);
	}
}