package com.cognixia.javaprep.weekfive;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

class Hoist{
	
	protected Number getLocalCode(String value, boolean isValidated) {
		return 1;
	}
	
	static {
		System.out.println("first static block");
	}
	Hoist(){
		System.out.println("in constuctor");
	}
	{
		System.out.println("inside code block");
	}
	static {
		System.out.println("second static block");
	}
}

class extended extends Hoist{

	@Override
	public Integer getLocalCode(String value, boolean isValidated) {
		return 1;
	}
	
}

public class Test3 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("beoejdkl");
		Hoist hoist = new Hoist();
		Hoist hoist2 = new Hoist();
		System.out.println(hoist.equals(hoist2));
		
		System.out.println(Stream.of("green","yellow","blue").max((s1,s2) -> s1.compareTo(s2)).filter(s -> s.endsWith("n")).orElse("yellow"));//study the fuck out of his
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add(0,"3");
		list.add(1,"4");
		list.forEach(System.out::println);///learn thies sheitt
		
		File file = new File ("output.txt");
		FileWriter output = new FileWriter(file);
		
		//output.write(new char[] {'0','1','2','3','4',});
		
		output.flush();
		

	}

}
