package com.javadsa.arrays;

/*
 * Problem: Minimum Distance to the Target Element
 * Approach: Traverse the array and find every occurrence of the target.
 *           Calculate its distance from start and keep the minimum distance.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution17 {
	public static int getMinDistance(int[] nums, int target, int start) {
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {

				ans = Math.min(ans, Math.abs(i - start));
			}
		}
		return ans;
	}
}

public class MinimumDistancetotheTargetElement {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 5 };
		int target = 5;
		int start = 2;
		System.out.println(Solution17.getMinDistance(nums, target, start));
	}

}
