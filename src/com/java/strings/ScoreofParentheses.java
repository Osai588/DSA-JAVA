package com.java.strings;

import java.util.Stack;

/*
 * Problem: Score of Parentheses
 * Approach: Use a stack to store the score of each nested level.
 *           "()" contributes 1, while a nested score contributes 2 * score.
 *           Combine the calculated score with the previous level's score.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ScoreofParentheses {

	public static void main(String[] args) {
		String s = "(()(()))";
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch == '(') {
				stack.add(0);
			} else {
				int innerScore = stack.pop();
				int score;

				if (innerScore == 0) {
					score = 1;
				} else {
					score = 2 * innerScore;
				}
				int preScore = stack.pop();
				stack.push(score + preScore);
			}

		}
		System.out.println(stack.peek());
	}

}
