package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberofBallons {
	/*
	 * Problem: Maximum Number of Balloons
	 *
	 * Approach: - Count the frequency of each character using a HashMap. -
	 * "balloon" requires: b = 1, a = 1, l = 2, o = 2, n = 1. - Divide the
	 * frequencies of 'l' and 'o' by 2. - The minimum frequency among all required
	 * characters determines the maximum number of "balloon" strings.
	 *
	 * Time Complexity: O(n) Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		String  text = "nlaebolko";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		
		for (int i = 0; i < text.length(); i++) {
			char ch=text.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
				
			}
		}
		int ans = Math.min( Math.min(map.getOrDefault('b',0), map.getOrDefault('a',0)),Math.min( Math.min(map.getOrDefault('l',0) / 2, map.getOrDefault('o',0) / 2),
				map.getOrDefault('n',0)
			    )
			);
		System.out.println(ans);
	}

}
