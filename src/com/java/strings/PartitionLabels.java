package com.java.strings;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: Partition Labels
 * Approach: First, store the last occurrence of each character in an array.
 *           Traverse the string and extend the current partition's end
 *           using the maximum last occurrence of its characters. When the
 *           current index reaches the partition end, record its length
 *           and start the next partition.
 * Time Complexity: O(n)
 * Space Complexity: O(1) - fixed-size array of 26 characters
 */
public class PartitionLabels {

	public static void main(String[] args) {
		String s = "banana";

		List<Integer> list = new ArrayList<>();
		int last[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			last[s.charAt(i) - 'a'] = i;

		}
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {
			end = Math.max(end, last[s.charAt(i) - 'a']);

			if (i == end) {
				int diff = end - start + 1;
				list.add(diff);
				start = i + 1;

			}
		}
		System.out.println(list);

	}

}
