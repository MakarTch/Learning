package com.cognixia.javaprep.weekthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] numsArray= {3,5,-4,8,11,1,-1,6};
		int target = 10;
		
		int[] solution = (twoSumMap(numsArray, target));
		for (int i: solution)
			System.out.println(i);

		
	}
	
	public static int[] twoSumMap(int[] numsArray, int target){
		HashMap<Integer,Integer> numMap = new HashMap<>();
		for (int i = 0; i < numsArray.length; i++) {
			if(numMap.containsKey(numsArray[i])) {
				return new int[] {i, numMap.get(numsArray[i])};
			} 
			numMap.put(target - numsArray[i], i);
		}
		return null;
	}
	
	public static int[] twoSumMap2(int[] numsArray, int target){
		HashSet<Integer> numSet = new HashSet<>();
		for (int i = 0; i < numsArray.length; i++) {
			if(numSet.contains(numsArray[i])) {
				return new int[] {numsArray[i],target - numsArray[i]};
			} else {
				numSet.add(target - numsArray[i]);
			}
		}
		return null;
	}
	
	
//	public static ArrayList<Integer> twoSum(int[] numsArray, int target) {
//		ArrayList <Integer> ints = new ArrayList<Integer>();
//		int counter = 0;
//		for (int i = 0; i<numsArray.length; i++) {
//			for (int j=counter; j<numsArray.length; j++) {
//				if(i!=j && (numsArray[i] + numsArray[j])==target) {
//					ints.add(numsArray[i]);
//					ints.add(numsArray[j]);
//				}
//			}
//			counter++;
//		}
//		return ints;
//	}
	

}