package com.java.prefixsum;

import java.util.Map;
import java.util.HashMap;

/*
 * Problem: Contiguous Array
 * Approach: Replace 0 with -1 and keep 1 as +1. Use a prefix sum and a
 *           HashMap to store the first occurrence of each sum. When the
 *           same sum appears again, the subarray between those indices
 *           contains an equal number of 0s and 1s. Update the maximum length.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution20 {
	public static int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		map.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				sum--;
			} else {
				sum++;
			}
			if (map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - map.get(sum));
			} else {
				map.put(sum, i);
			}

		}
		return maxLen;
	}
}

public class ContiguousArray {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		System.out.println(Solution20.findMaxLength(nums));

	}

}
