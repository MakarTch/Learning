package com.cognixia.javaprep.weeksix;

import java.util.*;
import java.util.List;

public class numberfive {

	public static void main(String[] args) {
		int[] makArray = {1,2,5,6,-2,-5};
		//Integer[] intArray = new Integer[makArray.length];
		List<Integer> makList = new ArrayList<>();
		for (int num : makArray)
			makList.add(num);
		for(Integer num : makList) {
			if (makList.contains(-num) && num>0) {
				System.out.println(num);
			}
		}
	}
}
