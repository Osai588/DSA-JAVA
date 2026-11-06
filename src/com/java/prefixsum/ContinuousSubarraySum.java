package com.java.prefixsum;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Continuous Sub array Sum
 * Approach: Calculate the prefix sum and store its remainder when divided
 *           by k in a HashMap. If the same remainder occurs again and the
 *           distance between the indices is at least 2, the sub array sum
 *           is divisible by k. Store only the first occurrence of each
 *           remainder to maximize the sub array length.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ContinuousSubarraySum {

	public static void main(String[] args) {

		int[] nums = { 23, 2, 4, 6, 7 };
		int k = 6;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			int rem = sum % k;

			if (map.containsKey(rem)) {
				if (i - map.get(rem) >= 2) {
					System.out.println(true);
					return;
				}

			} else {
				map.put(rem, i);
			}

		}
		System.out.println(false);
	}

}
