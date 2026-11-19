package com.java.strings;

/*
 * Problem: Score of a String (LeetCode 3110)
 * Approach:
 * 1. Traverse the string from right to left.
 * 2. Get each pair of adjacent characters.
 * 3. Calculate the absolute difference between their ASCII values.
 * 4. Add each difference to the total score.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ScoreofaString {

	public static void main(String[] args) {
		String s = "hello";
		int score = 0;
		for (int i = s.length() - 1; i > 0; i--) {
			char ch = s.charAt(i);
			char ch1 = s.charAt(i - 1);
			int diff = Math.abs(ch - ch1);
			score += diff;
		}
		System.out.println(score);

	}

}
