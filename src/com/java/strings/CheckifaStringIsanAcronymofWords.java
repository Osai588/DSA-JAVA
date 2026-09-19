package com.java.strings;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: Check If a String Is an Acronym of Words
 * Approach: Compare the first character of each word with the corresponding
 *           character in the given string. If any character differs, return false.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution12 {
	public static boolean isAcronym(List<String> words, String s) {
		int j = 0;
		for (String str : words) {
			if (str.charAt(0) != s.charAt(j)) {
				return false;
			}
			j++;
		}
		return true;
	}
}

public class CheckifaStringIsanAcronymofWords {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(List.of("alice", "bob", "charlie"));
		String s = "abc";
		System.out.println(Solution12.isAcronym(words, s));

	}

}
