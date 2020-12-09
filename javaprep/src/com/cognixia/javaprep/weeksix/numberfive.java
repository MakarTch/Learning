package com.cognixia.javaprep.weeksix;

import java.util.Arrays;
import java.util.List;

public class numberfive {

	public static void main(String[] args) {
		int[] makArray = {1,2,5,6,-2,-5};
		Integer[] intArray = new Integer[makArray.length];
		for (int i=0; i<makArray.length;i++) 
			intArray[i] = makArray[i];
		List<Integer> makList = Arrays.asList(intArray);
		for(Integer num : makList) {
			if (makList.contains(-num) && num>0) {
				System.out.println(num);
			}
			
		}
	}

}
