package com.javadsa.arrays;

/*
 * Problem: Number of Senior Citizens
 * Approach: Extract the two-digit age from indices 11 and 12 of each string.
 *           Convert it to an integer and count people whose age is greater than 60.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution20 {
	public static int countSeniors(String[] details) {
		int person = 0;

		for (int i = 0; i < details.length; i++) {
//			int age = Integer.parseInt(details[i].substring(11, 13));
			int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');

			if (age > 60)
				person++;

		}

		return person;
	}
}

public class NumberofSeniorCitizens {

	public static void main(String[] args) {
		String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };

		System.out.println(Solution20.countSeniors(details));

	}

}
