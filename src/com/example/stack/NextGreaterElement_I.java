package com.example.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/*
 * Problem: Next Greater Element I
 *
 * Approach:
 * - Traverse nums2 from right to left using a Monotonic Decreasing Stack.
 * - Remove all elements smaller than or equal to the current element.
 * - The top of the stack (if present) is the next greater element.
 * - Store each element and its next greater element in a HashMap.
 * - Traverse nums1 and replace each element with its mapped next greater value.
 *
 * Time Complexity: O(n + m)
 *   n = nums2.length, m = nums1.length
 *
 * Space Complexity: O(n)
 *   Used for the Stack and HashMap.
 */


public class NextGreaterElement_I {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };

		Stack<Integer> stack = new Stack<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = nums2.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				map.put(nums2[i], -1);
			} else {
				map.put(nums2[i], stack.peek());
			}
			stack.push(nums2[i]);
		}

		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				nums1[i] = map.get(nums1[i]);
			}
		}
		System.out.println(Arrays.toString(nums1));

	}

}
