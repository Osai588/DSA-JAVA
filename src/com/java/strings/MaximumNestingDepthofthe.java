package com.java.strings;

import java.util.Stack;

/*
 * Problem: Maximum Nesting Depth of the Parentheses
 * Approach: Use a stack to track opening parentheses. Push '(' and update
 *           the maximum depth using the stack size. Pop when ')' is found.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class MaximumNestingDepthofthe {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s = "(1+(2*3)+((8)/4))+1";
		int depth = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.add(ch);
				depth = Math.max(depth, stack.size());
			} else if (ch == ')') {
				stack.pop();
			}
		}
		System.out.println(depth);
	}

}
