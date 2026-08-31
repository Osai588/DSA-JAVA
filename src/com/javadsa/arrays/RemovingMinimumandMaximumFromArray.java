package com.javadsa.arrays;

/*
 * Problem: Removing Minimum and Maximum From Array
 *
 * Approach:
 * - Find the minimum and maximum elements and their indices.
 * - Calculate the removals needed from the left, right, or both sides.
 * - Return the minimum number of removals among all possible options.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RemovingMinimumandMaximumFromArray {

	public static void main(String[] args) {
		int Max_Count = 0;
		int Min_Count = 0;
		int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };
		if (nums.length == 1) {
			System.out.println(1);
			return;
		}
		int Min = nums[0];
		int Max = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < Min) {
				Min = nums[i];
			}
			if (nums[i] > Max) {
				Max = nums[i];
			}

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == Min) {
				Min_Count = i;
			}
			if (nums[i] == Max) {
				Max_Count = i;
			}

		}
		int option1 = Math.max(Min_Count, Max_Count) + 1;
		int option2 = nums.length - Math.min(Min_Count, Max_Count);
		int option3 = Min_Count + 1 + nums.length - Max_Count;
		int option4 = Max_Count + 1 + nums.length - Min_Count;

		int ans = Math.min(Math.min(option1, option2), Math.min(option3, option4));
		System.out.println(ans);
	}

}
