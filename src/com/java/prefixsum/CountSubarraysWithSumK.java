package com.java.prefixsum;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Sub array Sum Equals K
 * Approach: Use prefix sum and a HashMap to store the frequency of each
 *           prefix sum. For each element, check whether (sum - k) exists
 *           and add its frequency to the count. Then update the frequency
 *           of the current prefix sum in the map.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int reqSum = 0;
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			reqSum = sum - k;
			if (map.containsKey(reqSum)) {
				count += map.get(reqSum);

			}
			if (!map.containsKey(sum)) {
				map.put(sum, 1);
			} else {
				map.put(sum, map.get(sum) + 1);
			}
		}

		return count;
	}
}

public class CountSubarraysWithSumK {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1 };
		int k = 2;
		System.out.println(Solution.subarraySum(nums, k));
	}

}
