package com.java.strings;
/*
 * Problem: Goat Latin
 *
 * Approach:
 * - Split the sentence into words.
 * - Move the first character to the end if the word starts with a consonant.
 * - Append "ma" and an increasing number of 'a' characters based on
 *   the word's position.
 * - Build the final sentence using StringBuilder.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */
public class GoatLatin {

	public static void main(String[] args) {
		String sentence = "I speak Goat Latin";

		StringBuilder sb = new StringBuilder();

		String[] str = sentence.split(" ");
		String a = "a";

		for (int i = 0; i < str.length; i++) {

			StringBuilder word = new StringBuilder(str[i]);
			char ch = Character.toLowerCase(word.charAt(0));

			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				char letter = word.charAt(0);
				word.deleteCharAt(0);
				word.append(letter);
			}
			word.append("ma");
			word.append(a.repeat(i + 1));
			sb.append(word);

			if (i < str.length - 1) {
				sb.append(" ");
			}

		}

		System.out.println(sb.toString());
	}

}
