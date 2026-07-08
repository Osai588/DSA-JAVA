package com.javadsa.twopointers;
/*
Approach:
1. Place one pointer at the beginning and one at the end.
2. Calculate the area using the shorter height.
3. Update the maximum area.
4. Move the pointer with the smaller height.
5. Repeat until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int max = 0;
		int l = 0;
		int r = height.length - 1;
		int area = 0;

		while (l < r) {
			int breadth = r - l;
			int length = Math.min(height[l], height[r]);
			
			area = length * breadth;
			max = Math.max(max, area);
			if (height[l] < height[r]) {
				l++;
			} else if (height[l] > height[r]) {
				r--;
			}

			else {
				l++;
				r--;
			}
		}
		System.out.println(max);

	}
}
