package com.javadsa.arrays;

import java.util.Arrays;

public class HeightChecker {
	/*
	 * Height Checker
	 *
	 * Approach:
	 * 1. Create a copy of the original array.
	 * 2. Sort the copied array.
	 * 3. Compare the original array with the sorted array.
	 * 4. Count the indices where the values differ.
	 *
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
	 *
	 * Note:
	 * An O(n) Counting Sort solution exists because heights are
	 * constrained to the range 1–100.
	 */
	public static void main(String[] args) {
		int[] heights = {5,1,2,3,4};
		int mismatch=0;
		int [] expected=Arrays.copyOf(heights,heights.length);
		Arrays.sort(expected);
		
		for (int i = 0; i < expected.length; i++) {
			if (heights[i]!=expected[i]) {
				mismatch++;
			}
		}
		System.out.println(mismatch);
	}

}
