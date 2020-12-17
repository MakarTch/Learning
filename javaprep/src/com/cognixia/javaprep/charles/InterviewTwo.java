package com.cognixia.javaprep.charles;

import java.io.*;

public class InterviewTwo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("input.txt");
			int character;
			StringBuilder sb = new StringBuilder();
			while((character = fin.read())!= -1) {
				sb.append((char) character);
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//How to read a file
//		File file = new File("input.txt");
//		StringBuilder stringBuilder = new StringBuilder();
//		FileReader fileReader = null;
//		BufferedReader bufferedReader = null;
//		try {
//			fileReader = new FileReader(file);
//			bufferedReader = new BufferedReader(fileReader);
//			String line = "";
//			while ((line = bufferedReader.readLine()) != null) {
//				stringBuilder.append(line + "\n");
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fileReader.close();
//				bufferedReader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println(stringBuilder);
	}
}
