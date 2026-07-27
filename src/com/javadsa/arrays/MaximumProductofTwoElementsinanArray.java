package com.javadsa.arrays;

public class MaximumProductofTwoElementsinanArray {

	public static void main(String[] args) {
		/*
		 * Brute Force: - Check every possible pair of elements and calculate (nums[i] -
		 * 1) * (nums[j] - 1). - Keep track of the maximum product.
		 *
		 * Time Complexity: O(n²) Space Complexity: O(1)
		 */
		int[] nums = { 3, 4, 5, 2 };
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int value = (nums[i] - 1) * (nums[j] - 1);
				max = Math.max(max, value);
			}
		}
		
		System.out.println(max);
		
		/*
		 * Optimal: - Traverse the array once to find the two largest elements. -
		 * Compute (max1 - 1) * (max2 - 1).
		 *
		 * Time Complexity: O(n) Space Complexity: O(1)
		 */
		int max1 = 0;
		int max2 = 0;
		for (int num : nums) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max2 = num;
			}
		}
		System.out.println((max1 - 1) * (max2 - 1));

	}

}
