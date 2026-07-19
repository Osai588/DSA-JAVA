package com.javadsa.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
/*
 * Problem: Rank Transform of an Array
 *
 * Approach:
 * - Create a copy of the original array and sort it.
 * - Assign ranks to unique elements using a HashMap.
 * - Duplicate values receive the same rank.
 * - Traverse the original array and replace each element
 *   with its corresponding rank from the map.
 *
 * Time Complexity: O(n log n)
 *   - Sorting takes O(n log n)
 *   - Rank assignment and transformation take O(n)
 *
 * Space Complexity: O(n)
 *   - Extra space is used for the copied array and HashMap.
 */
public class RankTransformofanArray {

	public static void main(String[] args) {
		int[] arr = {37,12,28,9,100,56,80,5,12};
		int[] copy = Arrays.copyOf(arr, arr.length);

		Arrays.sort(copy);
		System.out.println(Arrays.toString(copy));
		Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		int rank=1;
		for (int i = 0; i < copy.length; i++) {
			if (map.containsKey(copy[i])) {
				map.put(copy[i],map.get(copy[i]));
			
			}
			else {
				map.put(copy[i],rank);
				rank++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				arr[i]=map.get(arr[i]);
				
			}
		}

		System.out.println(Arrays.toString(arr));


	}

}
