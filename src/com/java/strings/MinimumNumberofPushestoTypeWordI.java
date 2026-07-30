package com.java.strings;

/*
 * Problem: Minimum Number of Pushes to Type Word I
 *
 * Approach:
 * - Traverse the characters of the word.
 * - The first 8 characters require 1 push each,
 *   the next 8 require 2 pushes, the next 8 require
 *   3 pushes, and the remaining characters require 4 pushes.
 * - Sum the required pushes for each character.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MinimumNumberofPushestoTypeWordI {

	public static void main(String[] args) {
		String word = "abcde";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i < 8) {
				count++;
			} else if (i < 16) {
				count += 2;
			} else if (i < 24) {
				count += 3;
			} else {
				count += 4;
			}
		}
		System.out.println(count);

	}

}
