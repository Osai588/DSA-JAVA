package com.javadsa.arrays;

/*
 * Problem: Find Smallest Letter Greater Than Target
 *
 * Approach:
 * - Use Binary Search to locate the smallest letter
 *   greater than the target.
 * - If no such letter exists, return the first letter
 *   due to the circular nature of the array.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = { 'x', 'x', 'y', 'y' };
		char target = 'z';
		int l = 0;
		int r = letters.length - 1;
		char min = '{';
		while (l <= r) {
			int mid = (l + r) >> 1;
			if (letters[mid] > target) {
				min = (char) Math.min(min, letters[mid]);
				r = mid - 1;
				}
			 else {
				l = mid + 1;
			}

		}
		System.out.println(min == '{' ? letters[0] : min);

	}

}
