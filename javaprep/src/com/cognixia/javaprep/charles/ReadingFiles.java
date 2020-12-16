package com.cognixia.javaprep.charles;

import java.io.*;

public class ReadingFiles {

	public static void main(String[] args) {
		File file = new File("input.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			StringBuilder stringBuilder = new StringBuilder();
			
			//Line by line
//			String line;
//			while((line = bufferedReader.readLine())!=null) {
//				stringBuilder.append(line + "\n");
//			}
			
			//Character by Character
//			int letter;
//			while((letter = bufferedReader.read())!=-1) {
//				stringBuilder.append((char) letter);
//			}
			
			System.out.println(stringBuilder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
