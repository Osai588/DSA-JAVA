package com.javadsa.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

	public static void main(String[] args) {
		String paragraph ="a.";
		String[] banned = {};

		paragraph = paragraph.toLowerCase();
		paragraph = paragraph.replaceAll("[^a-z]", " ");
		String[] words = paragraph.split("\\s+");

		Map<String, Integer> map = new HashMap<String, Integer>();

		Set<String> set=new HashSet<String>();
		for (String word :banned) {
			set.add(word);
		}
		
		for (String word :words) {
			if (set.contains(word)) {
				continue;
			}
			else if(map.containsKey(word)) {
				map.put(word,map.get(word)+1);
			}
			else {
				map.put(word,1);
			}
		}
		int max=0;
		String s="";
		for(String key:map.keySet()) {
			if(map.get(key)>max) {
				max=map.get(key);
				s=key;
			}
		}
	System.out.println(s);

	}

}
