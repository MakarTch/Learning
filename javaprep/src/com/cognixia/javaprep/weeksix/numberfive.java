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
		
		ArrayList<Integer> yoyo = new ArrayList<>();
		yoyo.add(1);
		yoyo.add(89);
		yoyo.add(34);
		yoyo.add(939);
		yoyo.add(12);
		yoyo.add(-4);

		//yoyo.sort(null);
		System.out.println(yoyo);
	}
}
