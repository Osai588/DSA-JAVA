package com.java.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Problem: Find the Largest Almost Missing Integer
 *
 * Approach:
 * - Traverse every subarray of size k and use a HashSet to keep
 *   only distinct elements within each subarray.
 * - Count how many subarrays contain each element using a HashMap.
 * - An element appearing in exactly one subarray is almost missing.
 * - Return the largest such element.
 *
 * Time Complexity: O((n - k + 1) * k)
 * Space Complexity: O(k + n)
 */
class Solution2 {
	public static int largestInteger(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length - k; i++) {
			Set<Integer> set = new HashSet<Integer>();

			for (int j = i; j < i + k; j++) {
				set.add(nums[j]);
			}
			for (int element : set) {
				if (map.containsKey(element)) {
					map.put(element, map.get(element) + 1);
				} else {
					map.put(element, 1);
				}
			}

		}
		int answer = -1;
		for (int element : map.keySet()) {
			if (map.get(element) == 1) {
				if (element > answer) {
					answer = element;
				}
			}

		}
		return answer;
	}
}

public class FindtheLargestAlmostMissingInteger {

	public static void main(String[] args) {

		int[] nums = { 3, 9, 2, 1, 7 };
		int k = 3;
		System.out.println(Solution2.largestInteger(nums, k));

	}

}
