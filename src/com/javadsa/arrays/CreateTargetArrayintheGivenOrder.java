package com.javadsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem: Create Target Array in the Given Order
 * Approach: Use an ArrayList to insert each value at its corresponding index.
 *           Insertion automatically shifts existing elements to the right.
 *           Finally, convert the ArrayList into an int array.
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

class Solution12 {
	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i], nums[i]);
		}

		int[] target = new int[nums.length];
		for (int i = 0; i < list.size(); i++) {
			target[i] = list.get(i);
		}

		return target;
	}
}

public class CreateTargetArrayintheGivenOrder {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(Solution12.createTargetArray(nums, index)));
	}

}
