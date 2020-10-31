package com.cognixia.javaprep.weekthree;

import java.util.ArrayList;
import java.util.*;
import java.util.Set;

public class FridayMain {
	
	public static void main(String args[]) {
//		System.out.println(isPalindrome(3003));
//		System.out.println(isPalindrome(124));
//		System.out.println(isPalindrome(28082));
//		System.out.println(isPalindrome(234));
		
		
		
		int[] hello = {2,3,4};
//		for (int num: hello)
//			System.out.println(num);
		
		int[] yo = new int[3];
		yo[0] = 1;
		
		List<Integer> makList = new ArrayList<>();
		makList.add(1);
		makList.add(2);
		makList.add(3);
		makList.add(4);
		makList.add(10);
		makList.add(6);
		makList.add(7);
		makList.add(8);

//		for(int smith: makList)
//			System.out.println(smith);
		
		//Thats wild you can use this to print through a list 
		makList.forEach(System.out::println);
		
		System.out.println("=======================");
		HashSet<Integer> makSet = new HashSet<>();
		makSet.add(100);
		makSet.add(2);
		makSet.add(3);
		makSet.add(4);
		makSet.add(10);
		makSet.add(6);
		makSet.add(7);
		makSet.add(8);
		
		for (int smith: makSet)
			System.out.println(smith);

		System.out.println("=======================");
		TreeSet<Integer> makSet2 = new TreeSet<>();
		makSet2.add(100);
		makSet2.add(2);
		makSet2.add(3);
		makSet2.add(4);
		makSet2.add(10);
		makSet2.add(6);
		makSet2.add(7);
		makSet2.add(8);
		
		for (int smith: makSet2)
			System.out.println(smith);
		
		System.out.println("=======================");

		
		
	}
	
	
	public static boolean isPalindrome(int x) {
		if(x<0) {return false;}
		int number = x;
		int reversed = 0;
		while(number > 0) {
			reversed *=10;
			reversed += number%10;
			number = number/10;
		}
		return (x == reversed);
	}
	
}
