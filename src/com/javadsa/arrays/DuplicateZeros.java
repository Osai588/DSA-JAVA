package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Problem: Duplicate Zeros
 *
 * Approach:
 * - Create a temporary array of the same size as the input array.
 * - Traverse the original array and copy each element to the new array.
 * - When a zero is found, add two zeros instead of one.
 * - Stop when the temporary array reaches its maximum size.
 * - Copy the result back into the original array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class DuplicateZeros {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int[] nums = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				if (j < nums.length) {
					nums[j] = 0;
					j++;
				}
				if (j < nums.length) {
					nums[j] = 0;
					j++;
				}

			} else {
				if (j >= nums.length)
					break;

				nums[j] = arr[i];
				j++;
			}

		}
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
		}
		System.out.println(Arrays.toString(arr));

	}

}
