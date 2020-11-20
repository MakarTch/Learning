package com.cognixia.javaprep.weekfive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class One {
	
	public static int counter = 0;
	int pri = 17;
	private int yo = 12;
	{counter++;}

	One(){
		System.out.println("Total objects: " + counter);
	}
	
	
}
class Two extends One{
	public int hello = pri + 3;
}


public class StaticVar {

	public static void main(String[] args) throws IOException {
		
		
		Two one = new Two();
		System.out.println(one.yo);
		
		
//		One two  = new One();
//		
//		int counter = 0;
//		while(counter <5) {
//			System.out.println(counter);
//			counter++;
//		}
//		System.out.println("after while");
//		
//		do {
//			System.out.println(counter);
//			counter ++;
//		} while(counter<10);
//		
//		System.out.println("after do while");
//		
//		for(int i = counter ; i <15;i ++) {
//			System.out.println(i);
//		}
			
		
		char[] charArray = {'a','b','c'};
		System.out.println(charArray);
		String str = new String(charArray);
		System.out.println(str);
		String yo = new String("hello");
		System.out.println(yo);
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out =  new FileOutputStream("output.txt");
			int c = 0;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			in.close();
			out.close();
		}
	}

}
