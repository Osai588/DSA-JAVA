package com.java.strings;

/*
 * Problem: Capitalize the Title
 * Approach: Split the title into words. Convert words with length <= 2
 *           completely to lowercase. For longer words, capitalize the
 *           first character and convert the remaining characters to lowercase.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class CapitalizetheTitle {

	public static void main(String[] args) {
		String title = "capiTalIze tHe titLe";
		String[] Words = title.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Words.length; i++) {

			if (Words[i].length() <= 2) {
				sb.append(Words[i].toLowerCase());
				if (i < Words.length - 1) {
					sb.append(" ");
				}
				continue;

			}
			String word = Words[i];

			sb.append(Character.toUpperCase(word.charAt(0)));
			sb.append(word.substring(1).toLowerCase());
			if (i < Words.length - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

}
