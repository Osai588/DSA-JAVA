package com.javadsa.math;

/*
 * Problem: Count Commas in Range II
 * Approach: Count numbers in each digit range separately. Numbers with
 *           4-6 digits contain 1 comma, 7-9 digits contain 2 commas,
 *           10-12 digits contain 3 commas, and so on.
 *           Use Math.min() to limit each range to n.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution8 {
	static public long countCommas(long n) {
		long total = 0;
		if (n >= 1000) {
			long end = Math.min(n, 999999);
			total += (end - 1000 + 1);
		}
		if (n >= 1000000) {
			long end = Math.min(n, 999999999);
			total += (end - 1000000 + 1) * 2;
		}
		if (n >= 1000000000) {
			long end = Math.min(n, 999999999999L);
			total += (end - 1000000000 + 1) * 3;
		}
		if (n >= 1000000000000L) {
			long end = Math.min(n, 999999999999999L);
			total += (end - 1000000000000L + 1) * 4;
		}
		if (n >= 1000000000000000L) {
			long end = Math.min(n, 999999999999999999L);
			total += (end - 1000000000000000L + 1) * 5;
		}
		if (n >= 1000000000000000000L) {

			total += (n - 1000000000000000000L + 1) * 6;
		}

		return total;
	}
}

public class CountCommasinRangeII {

	public static void main(String[] args) {
		int n = 1002;

		System.out.println(Solution8.countCommas(n));

	}

}
