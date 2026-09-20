package com.java.strings;

/*
 * Problem: Reverse Degree of a String
 * Approach: Calculate each character's reverse alphabet value using
 *           'z' - character + 1, then multiply it by its 1-based position.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution13 {
	public static int reverseDegree(String s) {
		int revDegree = 0;
		for (int i = 0; i < s.length(); i++) {
			int index = 'z' - s.charAt(i) + 1;
			revDegree += index * (i + 1);
		}
		return revDegree;
	}
}

public class ReverseDegreeofaString {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(Solution13.reverseDegree(s));
	}

}
