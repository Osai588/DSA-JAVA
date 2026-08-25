package com.javadsa.arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: Missing Multiple
 *
 * Approach:
 * - Store all elements of the array in a HashSet for fast lookup.
 * - Start from k and check each multiple of k.
 * - Return the first multiple that is not present in the set.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 */
class Solution5 {
	static public int missingMultiple(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		int num = 1;
		while (num != 0) {
			if (num % k == 0 && (!set.contains(num))) {
				break;
			}
			num++;
		}
		return num;
	}
}

public class SmallestMissingMultipleofK {

	public static void main(String[] args) {
		int[] nums = { 8, 2, 3, 4, 6 };
		int k = 2;
		System.out.println(Solution5.missingMultiple(nums, k));

	}

}
