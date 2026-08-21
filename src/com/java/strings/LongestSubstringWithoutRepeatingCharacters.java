package com.java.strings;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: Longest Substring Without Repeating Characters
 *
 * Approach:
 * - Use a Sliding Window with a HashSet to maintain unique characters.
 * - Expand the window using the right pointer.
 * - If a duplicate is found, remove characters from the left until
 *   the duplicate is removed.
 * - Update the maximum window length after each step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, charset))
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		if (s.length() == 0) {
			System.out.println(0);
			return;
		}
		Set<Character> set = new HashSet<>();
		int left = 0;
		int max = Integer.MIN_VALUE;
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			while (set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			max = Math.max(max, right - left + 1);
		}
		System.out.println(max);
	}

}
