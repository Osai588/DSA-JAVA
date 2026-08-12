package com.java.strings;

/*
 * Problem: Number of Segments in a String
 *
 * Approach:
 * - Trim leading and trailing spaces.
 * - Traverse the string and count a segment whenever a
 *   non-space character appears after a space or at index 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class solution {
	public static int SegmentCount(String str) {
		if (str.equals("")) {
			return 0;
		}
		str = str.trim();
		int l = 0;
		int r = 0;
		while (l < str.length()) {
			if (str.charAt(l) != ' ' && (l == 0 || str.charAt(l - 1) == ' ')) {
				r++;
			}
			l++;
		}

		return r;

	}

}

public class NumberofSegmentsinaString {

	public static void main(String[] args) {
		String str = "Hello, my name is John";
		int ans = solution.SegmentCount(str);
		System.out.println(ans);
	}

}
