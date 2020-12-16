package com.cognixia.javaprep.charles;

import java.io.*;

public class Files {
	public static void main(String[] args) {
		File file = new File("temp.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
