package com.cognixia.javaprep.weekfour;

import java.util.*;

public class Furies {

	public static void main(String[] args) {
		//Collections
		
		//lists
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		System.out.println(arrList);
		
		LinkedList<Integer> linkList = new LinkedList<>();
		//Whats the difference between an arraylist and a linkedlist?
		/*
		 * linkedlist is fast for adding and delting elements, but slow to access an element
		 * arraylist is fast for accessing a specific element but slow to add or delete.
		 */
		
		//
		int [] arr = {4};
		arr[0] = 2;
		System.out.println(arr[0]);
		System.out.println(arr);
		
	}

}
