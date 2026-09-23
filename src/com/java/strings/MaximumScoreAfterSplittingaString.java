package com.java.strings;

/*
 * 
 * Problem: Maximum Score After Splitting a String
 * Approach: Count all 1s initially as the right-side score. Move the split
 *           from left to right while maintaining the number of zeros on
 *           the left and ones on the right, and track the maximum score.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution14 {
	public int maxScore(String s) {
		int max_Score = Integer.MIN_VALUE;
		int prefixSum = 0;
		int zeroCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				prefixSum++;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				zeroCount++;
			} else {
				prefixSum--;
			}
			max_Score = Math.max(max_Score, zeroCount + prefixSum);
		}
		return max_Score;
	}
}

public class MaximumScoreAfterSplittingaString {

	public static void main(String[] args) {
		String s = "011101";

		Solution14 Sol = new Solution14();

		System.out.println(Sol.maxScore(s));

	}

}
