package com.java.strings;

/*
 * Problem: Slowest Key
 * Approach: Calculate each key's press duration using the difference between
 *           consecutive release times. Track the maximum duration and, in
 *           case of a tie, choose the lexicographically larger character.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution17 {
	public static char slowestKey(int[] releaseTimes, String keysPressed) {
		char ch = 'a';
		int ans = 0;
		int time = 0;

		for (int i = 0; i < releaseTimes.length; i++) {
			if (i == 0) {
				time = releaseTimes[i] - 0;
			} else {
				time = releaseTimes[i] - releaseTimes[i - 1];

			}

			if (ans < time) {
				ans = time;
				ch = keysPressed.charAt(i);
			} else if (ans == time && ch < keysPressed.charAt(i)) {
				ch = keysPressed.charAt(i);

			}

		}

		return ch;
	}
}

public class SlowestKey {

	public static void main(String[] args) {
		int[] releaseTimes = { 9, 29, 49, 50 };
		String keysPressed = "cbcd";

		System.out.println(Solution17.slowestKey(releaseTimes, keysPressed));

	}

}
