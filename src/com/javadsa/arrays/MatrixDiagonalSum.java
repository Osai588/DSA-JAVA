package com.javadsa.arrays;

/*
 * Problem: Matrix Diagonal Sum
 * Approach: Traverse the matrix once and add both the primary and secondary
 *           diagonal elements. Skip the secondary diagonal element when it
 *           overlaps with the primary diagonal.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			sum += mat[i][i];
			if (i != mat.length - 1 - i) {
				sum += mat[i][mat.length - 1 - i];
			}
		}
		System.out.println(sum);
	}

}
