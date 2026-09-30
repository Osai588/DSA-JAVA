package com.java.strings;

/*
 * Problem: Check If Two String Arrays Are Equivalent
 * Approach: Concatenate all strings from both arrays using StringBuilder
 *           and compare the resulting strings.
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution16 {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < word1.length; i++) {
			sb1.append(word1[i]);
		}
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < word2.length; i++) {
			sb2.append(word2[i]);
		}
		return sb1.toString().equals(sb2.toString());

	}
}

public class CheckIfTwoStringArraysareEquivalent {

	public static void main(String[] args) {
		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };
		System.out.println(Solution16.arrayStringsAreEqual(word1, word2));
	}

}
