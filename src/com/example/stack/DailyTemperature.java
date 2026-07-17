package com.example.stack;

import java.util.Arrays;
import java.util.Stack;

/*
 * Problem: Daily Temperatures
 *
 * Approach:
 * - Use a Monotonic Decreasing Stack to store indices of temperatures.
 * - Traverse the array from left to right.
 * - While the current temperature is greater than the temperature at the
 *   index on the top of the stack, calculate the number of days waited
 *   and update the answer array.
 * - Push the current index onto the stack.
 * - Indices remaining in the stack have no warmer temperature ahead,
 *   so their answer remains 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class DailyTemperature {

	public static void main(String[] args) {
		int temperatures[]={73,74,75,71,69,72,76,73};
		
		 int ans[]=new int[temperatures.length];
	        Stack<Integer> stack=new Stack<Integer>();
	        for(int i=0;i<temperatures.length;i++){
	            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
	                ans[stack.peek()]=i-stack.peek();
	                stack.pop();
	            }
	            stack.push(i);
	        }
	        System.out.println(Arrays.toString(ans));
		

	}

}
