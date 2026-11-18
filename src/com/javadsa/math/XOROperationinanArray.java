package com.javadsa.math;

/*
 * Problem: XOR Operation in an Array
 * Approach:
 * 1. Generate each element using start + 2 * i.
 * 2. Perform XOR with the current result.
 * 3. Return the final XOR value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution27 {
	public static int xorOperation(int n, int start) {
		int xor = 0;
		for (int i = 0; i < n; i++) {
			int res = start + 2 * i;
			xor ^= res;
		}
		return xor;
	}
}

public class XOROperationinanArray {

	public static void main(String[] args) {
		int n = 5;
		int start = 0;
		System.out.println(Solution27.xorOperation(n, start));

	}

}
