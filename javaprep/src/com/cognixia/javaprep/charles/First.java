package com.cognixia.javaprep.charles;

import java.util.Arrays;
import java.util.List;

class Box<T>{
	
}
public class First {

	public static void main(String args[]) {
		Integer[] numArray1 = {1,3,5,0};
		Integer[] numArray2 = {0,5,3,1};
		List<Integer> numList1 = Arrays.asList(numArray1);
		List<Integer> numList2 = Arrays.asList(numArray2);
		if (numList1.size()!=numList2.size())
			System.out.println("no good");
		int counter = 0;
		for (Integer num : numList1) {
			if (numList2.contains(num))
				counter++;
		}
		System.out.println(counter);
		
		String test = "hello";
		test =  test + test + "yo";
		System.out.println(test);
		
		Integer num = 3;
		System.out.println(num);
	}
}
