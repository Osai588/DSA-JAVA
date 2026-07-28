package com.java.strings;

/*
 * Problem: Add Two Numbers Represented as Strings
 *
 * Approach:
 * - Traverse both strings from right to left.
 * - Add corresponding digits along with the carry.
 * - Build the result using a StringBuilder and reverse it at the end.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 *
 * Note:
 * - This is the optimal solution, performing a single linear scan
 *   while constructing the result efficiently.
 */
public class AddStrings {

	public static void main(String[] args) {
		String num1 = "456";
		String num2 = "77";
		StringBuilder sb = new StringBuilder();
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		char ch1 = '0';
		char ch2 = '0';
		int carry = 0;
		while (i >= 0 || j >= 0) {
			if (i >= 0) {
				ch1 = num1.charAt(i);
			} else {
				ch1 = '0';
			}

			if (j >= 0) {
				ch2 = num2.charAt(j);
			} else {
				ch2 = '0';
			}

			int sum = (ch1 - '0' + ch2 - '0' + carry);

			sb.append(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		if (carry > 0) {
			sb.append(carry);
		}

		System.out.println(sb.reverse().toString());

	}

}
