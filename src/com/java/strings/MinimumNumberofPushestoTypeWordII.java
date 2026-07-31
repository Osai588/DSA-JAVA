package com.java.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Optimal:
	 * - Count character frequencies using a fixed-size frequency array.
	 * - Sort the frequency array and process frequencies in descending order.
	 * - Assign push costs (1 to 4) based on character frequency.
	 *
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 *
	 * Note:
	 * - k = number of distinct characters (maximum 26 lowercase letters).
	 * - Since the frequency array size is fixed (26), sorting it is treated
	 *   as constant time, making the overall complexity O(n).
	 */
public class MinimumNumberofPushestoTypeWordII {

	public static void main(String[] args) {
		String word = "aabbccddeeffgghhiiiiii";
		int freq[] = new int[26];

		for (char ch : word.toCharArray()) {
			freq[ch - 'a']++;
		}

		Arrays.sort(freq);

		int sum = 0;
		int count = 0;
		for (int i = 25; i >= 0; i--) {
			if (freq[i] == 0) {
				break;
			}

			if (count < 8) {
				sum += freq[i];
			} else if (count < 16) {
				sum += freq[i] * 2;
			} else if (count < 24) {
				sum += freq[i] * 3;
			} else {
				sum += freq[i] * 4;
			}
			count++;
		}
		System.out.println(sum);

		/*
		 * Problem: Minimum Number of Pushes to Type Word II
		 *
		 * Brute Force: - Count the frequency of each character using a HashMap. - Store
		 * the frequencies in a list and sort them in descending order. - Assign push
		 * costs based on frequency to minimize total pushes.
		 *
		 * Time Complexity: O(n + k log k) Space Complexity: O(k)
		 */
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}

		int count1 = 0;
		int sum1 = 0;
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {

			if (count1 < 8) {
				sum1 += list.get(i) * 1;
			} else if (count1 < 16) {
				sum1 += list.get(i) * 2;
			} else if (count1 < 24) {
				sum1 += list.get(i) * 3;
			} else {
				sum1 += list.get(i) * 4;
			}
			count1++;
		}

		System.out.println(sum1);

	}

}
