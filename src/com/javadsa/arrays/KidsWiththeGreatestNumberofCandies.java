package com.javadsa.arrays;

import java.util.ArrayList;
import java.util.List;

class Solution25 {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<Boolean>();
		int max = candies[0];
		for (int i = 0; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}
		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}
}

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int[] candies = new int[] { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		System.out.println(Solution25.kidsWithCandies(candies, extraCandies));

	}

}
