package com.javadsa.arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: Binary Prefix Divisible By 5
 * Approach: Maintain the remainder of each binary prefix modulo 5.
 *           For each new bit, update the remainder as (remainder * 2 + bit) % 5.
 *           Add true when the current remainder is 0.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution16 {
	public static List<Boolean> prefixesDivBy5(int[] nums) {
		List<Boolean> list = new ArrayList<Boolean>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = (sum * 2 + nums[i]) % 5;
			list.add(sum == 0);
		}
		return list;
	}
}

public class BinaryPrefixDivisibleBy5 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1 };

		System.out.println(Solution16.prefixesDivBy5(nums));

	}

}
