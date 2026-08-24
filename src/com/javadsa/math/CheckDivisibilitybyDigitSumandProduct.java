package com.javadsa.math;

/*
 * Problem: Check Divisibility by Digit Sum and Product
 *
 * Approach:
 * - Extract each digit of n using modulo and division.
 * - Calculate the sum and product of all digits.
 * - Check whether n is divisible by the sum plus product.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution4 {
	static public boolean checkDivisibility(int num) {
		int n = num;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			mul *= rem;
			n /= 10;
		}
		return (num % (sum + mul) == 0);
	}
}

public class CheckDivisibilitybyDigitSumandProduct {

	public static void main(String[] args) {
		int num = 23;
		System.out.println(Solution4.checkDivisibility(num));

	}

}
