package com.cognixia.javaprep.weekfour;

import java.util.*;

public class Furies {

	public static void main(String[] args) {
		//Collections
		
		//lists
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
//		System.out.println(arrList);
		
		LinkedList<Integer> linkList = new LinkedList<>();
		//Whats the difference between an arraylist and a linkedlist?
		/*
		 * linkedlist is fast for adding and delting elements, but slow to access an element
		 * arraylist is fast for accessing a specific element but slow to add or delete.
		 */
		
		//
		int [] arr = {4};
		arr[0] = 2;
//		System.out.println(arr[0]);
//		System.out.println(arr);
		
		String str = "abc!@#ABCzzZZ";
		String[] strArray = str.split("");
		
		int asciiValue;
		String displayString ="";
		for (String s : strArray) {
			asciiValue = s.charAt(0);
			if (asciiValue>=65 && asciiValue<=90)
				displayString += asciiValue-64;
			else if (asciiValue>=97 && asciiValue<=122)
				displayString += asciiValue-96;
			else
				displayString += s;
		}
//		System.out.println(displayString);
//		
//		System.out.println("fastFoOd".toLowerCase().contains("food"));
		
		String password = "Hello123";
		//System.out.println(SimplePassword(password));
		String[] nodeArray = new String[] {"b-e","b-c","c-d","a-b","e-f"};
	    System.out.println(FarthestNodes(nodeArray)); 
	    System.out.println(function(1,"hello"));
	    System.out.println((function("hello",1)));
	}
	
	public static String FarthestNodes(String[] strArr) {
		System.out.println("lkd");
	    return strArr[0];
	  }
	
	public static boolean SimplePassword(String str) {
	    String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!-+=%/]).{7,31}$";
	    if (str.toLowerCase().contains("password"))
	      return false;
	    return str.matches(regex);
	  }
	
	public static boolean function(int int1, String int2) {
		return true;
	}
	
	public static boolean function(String int2, int int1) {
		return false;
	}
	
}
