package com.javadsa.arrays;

/*
 * Problem: Distance Between Bus Stops
 *
 * Approach:
 * - Calculate the total distance of all bus stops.
 * - Calculate the clockwise distance from start to destination.
 * - The counter-clockwise distance is the total distance minus
 *   the clockwise distance.
 * - Return the minimum of the two distances.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class DistanceBetweenBusStops {

	public static void main(String[] args) {
		int[] distance = { 1, 2, 3, 4 };
		int start = 0;
		int destination = 1;
		int total = 0;
		int clkWisesum = 0;

		for (int i : distance) {
			total += i;
		}

		for (int i = start; i < destination; i = (i + 1) % distance.length) {
			clkWisesum += distance[i];
		}
		int antiClkWise = clkWisesum - total;
		System.out.println(Math.min(clkWisesum, antiClkWise));
	}

}
