package com.javadsa.arrays;

class Solution7 {
    static public boolean uniformArray(int[] nums1) {
        /*
         * Same parity:
         * 
         * Even + Even = Even
         * Odd + Odd = Even
         *
         * Different parity:
         * 
         * Even + Odd = Odd
         * Odd + Even = Odd
         *
         * The required uniform parity array can always be constructed.
         */
        return true;
    }
}
public class ConstructUniformParityArrayI {

	public static void main(String[] args) {

		  int[] nums1 = {1, 2, 3, 4};

	        System.out.println(Solution7.uniformArray(nums1));
		
	}

}
