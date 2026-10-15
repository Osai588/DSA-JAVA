package com.javadsa.twopointers;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 4 };

		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			if (nums[l] % 2 != 0 && nums[r] % 2 == 0) {
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				l++;
				r--;
			}
			else if(nums[l]%2==0) {
				l++;
			}
			else {
				r--;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}

}
