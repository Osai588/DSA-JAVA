package com.java.strings;

/*
 * Problem: Convert a Number to Hexadecimal
 *
 * Approach:
 * - Handle 0 separately.
 * - Convert negative numbers to their 32-bit unsigned representation.
 * - Repeatedly divide the number by 16 and store the remainders.
 * - Convert remainders 10-15 to hexadecimal characters a-f.
 * - Reverse the StringBuilder to get the correct hexadecimal value.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 */
public class ConvertaNumbertoHexadecimal {

	public static void main(String[] args) {
		int num = 255;
		StringBuilder sb = new StringBuilder();
		if (num == 0) {
			System.out.println("0");
			return;
		}

		long num1 = num;
		if (num1 < 0) {
			num1 = num1 + (1l << 32);
		}

		while (num1 > 0) {
			long rem = num1 % 16;

			if (rem < 10) {
				sb.append(rem);
			} else {
				sb.append((char) ('a' + (rem - 10)));
			}
			num1 /= 16;
		}
		System.out.println(sb.toString());
	}

}
