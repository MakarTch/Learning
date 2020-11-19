package com.cognixia.javaprep.weekfour;

import java.util.*;

public class SubString {

	public static void main(String[] args) {
		String s = "abcdabcde";
		System.out.println(lengthSubstring(s));
		
	}

	
	public static int lengthSubstring(String s) {
		int answer = 0;
		int length = s.length();
		ArrayList<Character> charList = new ArrayList<>();
		int end = 0;
		int beg = 0;
		while (end<length && beg<length) {
			if(!charList.contains(s.charAt(end))) {
				charList.add(s.charAt(end));
				end++;
				answer = Math.max(answer, end-beg);
			} else {
				charList.remove((Character) s.charAt(beg));
				beg++;
			}
			System.out.println(charList);
		}
		return answer;
	}			
			
		/*
		 *Ok type it out first
		 *i have a beginning of the moving window, then I have an end, beg and end
		 *loop one, o
		 *
		 *loop n, i have the arraylist that has chars inside, 
		 *beg stays the same unless the new arraylist has repeating characters
		 *end stays the same unless the new arraylsit doenst have repeating chars
		 *
		 *
		 */
			
			
		
		
		

}
