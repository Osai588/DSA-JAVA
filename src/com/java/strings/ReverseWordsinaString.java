package com.java.strings;
/*
 * Problem: Reverse Words in a String
 * Approach: Trim leading and trailing spaces, then split the string using
 *           one or more whitespace characters. Traverse the words array
 *           in reverse order and append each word with a single space.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution21 {
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.trim();
		String words[] = s.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i > 0) {
				sb.append(' ');
			}
		}
		return sb.toString();

	}
}

public class ReverseWordsinaString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(Solution21.reverseWords(s));
	}

}
