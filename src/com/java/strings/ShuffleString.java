package com.java.strings;

/*
 * Problem: Shuffle String
 *
 * Approach:
 * - Create a character array to store the shuffled string.
 * - For each character, use its corresponding index from the indices array
 *   to place it in the correct position.
 * - Convert the character array back into a String.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution7 {
	public static String restoreString(String s, int[] indices) {
		char[] ch = new char[indices.length];

		for (int i = 0; i < indices.length; i++) {
			ch[indices[i]] = s.charAt(i);
		}

		return new String(ch);
	}
}

public class ShuffleString {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(Solution7.restoreString(s, indices));

	}

}
