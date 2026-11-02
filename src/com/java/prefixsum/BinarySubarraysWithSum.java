package com.java.prefixsum;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Binary Sub arrays With Sum
 * Approach: Use prefix sum and a HashMap to store the frequency of each
 *           prefix sum. Initialize the map with (0, 1) to handle subarrays
 *           starting at index 0. For each element, calculate sum - goal
 *           and add its frequency to the count. Then update the current
 *           prefix sum frequency.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 0, 1 };
		int goal = 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0, count = 0, req = 0;
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			req = sum - goal;
			if (map.containsKey(req)) {
				count += map.get(req);
			}

			if (!map.containsKey(sum)) {
				map.put(sum, 1);
			} else {
				map.put(sum, map.get(sum) + 1);

			}

		}
		System.out.println(count);

	}

}
