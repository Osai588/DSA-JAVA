package com.example.stack;

import java.util.Stack;
/*
 * Approach:
 * 1. Traverse each character in the string.
 * 2. If the stack is empty, push the character.
 * 3. Compare the current character with the top of the stack.
 * 4. If both are the same, pop the top element (remove adjacent duplicates).
 * 5. Otherwise, push the current character.
 * 6. Build the answer from the remaining characters in the stack.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "abbaca";
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (stack.isEmpty()) {
				stack.push(ch);

			} else {
				char top = stack.peek();
				if (top == ch) {
					stack.pop();
				} else {
					stack.push(ch);
				}

			}
		}
		for (char ch : stack) {
			sb.append(ch);

		}
		System.out.println(sb.toString());

	}

}
