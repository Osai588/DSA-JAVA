package com.javadsa.arrays;

/*
 * Problem: Find Numbers with Even Number of Digits
 * Approach: Traverse each number and count its digits using repeated division
 *           by 10. If the digit count is even, increment the answer.
 * Time Complexity: O(n * d), where d is the number of digits in each number.
 * Space Complexity: O(1)
 */
public class FindNumberswithEvenNumberofDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };

		int ans = 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int num = nums[i];
			while (num > 0) {
				count++;
				num /= 10;
			}
			if (count % 2 == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
