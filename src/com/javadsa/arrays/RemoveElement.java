package com.javadsa.arrays;

/*
 * Problem: Remove Element
 * Approach: Use two pointers from both ends. When nums[l] equals val,
 *           replace it with the element at r and decrease r. Otherwise,
 *           move l forward. The final value of l is the new length.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution11 {
	public static int removeElement(int[] nums, int val) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			if (nums[l] == val) {
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				r--;
			} else {
				l++;
			}
		}
		return l;
	}
}

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(Solution11.removeElement(nums, val));
	}

}
