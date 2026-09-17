package com.java.strings;

/*
 * Problem: Generate a String With Characters That Have Odd Counts
 * Approach: If n is odd, use 'a' n times. If n is even, use 'a' n-1 times
 *           and add one 'b', making both character frequencies odd.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution11 {
	public static String generateTheString(int n) {
		String str = "a";
		String ans = str.repeat(n);
		if (n % 2 == 0) {
			ans = str.repeat(n - 1);
			return ans + "b";
		}

		return ans;
	}
}

public class GenerateaStringWithCharactersThatHaveOddCounts {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(Solution11.generateTheString(n));
	}

}
