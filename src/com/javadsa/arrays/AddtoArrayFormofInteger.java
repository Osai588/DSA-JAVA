package com.javadsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Problem: Add to Array-Form of Integer
 *
 * Approach:
 * - Traverse the array from right to left while processing the digits of k.
 * - Add the current digits along with the carry.
 * - Store each resulting digit in a List.
 * - Continue until all digits and carry are processed.
 * - Reverse the List to obtain the final result.
 *
 * Time Complexity: O(max(n, log k))
 * Space Complexity: O(n)
 */
public class AddtoArrayFormofInteger {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int k = 1;
		int i = num.length - 1;
		int carry = 0;
		while (i >= 0 || carry > 0 || k > 0) {
			int digit = k % 10;

			if (i >= 0) {
				digit += num[i];
				i--;
			}
			digit += carry;
			list.add(digit % 10);
			carry = digit / 10;

			k /= 10;

		}
		Collections.reverse(list);
		System.out.println(list);

	}

}
