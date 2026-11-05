package com.java.strings;

/*
 * Problem: Calculate Digit Sum of a String
 * Approach: Divide the string into groups of k characters. Calculate the
 *           digit sum of each group and append the result to a StringBuilder.
 *           Repeat the process until the string length becomes less than
 *           or equal to k.
 * Time Complexity: O(n log_k n)
 * Space Complexity: O(n)
 */
public class CalculateDigitSumofaString {

	public static void main(String[] args) {
		String s = "11111222223";
		int k = 3;

		while (s.length() > k) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < s.length(); i += k) {
				String word = s.substring(i, Math.min(i + k, s.length()));
				int sum = 0;
				for (int j = 0; j < word.length(); j++) {
					sum += word.charAt(j) - '0';
				}
				sb.append(sum);
			}
			s = sb.toString();
		}
		System.out.println(s);
	}

}
