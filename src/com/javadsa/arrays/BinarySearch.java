package com.javadsa.arrays;

/*
 * Problem: Binary Search
 *
 *  Algorithm:
 * - Divide and conquer

 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 *
 * Condition:
 * - Array must be sorted.
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };
		int target = 23;
		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			int mid = (l + h) >> 1;
			if (target < arr[mid]) {
				h = mid - 1;
			} else if (target > arr[mid]) {
				l = mid + 1;
			} else {
				System.out.println("Target found at index:" + mid);
				return;
			}
		}

		System.out.println("Target not found");
	}

}
