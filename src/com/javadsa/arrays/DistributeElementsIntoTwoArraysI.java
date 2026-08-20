package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Approach:
 * - Maintain two separate arrays to store elements based on
 *   the comparison between the current elements of both groups.
 * - Track the latest element in each array using num1 and num2.
 * - Append the remaining elements to their respective arrays.
 * - Merge both arrays into the result array using System.arraycopy().
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution3 {

	public static int[] resultArray(int[] nums) {
		int[] arr1 = new int[nums.length];
		int[] arr2 = new int[nums.length];
		int j = 0;
		int k = 0;
		arr1[j] = nums[0];
		int num1 = arr1[j];
		j++;

		arr2[k] = nums[1];
		int num2 = arr2[k];
		k++;

		for (int i = 2; i < nums.length; i++) {
			if (num1 > num2) {
				arr1[j] = nums[i];
				num1 = nums[i];
				j++;
			} else {
				arr2[k] = nums[i];
				num2 = arr2[k];
				k++;
			}

		}
		int[] res = new int[nums.length];
		System.arraycopy(arr1, 0, res, 0, j);
		System.arraycopy(arr2, 0, res, j, k);
		return res;
	}
}

public class DistributeElementsIntoTwoArraysI {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 8 };
		System.out.println(Arrays.toString(Solution3.resultArray(nums)));

	}

}
