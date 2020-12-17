package com.cognixia.javaprep.charles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class PerfectDay {
	public static void main(String[] args) {
		
		System.out.println("now the skyyy could be blueee i dont minddddddd, without you its a waste of time");
		
		List<Integer> nums = new ArrayList<>();
		nums.add(25);
		nums.add(34);
		nums.add(62);
		nums.add(1);
		nums.add(6);
		nums.add(256);
		nums.add(535);
		nums.add(74);
		
		Stream<Integer> numStream = nums.stream();
		
//		List<Integer> result =
//				numStream.filter(num -> num>49).collect(Collector.to);
		
		
		
	}
}
