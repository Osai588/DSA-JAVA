package com.java.strings;

/*
 * Problem: Reverse String II
 *
 * Approach:
 * - Convert the string into a character array.
 * - Process every 2k characters at a time.
 * - Reverse only the first k characters of each 2k block.
 * - Use Math.min() to handle the last block when fewer than k
 *   characters remain.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution1 {
	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();

		for (int start = 0; start < ch.length; start += k * 2) {
			int l = start;
			int r = Math.min(start + k - 1, ch.length - 1);

			while (l < r) {
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;

			}
		}

		return new String(ch);
	}
}

public class ReverseStringII {

	public static void main(String[] args) {
		String str = "abcdefg";
		int k = 2;
		System.out.println(Solution1.reverseStr(str, k));
	}

}
