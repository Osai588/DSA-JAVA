package com.javadsa.arrays;

/*
 * Problem: Rectangle Overlap
 * Approach: Calculate the overlapping width and height using the maximum
 *           of left/bottom coordinates and minimum of right/top coordinates.
 *           Both width and height must be greater than 0 for an overlap.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution10 {
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		int width = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
		int height = Math.min(rec1[3], rec2[1]) - Math.max(rec1[1], rec2[1]);

		return width > 0 && height > 0;
	}
}

public class RectangleOverlap {
	public static void main(String[] args) {

		int[] rec1 = { 0, 0, 2, 2 };
		int[] rec2 = { 1, 1, 3, 3 };

		System.out.println(Solution10.isRectangleOverlap(rec1, rec2));

	}
}
