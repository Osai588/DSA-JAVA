package com.javadsa.math;

/*
 * Calculates the GCD of the sum of the first n odd numbers
 * and the sum of the first n even numbers using the
 * Euclidean Algorithm.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class GcdofOddandEvenSums {

	public static void main(String[] args) {
		int n = 4;
		int oddsum = n * n;
		int evensum = n * (n + 1);

		while (evensum != 0) {
			int temp = evensum;
			evensum = oddsum % evensum;
			oddsum = temp;
		}
		System.out.println(oddsum);
	}

}
