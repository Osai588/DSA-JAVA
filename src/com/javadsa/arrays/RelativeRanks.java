package com.javadsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Relative Ranks
 *
 * Approach:
 * - Create a sorted copy of the scores.
 * - Traverse the sorted array in descending order and assign
 *   Gold, Silver, Bronze, or the corresponding rank.
 * - Store the rank for each score in a HashMap.
 * - Traverse the original array and replace each score with
 *   its assigned rank.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class RelativeRanks {

	public static void main(String[] args) {
		int[] score = { 10, 3, 8, 9, 4 };

		int[] copy = Arrays.copyOf(score, score.length);

		Arrays.sort(copy);
		String[] arr = new String[score.length];
		Map<Integer, String> map = new HashMap<Integer, String>();
		int rank = 1;
		for (int i = copy.length - 1; i >= 0; i--) {

			if (rank == 1) {
				map.put(copy[i], "Gold Medal");
			} else if (rank == 2) {
				map.put(copy[i], "Silver Medal");
			} else if (rank == 3) {
				map.put(copy[i], "Bronze Medal");
			} else {
				map.put(copy[i], String.valueOf(rank));
			}
			rank++;
		}

		for (int i = 0; i < score.length; i++) {
			arr[i] = map.get(score[i]);

		}
		System.out.println(Arrays.toString(arr));
	}

}
