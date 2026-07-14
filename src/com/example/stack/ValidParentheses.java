package com.example.stack;

import java.util.Stack;

/*
 * LeetCode 20 - Valid Parentheses
 *
 * Approach:
 * 1. Push every opening bracket onto the stack.
 * 2. For every closing bracket:
 *    - If the stack is empty, return false.
 *    - Pop the top element and verify it matches the current closing bracket.
 * 3. After processing all characters, the stack must be empty.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ValidParentheses {

	public static void main(String[] args) {
		String s = "({[]})";

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);

			} else {
				if (stack.isEmpty()) {
					System.out.println(false);
					return;
				}
				char top = stack.pop();

				if ((ch == '}' && top != '{') || (ch == ')' && top != '(') || (ch == ']' && top != '[')) {
					System.out.println(false);
				}

			}

		}
		System.out.println(stack.isEmpty());

	}

}
