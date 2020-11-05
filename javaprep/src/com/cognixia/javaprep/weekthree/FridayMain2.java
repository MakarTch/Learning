package com.cognixia.javaprep.weekthree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class FridayMain2 {

	public static void main(String args[]) {
		Vector<Integer> v = new Vector<>();
		v.add(4);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(1);
		v.add(2);
		v.add(-8);
		System.out.println(v.toString());		
		
		HashSet<Integer> values = new HashSet<>();
		values.add(1);
		values.add(2);
		values.add(45);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(99);
		values.add(10);
		System.out.println(values);
		System.out.println("==================");
		
		HashMap<Integer,Integer> makMap = new HashMap<>();
		makMap.put(1,2);
		makMap.put(2,null);
		
		System.out.println(makMap);
		for (int key : makMap.keySet())
			System.out.println(makMap.get(key));
		
		//HashMap is not threadsafe, hashtable is!!!
		
		Set<Map.Entry<Integer,Integer>> values2 = makMap.entrySet();
		for (Map.Entry<Integer,Integer> e : values2)
			System.out.println(e.getKey() + " : " + e.getValue());
		
		List<Integer> newList = Arrays.asList(12,23,34);
		
		List<Integer> newerList = new ArrayList<Integer>();
		
		for(int i = 0; i<6;i++) {
			newerList.add(i);
		}
		
		System.out.println(newerList);
	}
}
