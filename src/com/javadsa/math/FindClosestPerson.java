package com.javadsa.math;

/*
 * Problem: Find Closest Person
 * Approach: Calculate the absolute distances between person 1 and person 3,
 *           and person 2 and person 3. Compare both distances and return
 *           1 or 2 based on which person is closer. Return 0 if both
 *           distances are equal.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution22 {
	public static int findClosest(int x, int y, int z) {
		int diff1 = Math.abs(z - x);
		int diff2 = Math.abs(z - y);
		if (diff1 < diff2) {
			return 1;
		} else if (diff1 > diff2) {
			return 2;
		}
		return 0;
	}
}

public class FindClosestPerson {

	public static void main(String[] args) {
		int x = 2, y = 7, z = 4;
		System.out.println(Solution22.findClosest(x, y, z));
	}

}
