package com.java.binarysearch;
/*
 * Problem: Find Peak Element
 *
 * Approach:
 * - Handle edge cases for single-element arrays and boundary peaks.
 * - Use Binary Search to locate a peak element.
 * - If the middle element is a peak, return its index.
 * - Otherwise, move towards the side where the elements are increasing,
 *   since a peak is guaranteed to exist there.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class FindPeakElement {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int n = nums.length;
		if (nums.length == 1) {
			System.out.println(0);
			return;
		}
		if (nums[0] > nums[1]) {
			System.out.println(0);
			return;
		}
		if (nums[n - 1] > nums[n - 2]) {
			System.out.println(n - 1);
			return;
		}

		int l = 1;
		int r = nums.length - 1;
		while (l <= r) {
			int mid = (l + r) >> 1;
			if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				System.out.println(mid);
				return;
			} else if (nums[mid - 1] < nums[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println(-1);
	}

}
