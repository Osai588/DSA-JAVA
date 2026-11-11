package com.java.greedy;

import java.util.Arrays;

/*
 * Problem: Assign Cookies
 * Approach: Sort the greed factors and cookie sizes in ascending order.
 *           Use two pointers to traverse both arrays. If the current cookie
 *           satisfies the current child's greed factor, assign it and move
 *           to the next child. Always move to the next cookie.
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: Depends on the sorting implementation
 */
public class AssignCookies {

	public static void main(String[] args) {
		int[] g = { 1, 2 };
		int[] s = { 1, 2, 3 };

		int cookie = 0;
		int child = 0;

		Arrays.sort(g);
		Arrays.sort(s);

		while (cookie < s.length && child < g.length) {

			if (s[cookie] >= g[child]) {
				child++;
			}
			cookie++;
		}
		System.out.println(child);
	}

}
