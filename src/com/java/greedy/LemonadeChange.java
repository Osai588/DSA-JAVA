package com.java.greedy;

/*
 * Problem: Lemonade Change
 * Approach: Maintain counts of $5 and $10 bills. For a $5 payment,
 *           increment the $5 count. For a $10 payment, give one $5 bill.
 *           For a $20 payment, prefer giving one $10 and one $5 bill;
 *           otherwise, give three $5 bills. Return false if change
 *           cannot be provided.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution24 {
	public static boolean lemonadeChange(int bills[]) {
		int fives = 0;
		int tens = 0;

		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				fives++;
			} else if (bills[i] == 10) {
				if (fives >= 1) {
					tens++;
					fives--;
				} else {
					return false;
				}
			} else {
				if (tens >= 1 && fives >= 1) {
					tens--;
					fives--;
				} else if (fives >= 3) {
					fives -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}

public class LemonadeChange {

	public static void main(String[] args) {
		int bills[] = { 5, 5, 5, 10, 20 };
		System.out.println(Solution24.lemonadeChange(bills));
	}

}
