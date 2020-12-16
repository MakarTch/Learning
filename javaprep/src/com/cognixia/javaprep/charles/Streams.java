package com.cognixia.javaprep.charles;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
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
		
		List<Integer> streamList = 
		numStream.filter(number -> number > 40)
				.map(number -> number/2)
				.sorted()
				.collect(Collectors.toList());
		
		//this prints out the list of numbers that were greater than 40, then subtracted by 4
		System.out.println(streamList);
		
		numStream = nums.stream();
		
		Optional<Integer> num = numStream.filter(number -> number >400).findFirst();
		System.out.println(num);
		
		numStream = nums.stream();
		numStream.forEach(number -> System.out.print(number + " "));
		System.out.println("\n");
		numStream = nums.stream();
		//numStream.forEach(System.out::print);
		
		numStream = nums.stream();
		int sum = numStream.reduce(0, (total,next) -> total + next);
		System.out.println(sum);
	}
}
