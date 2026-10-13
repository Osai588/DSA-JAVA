package com.java.strings;

/*
 * Problem: Count Asterisks
 * Approach: Traverse the string and toggle the inside flag whenever '|' is
 *           encountered. Count '*' only when the flag indicates we are
 *           outside a pair of vertical bars.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class CountAsterisks {

	public static void main(String[] args) {
		String s = "l|*e*et|c**o|*de|";
		int count = 0;
		boolean inside = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '|')
				inside = !inside;
			else if (s.charAt(i) == '*' && !inside)
				count++;
		}
		System.out.println(count);
	}

}
