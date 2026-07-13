package com.javadsa.math;

/*
 * Add two binary strings using Bit Manipulation.
 * Traverse both strings from right to left.
 * XOR is used to find the current bit, and bitwise operations calculate the carry.
 *
 * Time Complexity: O(max(n, m))
 * Space Complexity: O(max(n, m))
 */

public class AddBinary {
public static void main(String[] args) {
	String a = "11";
	String b = "1";
	
	int l=a.length()-1;
	int r=b.length()-1;
	int carry=0;
	StringBuffer sb=new StringBuffer();
	while(l>=0 ||r>=0 || carry!=0) {
		int bit1=(l>=0)?a.charAt(l--)-'0':0;
		int bit2=(l>=0)?a.charAt(r--)-'0':0;
		
		int sum=bit1^bit2^carry;
		
		carry=((bit1 & bit2)|(bit1 & carry)|(bit2 & carry));
	 sb.append(sum);
	}
	
	System.out.println(sb.reverse().toString());
	
}
}
