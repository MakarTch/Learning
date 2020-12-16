package com.cognixia.javaprep.charles;

import java.io.*;

public class WritingFiles {
	public static void main(String[] args) {
		
		File file = new File("output.txt");
		
		try(FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				PrintWriter printWriter = new PrintWriter(bufferedWriter)){
			
			bufferedWriter.append("Writing to output.txt\n");
			printWriter.println("Print writer writing to a file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
