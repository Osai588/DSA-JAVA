package com.example.stack;

import java.util.Stack;

/*
 * Problem: Make The String Great
 * Approach: Use a stack to store characters. If the current character and
 *           stack top differ by 32 in ASCII, they are the same letter
 *           with opposite cases, so remove the stack top. Otherwise, push
 *           the current character. Finally, build the resulting string.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution12 {
	public static String makeGood(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.add(s.charAt(i));

			}
			else {
				if(Math.abs(s.charAt(i)-stack.peek())==32) {
					stack.pop();
				}
				else {
					stack.add(s.charAt(i));
				}
			}

		}
		StringBuilder sb=new StringBuilder();
		for (Character ch:stack) {
			sb.append(ch);

		}
		return sb.toString();
	}
}

public class MakeTheStringGreat {

	public static void main(String[] args) {
		String s = "leEeetcode";
		System.out.println(Solution12.makeGood(s));
	}

}
