package com.javadsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 2, 3 };
		int target = 2;
		int equal = 0;
		int less = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				equal++;
			} else if (nums[i] < target) {
				less++;
			}
		}
		for (int i = less; i < less + equal; i++) {
			list.add(i);
		}
        System.out.println(list);
	}

}
