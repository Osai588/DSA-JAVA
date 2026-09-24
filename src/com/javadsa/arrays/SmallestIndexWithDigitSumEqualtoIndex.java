package com.javadsa.arrays;

/*
 * Problem: Smallest Index With Digit Sum Equal to Index
 * Approach: Traverse the array and calculate the digit sum of each number.
 *           If the digit sum equals its index, return the first such index.
 * Time Complexity: O(n * d), where d is the number of digits in each number.
 * Space Complexity: O(1)
 */
class Solution14 {
	public static int smallestIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			while (nums[i] > 0) {
				int rem = nums[i] % 10;
				sum += rem;
				nums[i] /= 10;

			}
			if (sum == i) {
				return i;
			}

		}
		return -1;
	}
}

public class SmallestIndexWithDigitSumEqualtoIndex {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2 };

		System.out.println(Solution14.smallestIndex(nums));
	}

}
