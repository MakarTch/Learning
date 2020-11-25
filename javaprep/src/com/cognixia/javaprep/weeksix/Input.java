package com.cognixia.javaprep.weeksix;

import java.io.*;
import java.util.*;

public class Input {
	
	public  static void main(String args[]) throws IOException {
//		File file = new File("input.txt");
//		Scanner scan = new Scanner(file);
//		
//		while(scan.hasNext())
//			System.out.println(scan.next());
//		scan.close();
//		
//		System.out.println("what do you want to write");
//		Scanner input = new Scanner(System.in);
//		String write = input.nextLine();
//		File fileOut = new File("output.txt");
//		FileWriter writer = new FileWriter(fileOut);
//		writer.write(write);
//		writer.close();
		
		//How to check how many times a word comes up in a file
		
		String target = "hello";
		File file = new File("input.txt");
		int counter =0;
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			if(input.next().toLowerCase().contains(target)) {
				counter++;
			}
		}
		System.out.println(counter);
		
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		String line;
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}
		
		HashMap<Integer,ArrayList<Integer>> makMap = new HashMap<>();
		
		ArrayList <Integer> hello = new ArrayList<>();
		hello.add(3);
		hello.add(9);
		System.out.println(hello.size());
	}
	
}
