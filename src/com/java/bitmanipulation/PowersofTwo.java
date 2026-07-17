package com.java.bitmanipulation;

/*
 * Problem: Check if a Number is a Power of Two
 *
 * Brute Force Approach:
 * - Start with power = 1 and repeatedly multiply it by 2.
 * - If power becomes equal to n, then n is a power of two.
 * - If power exceeds n, then n is not a power of two.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Optimal Approach (Bit Manipulation):
 * - A power of two has exactly one set bit in its binary representation.
 * - For such numbers, (n & (n - 1)) equals 0.
 * - Check: (n > 0) && ((n & (n - 1)) == 0)
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class PowersofTwo {

	public static void main(String[] args) {
		int n = 16;
		int power = 1;
		
		// Optimal Approach
		System.out.println(n > 0 & (n & (n - 1)) == 0);
		
		// Brute Force Approach
		while (power <= n) {
			if (power == n) {
				System.out.println(n + " is power two");
				return;
			}
			power *= 2;
		}

		System.out.println(n + "n is not a power of two");
	}

}
