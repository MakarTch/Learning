package com.cognixia.javaprep.charles;

public class Two {

	public static void main(String[] args) {

		String str = "Reverse Me";
		System.out.println(reverseOne(str));
		System.out.println(reverseTwo(str));
		
		String str2 = "A sentence with many spaces";
		System.out.println(reverseThree(str2));

	}

	public static String reverseOne(String str) {
		StringBuilder strBuilder = new StringBuilder(str);
		String returnStr = strBuilder.reverse().toString();
		return returnStr;
	}
	
	public static String reverseTwo(String str) {
		char[] charArray = str.toCharArray();
		int arrayLength = charArray.length;
		String returnStr = "";
		Character addChar;
		for (int i = arrayLength-1; i>=0; i--) {
			addChar = (Character)charArray[i];
			returnStr += addChar.toString();
		}
		return returnStr;
	}
	
	public static String reverseThree(String str) {
		String[] strArray = str.split(" ");
		String returnStr = "";
		for (String s : strArray) {
			returnStr += new StringBuilder(s).reverse().toString() + " ";
		}
		return returnStr;
	}

	
	
}
