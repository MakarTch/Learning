package com.cognixia.javaprep.weektwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	static final char[] PUNCTUATION = {',','"','\'',':',';','.','!','?'};
	static Set<Character> ignoredCharacters = new HashSet<>();
	static {
		for (char ch : PUNCTUATION) {
			ignoredCharacters.add(ch);
		}
	}
	
	static String clean(String dirtyString) {
		StringBuilder sb = new StringBuilder();
		for (char ch : dirtyString.toCharArray()) {
			if ( !(Character.isWhitespace(ch) || ignoredCharacters.contains(ch)) ) {
				sb.append(Character.toLowerCase(ch));
			}
		}
		return sb.toString();
	}

	static boolean checkPalindrome0(String testStr) {
		testStr = clean(testStr);
		return testStr.equals(new StringBuilder(testStr).reverse().toString());
	}

	static boolean checkPalindrome1(String testStr) {
		testStr = clean(testStr);
		if (testStr.equals("")) {return true;}
		int indOfLastChar = testStr.length() - 1;
		for (int i = 0; i < testStr.length()/2; i++) {
			if (testStr.charAt(i) != testStr.charAt(indOfLastChar - i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String emptyStr = "";
		String whitespace =  "nur\tses run";
		String punctuation = ".!12noon21?!";
		String capitalization = "mAdam";
		String lengthOne = "a";
		String oddLength = "aba";
		String evenLength = "abba";
		String badString = "bad";
		String badString2 = "%12@)";
		
		//Test clean method
		System.out.println("Test clean method");
		System.out.println(String.format("Input: %-21s Expected: %-10s Actual: %s", 
				emptyStr,"",clean(emptyStr)));
		System.out.println(String.format("Input: %-16s Expected: %-10s Actual: %s", 
				whitespace,"nursesrun",clean(whitespace)));
		System.out.println(String.format("Input: %-21s Expected: %-10s Actual: %s", 
				punctuation,"12noon21",clean(punctuation)));
		System.out.println(String.format("Input: %-21s Expected: %-10s Actual: %s", 
				capitalization,"madam",clean(capitalization)));
		
		System.out.println();	
		
		//Test checkPalindrome0 method
		System.out.println("Test checkPalindrome0 method");
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				emptyStr,true,checkPalindrome0(emptyStr)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				lengthOne,"",checkPalindrome0(lengthOne)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				oddLength,true,checkPalindrome0(oddLength)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				evenLength,true,checkPalindrome0(evenLength)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				badString,false,checkPalindrome0(badString)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				badString2,false,checkPalindrome0(badString2)));
		
		System.out.println();
		
		//Test checkPalindrome1 method
		System.out.println("Test checkPalindrome1 method");
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				emptyStr,true,checkPalindrome1(emptyStr)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				lengthOne,"",checkPalindrome1(lengthOne)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				oddLength,true,checkPalindrome1(oddLength)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				evenLength,true,checkPalindrome1(evenLength)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				badString,false,checkPalindrome1(badString)));
		System.out.println(String.format("Input: %-21s Expected: %-10b Actual: %b", 
				badString2,false,checkPalindrome1(badString2)));
			
	}
		
	
	
	
}
