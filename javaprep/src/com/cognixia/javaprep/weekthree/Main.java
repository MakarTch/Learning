package com.cognixia.javaprep.weekthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//synchronizing a hashmap
		HashMap<Integer,String> makMap = new HashMap<Integer, String>();
		makMap.put(1, "one");
		makMap.put(2,"two");
		makMap.put(null,"three");
		makMap.put(null,"hello");
		System.out.println("Before Synchronizing");
		System.out.println(makMap);
		
		Map<Integer, String> threadSafeMap = Collections.synchronizedMap(makMap);
		
		System.out.println("\nAfter Synchronizing");
		System.out.println(threadSafeMap);
		
		//comparing hashmap to hashtable
		Hashtable<Integer,String> makTable = new Hashtable<>();
		makTable.put(1, "one");
		makTable.put(2,"two");
		//makTable.put(null,"three");
		System.out.println(makTable);

		
		//practicing sub and super classes
		SubClass sub = new SubClass();
		System.out.println(sub.superMethod());
		System.out.println(sub.int1);
		
		//Reverse a String using an ArrayList
		
		String str = "ReverseMe";
		String[] charArray = str.split("");
		List<String> charList = Arrays.asList(charArray);
		Collections.reverse(charList);
        String reversedString = String.join("", charList);
        
		
		System.out.println("Before Reverse");
		System.out.println(str);
		System.out.println("\nAfter reverse");
        System.out.println(reversedString);
		
		
	}
}