package com.cognixia.javaprep.weekfive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Bofa {

	public static void main(String[] args) throws IOException {
		//make a program that reads how many times a certain word showed up in a text file
		FileInputStream in = new FileInputStream("input.txt");
		
		String target = "hello";
		
		int c =0;
		String addString = "";
		List<String> stringList = new ArrayList<>();
		while ( (c=in.read())!= -1 ) {
			if((c<=90 && c>=65) | (c<=122 && c>=97)) {
				addString += (char)c;
			} else {
				stringList.add(addString.toLowerCase());
				addString ="";
			}
		}
		int counter = 0;
		for (String str : stringList) {
			if(str.equals(target))
				counter++;
		}
		//System.out.println(counter);
		//65-90, 97-122
		//==============================================
		
		//if text contains a 
		File file = new File("input.txt");
		Scanner scanner = new Scanner(file);
		counter = 0;
		while(scanner.hasNext()) {
			if(scanner.next().toLowerCase().contains(target))
				counter++;
		}
		System.out.println(counter);
		
		FileWriter writer = new FileWriter("output.txt");
		writer.write("yo");
		writer.close();
		
		System.out.println("what do you want to write");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		FileWriter write = new FileWriter("output.txt");
		write.write(input);
		write.close();
		System.out.println("finished");
		
		
		
		
		
		
		
		
	}

}
