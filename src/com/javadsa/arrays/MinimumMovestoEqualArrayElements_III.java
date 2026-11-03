package com.javadsa.arrays;

/*
 * Problem: Minimum Moves to Equal Array Elements III
 * Approach: Find the maximum element in the array. Since each move can
 *           only increment one element by 1, increase every element
 *           to the maximum value and sum the required increments.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution22 {
	public static int minMoves(int[] nums) {
		int count = 0;
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i])
				max = nums[i];
		}

		for (int i = 0; i < nums.length; i++) {

			count += (max - nums[i]);
		}

		return count;
	}
}

public class MinimumMovestoEqualArrayElements_III {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 3 };
		System.out.println(Solution22.minMoves(nums));
	}

}
