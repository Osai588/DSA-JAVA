package com.javadsa.arrays;

/*
 * Problem: Richest Customer Wealth
 * Approach: Traverse each customer's account array and calculate their
 *           total wealth. Maintain the maximum wealth using Math.max()
 *           and return the highest total.
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 */
public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
		int maxSum = 0;

		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println(maxSum);
	}

}
