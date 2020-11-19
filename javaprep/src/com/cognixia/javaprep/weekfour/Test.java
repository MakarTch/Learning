package com.cognixia.javaprep.weekfour;

import java.util.ArrayList;

public class Test {

	
	public static void main(String args[]) {
		String str = "hello";
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());
		System.out.println(builder.reverse());
		ArrayList<Character> makList = new ArrayList<>();
		makList.add('a');
		makList.add('b');
		makList.add('c');
		makList.add('d');
		makList.add('a');
		makList.remove((Character)'a');
		makList.remove((Character)'a');
		System.out.println(makList);
	}
}
