package com.javadsa.math;

public class SumAndMultiply {
	public static void main(String[] args) {
		/*
		Problem: Sum and Multiply

		Approach:
		1. Traverse the number from right to left.
		2. Ignore digits equal to 0.
		3. Add each non-zero digit to the sum.
		4. Construct the new number by placing each non-zero digit at its correct decimal place using a place-value multiplier.
		5. Return finalNumber * sum.

		Time Complexity: O(log N)
		Space Complexity: O(1)
		*/
		int n = 10203004;
		long sum=0;
		int finalnum=0;
		int placeValue=1;
		
		while (n!=0) {
			int rem =n%10;
			if(rem!=0) {
		       sum+=rem;
		      finalnum+=rem*placeValue;
		      placeValue*=10;
			}
			n/=10;
		}
	System.out.println((long)finalnum*sum);
	}

}
