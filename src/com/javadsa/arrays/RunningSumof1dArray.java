package com.javadsa.arrays;

/*
 * Problem: Running Sum of 1D Array
 * Approach: Traverse the array and maintain a running sum by adding
 *           each element to the previous sum. Update each array position
 *           with the cumulative sum.
 * Time Complexity: O(n)
 * Space Complexity: O(1) auxiliary space
 */
import java.util.Arrays;

class Solution23 {
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			nums[i] = sum;
		}
		return nums;
	}
}

public class RunningSumof1dArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(Solution23.runningSum(nums)));
	}

}
