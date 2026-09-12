package com.javadsa.math;

/*
 * Problem: Factorial Trailing Zeroes
 * Approach: Count the number of factors of 5 in n! by repeatedly dividing n by 5.
 *           This also counts additional factors of 5 from powers like 25, 125, etc.
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution9 {
	public static int trailingZeroes(int n) {
		int total = 0;
		while (n > 0) {
			n /= 5;
			total += n;
		}

		return total;
	}

}

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(Solution9.trailingZeroes(n));

	}

}
