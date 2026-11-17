package com.javadsa.arrays;

import java.util.Arrays;
/*
 * Problem: Build Array from Permutation
 * Approach: Create a new array and traverse the given array.
 *           For each index i, assign nums[nums[i]] to ans[i]
 *           according to the permutation rule.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution24 {
	public static int[] buildArray(int[] nums) {
		int ans[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;
	}
}

public class BuildArrayfromPermutation {

	public static void main(String[] args) {
		int nums[] = { 0, 2, 1, 5, 3, 4 };
		System.out.println(Arrays.toString(Solution24.buildArray(nums)));

	}

}
