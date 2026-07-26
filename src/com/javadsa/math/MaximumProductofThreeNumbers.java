package com.javadsa.math;

import java.util.Arrays;

/*
 * Problem: Maximum Product of Three Numbers
 *
 * Sort the array and compare the product of the three largest numbers
 * with the product of the two smallest (possibly negative) numbers and
 * the largest number. Return the greater of the two products.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class MaximumProductofThreeNumbers {

	public static void main(String[] args) {
		int[] nums = { -100, -2, -3, 1 };
		int maximumProduct1 = 1;
		int maximumProduct2 = 1;
		Arrays.sort(nums);

		maximumProduct1 = nums[0] * nums[1] * nums[nums.length - 1];
		maximumProduct2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

		System.out.println(Math.max(maximumProduct1, maximumProduct2));
	}

}
