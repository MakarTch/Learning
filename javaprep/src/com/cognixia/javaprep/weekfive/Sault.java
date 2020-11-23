package com.cognixia.javaprep.weekfive;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Sault {

	public static void main(String[] args) throws IOException {
		System.out.println("What do you wanna put inside of that text file");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		FileOutputStream out = new FileOutputStream("output.txt");
		for (char c : name.toCharArray()) {
			out.write((int)c);
			System.out.println("ascii value: " + (int)c);
		}
			
	}
}
