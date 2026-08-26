package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Problem: Concatenation of Array
 *
 * Approach:
 * - Create a new array of size 2 * n.
 * - Copy the original array into the first half.
 * - Copy the same array into the second half.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution6 {
	static public int[] getConcatenation(int[] nums) {
		int[] ans = new int[2 * nums.length];

		int i = 0;
		for (i = 0; i < nums.length; i++) {
			ans[i] = nums[i];

		}

		for (int j = 0; j < nums.length; j++) {
			ans[i] = nums[j];
			i++;
		}
		return ans;

	}
}

public class ConcatenationofArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1 };
		System.out.println(Arrays.toString(Solution6.getConcatenation(nums)));

	}

}
