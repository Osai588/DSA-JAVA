package com.javadsa.math;

class Solution23 {
	public static boolean isSameAfterReversals(int num) {
		int rev1 = 0;
		int temp = num;

		while (temp != 0) {
			int rem = temp % 10;
			rev1 = rev1 * 10 + rem;
			temp /= 10;
		}

		int rev2 = 0;

		while (rev1 != 0) {
			int rem = rev1 % 10;
			rev2 = rev2 * 10 + rem;
			rev1 /= 10;
		}
		if (rev2 == num) {
			return true;
		}
		return false;
	}
}

public class ANumberAfteraDoubleReversal {

	public static void main(String[] args) {
		int num = 526;
		System.out.println(Solution23.isSameAfterReversals(num));
	}

}
