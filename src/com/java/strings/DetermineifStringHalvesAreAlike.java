package com.java.strings;

class Solution18 {
	public static boolean halvesAreAlike(String s) {
		int vowelCount = 0;

		for (int i = 0; i < s.length() / 2; i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vowelCount++;
			}

		}

		for (int i = s.length() / 2; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vowelCount--;
			}

		}
		return vowelCount == 0;
	}
}

public class DetermineifStringHalvesAreAlike {

	public static void main(String[] args) {
		String s = "book";
		System.out.println(Solution18.halvesAreAlike(s));
	}

}
