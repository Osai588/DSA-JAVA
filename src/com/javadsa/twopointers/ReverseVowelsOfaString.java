package com.javadsa.twopointers;
/*
Problem: Reverse Vowels of a String
Approach: Two Pointers
Time Complexity: O(n)
Space Complexity: O(n) // due to char array
*/
public class ReverseVowelsOfaString {

	public static void main(String[] args) {
		
		String s = "IceCreAm";
		String str = "AEIOUaeiou";
	char[] ch=s.toCharArray();
		int l = 0;
		int r = ch.length - 1;
		while (l<r) {
			char ch1=ch[l];
			char ch2=ch[r];
			if (!str.contains(String.valueOf(ch1))) {
				l++;
			}
			else if(!str.contains(String.valueOf(ch2))) {
				r--;
			}
			else if(str.contains(String.valueOf(ch1)) && str.contains(String.valueOf(ch2))) {
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
			
		}
		
System.out.println(new String(ch));
	}

}
