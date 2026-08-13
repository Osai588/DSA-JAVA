package com.javadsa.arrays;

/*
 * Problem: Largest Number At Least Twice of Others
 *
 * Approach:
 * - Find the maximum element and its index in the first pass.
 * - In the second pass, check whether the maximum is at least
 *   twice every other element.
 * - Return the index of the maximum if the condition is satisfied;
 *   otherwise, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
	public int dominantIndex(int[] nums) {
		int index = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == index || max >= nums[i] * 2) {
				continue;
			} else {
				return -1;
			}
		}
		return index;

	}
}

public class LargestNumberAtLeastTwiceofOthers {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 3, 6, 1, 0 };
		System.out.println(s.dominantIndex(nums));

	}

}
