package com.java.binarysearch;

public class SearchInRotatedSortedArray {
	// Brute Force Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)

	public static int searchBruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		return -1;
	}
	// Optimal Binary Search Approach
    // Time Complexity: O(log n)
    // Space Complexity: O(1)


	public static int searchOptimal(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int mid = (l + r) >> 1;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[l] <= nums[mid]) {
				if (nums[l] <= target && target <= nums[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} else if (nums[r] >= nums[mid]) {
				if (nums[r] >= target && target >= nums[mid]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(searchBruteForce(nums,target));
		System.out.println(searchOptimal(nums, target));

	}

}
