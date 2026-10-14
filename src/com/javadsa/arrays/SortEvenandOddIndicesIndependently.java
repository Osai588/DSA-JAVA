package com.javadsa.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * Problem: Sort Even and Odd Indices Independently
 * Approach: Separate elements at even and odd indices into two arrays.
 *           Sort the even-indexed elements in ascending order and the
 *           odd-indexed elements in descending order, then place them
 *           back into their original index positions.
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class SortEvenandOddIndicesIndependently {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 3 };
		int[] even = new int[(nums.length + 1) / 2];
		Integer[] odd = new Integer[nums.length / 2];
		int j = 0;
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				even[j++] = nums[i];

			} else {
				odd[k++] = nums[i];
			}

		}
		Arrays.sort(even);
		Arrays.sort(odd, Collections.reverseOrder());
		j = 0;
		k = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = even[j++];
			} else {
				nums[i] = odd[k++];
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
