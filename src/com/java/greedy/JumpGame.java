package com.java.greedy;
/*
 * Problem: Jump Game
 * Approach: Greedy
 * 1. Maintain maxJump to track the farthest reachable index.
 * 2. If the current index exceeds maxJump, return false.
 * 3. Update maxJump using i + nums[i].
 * 4. If the loop completes, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution26 {
	public static boolean canJump(int[] nums) {
		int maxJump = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > maxJump) {
				return false;
			}
			maxJump = Math.max(maxJump, i + nums[i]);
		}

		return true;
	}
}

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };

		System.out.println(Solution26.canJump(nums));

	}
}
