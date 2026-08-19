package com.java.slidingwindow;

/*
 * Problem: Maximum Number of Vowels in a Substring of Given Length
 *
 * Approach:
 * - Use a fixed-size Sliding Window of length k.
 * - Count vowels while expanding the window.
 * - When the window reaches size k, update the maximum count.
 * - Remove the leftmost character's contribution before moving
 *   the window forward.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution3 {
	public static int maxVowels(String s, int k) {
		int left = 0;
		int max = Integer.MIN_VALUE;
		int vowelCount = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
			if (right - left + 1 == k) {
				max = Math.max(max, vowelCount);
				char leftchar = s.charAt(left);
				if (leftchar == 'a' || leftchar == 'e' || leftchar == 'i' || leftchar == 'o' || leftchar == 'u') {
					vowelCount--;
				}
				left++;
			}
		}

		return max;
	}
}

public class MaximumNumberofVowelsinaSubstringofGivenLength {

	public static void main(String[] args) {
		String s = "abciiidef";
		int k = 3;
		System.out.println(Solution3.maxVowels(s, k));

	}

}
