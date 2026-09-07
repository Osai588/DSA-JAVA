package com.java.strings;

/*
 * Problem: Second Largest Digit in a String
 * Approach: Traverse the string and consider only digits. Track the largest
 *           and second largest distinct digits while scanning once.
 *           If no second distinct digit exists, return -1.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class SecondLargestDigitinaString {

	public static void main(String[] args) {
		String s = "abc1111";
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				if ((ch - '0') > max) {
					sec_max = max;
					max = ch - '0';

				} else if (ch - '0' > sec_max && ch - '0' != max) {
					sec_max = ch - '0';
				}
			}
		}
		if (sec_max == Integer.MIN_VALUE) {
			System.out.println(-1);
			return;
		}
		System.out.println(sec_max);
	}

}
