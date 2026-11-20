package com.java.strings;

/*
 * Problem: Goal Parser Interpretation (LeetCode 1678)
 * Approach:
 * 1. Traverse the command string character by character.
 * 2. If the character is 'G', append 'G' to the StringBuilder.
 * 3. If the pattern is "()", append 'o' and skip the next character.
 * 4. If the pattern is "(al)", append "al" and skip the remaining three characters.
 * 5. Return the constructed string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the output StringBuilder.
 */
public class GoalParserInterpretation {

	public static void main(String[] args) {
		String command = "G()(al)";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				sb.append('G');
			} else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				sb.append('o');
				i++;
			} else {
				sb.append("al");
				i += 3;
			}
		}
		System.out.println(sb.toString());
	}

}
