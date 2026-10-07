package com.javadsa.arrays;

import java.util.Arrays;

/*
 * Problem: Transpose Matrix
 * Approach: Create a new matrix with swapped dimensions. For every element
 *           matrix[i][j], place it at result[j][i].
 * Time Complexity: O(m * n)
 * Space Complexity: O(m * n)
 */
public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] result = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[j][i] = matrix[i][j];
			}

		}
		System.out.println(Arrays.deepToString(result));
	}

}
