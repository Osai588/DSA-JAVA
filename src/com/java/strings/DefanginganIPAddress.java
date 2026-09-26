package com.java.strings;

/*
 * Problem: Defanging an IP Address
 * Approach: Replace every '.' in the IP address with '[.]'.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution14 {
	public static String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

}

public class DefanginganIPAddress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		System.out.println(Solution14.defangIPaddr(address));

	}

}
