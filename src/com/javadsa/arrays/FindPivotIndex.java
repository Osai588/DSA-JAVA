package com.javadsa.arrays;

/*
 * Problem: Find Pivot Index
 * Approach: Build a prefix sum array to calculate the total sum up to each
 *           index. For every index, calculate the left sum and right sum.
 *           Return the first index where both sums are equal; otherwise, return -1.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int[] prefix = new int[nums.length];
		prefix[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] + nums[i];
		}
		int left_Sum = 0;
		int right_Sum = 0;
		for (int i = 0; i < prefix.length; i++) {
			left_Sum = (i == 0) ? 0 : prefix[i - 1];
			right_Sum = prefix[prefix.length - 1] - prefix[i];
			if (left_Sum == right_Sum) {
				System.out.println(i);
				return;
			}

		}
		System.out.println(-1);
	}

}
