package com.javadsa.math;

/*
 * Problem: Maximum Product of Two Digits
 *
 * Approach:
 * - Convert the number into a character array.
 * - Compare every pair of distinct digits.
 * - Calculate the product of each pair and keep track
 *   of the maximum product.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */
public class MaximumproductofTwoDigits {

	public static void main(String[] args) {
		int n = 124;
		String s = String.valueOf(n);

		char[] nums = s.toCharArray();
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {

				if (j == i) {
					continue;
				} else {

					int res = (nums[i] - '0') * (nums[j] - '0');

					max = Math.max(max, res);
				}
			}

		}
		System.out.println(max);

	}

}
