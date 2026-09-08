package com.javadsa.math;

/*
 * Problem: Count Commas in Range
 * Approach: Count numbers having 4-6, 7-9, and 10 digits separately.
 *           Each range contributes 1, 2, or 3 commas respectively.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class CountCommasinRange {

	public static void main(String[] args) {
		int n = 1002;
		int total = 0;

		if (n >= 1000) {
			int end = Math.min(n, 999999);
			total += (end - 1000 + 1);

		}
		if (n >= 1000000) {
			int end = Math.min(n, 999999999);
			total += (end - 1000000 + 1) * 2;

		}
		if (n >= 1000000000) {
			total += (n - 1000000000) * 3;

		}
		System.out.println(total);
	}

}
