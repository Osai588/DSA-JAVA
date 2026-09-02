package com.javadsa.math;
/*
 * Problem: Thousand Separator
 * Approach: Extract digits from right to left and insert each digit at the beginning.
 *            After every 3 digits, insert a '.' when more digits remain.
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */
public class ThousandSeparator {

	public static void main(String[] args) {
		int n = 1234;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while(n>0) {
			int rem=n%10;
			count++;
			sb.insert(0,rem);
			if(count%3==0 && n/10>0) {
				sb.insert(0,'.');
			}
			n/=10;
		}
System.out.println(sb.toString());
	}

}
