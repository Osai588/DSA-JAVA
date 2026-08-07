package com.java.strings;

public class StringToInteger_Atoi {
	/*
	 * Problem: String to Integer (atoi)
	 *
	 * Approach: - Trim leading and trailing spaces. - Check for an optional '+' or
	 * '-' sign. - Traverse the string and process only numeric digits. - Detect
	 * integer overflow before updating the result. - Stop parsing when a non-digit
	 * character is encountered. - Apply the sign and return the final integer.
	 *
	 * Time Complexity: O(n) Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		String s = "-21474836482";
		boolean isNegative = false;

		s = s.trim();

		if (s.length() == 0) {
			System.out.println(0);
			return;

		}
		int start = 0;
		long num = 0;
		int digit = 0;
		if (s.charAt(0) == '-') {
			isNegative = true;
			start = 1;

		} else if (s.charAt(0) == '+') {
			start = 1;
		}
		int limit = isNegative ? 8 : 7;
		for (int i = start; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				digit = ch - '0';
				if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > limit)) {

					System.out.println(isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE);
					return;
				}
				num = num * 10 + digit;
			}

			else {
				break;
			}
		}
		if (isNegative && num != Integer.MIN_VALUE) {
			num = -(num);
		}
		System.out.println((int) num);
	}

}
