package com.javadsa.arrays;

/*
 * Problem: Sum of Squares of Special Elements
 * Approach: Traverse the array and check whether the array length is divisible
 *           by each element's 1-based index. If divisible, add the square of
 *           that element to the sum.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution19 {
	public static int sumOfSquares(int[] nums) {
		int sum = 0;
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (n % (i + 1) == 0) {
				sum += Math.pow(nums[i], 2);

			}
		}
		return sum;
	}
}

public class SumSquaresofSpecialElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Solution19.sumOfSquares(nums));
	}

}
