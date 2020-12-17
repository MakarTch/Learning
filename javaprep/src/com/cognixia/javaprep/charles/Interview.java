package com.cognixia.javaprep.charles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Interview {

	public static void main (String[] args) {
		
		
		
		String str = "Reverse Me";
		
		char[] strArray = str.toCharArray();
		String reversed = "";
		for (int i = strArray.length-1;i>=0;i--) {
			reversed += strArray[i];
		}
		System.out.println(reversed);
		
		StringBuilder stringBuilder2 = new StringBuilder(str);
		stringBuilder2.reverse();
		System.out.println(stringBuilder2);
		
		
	}	
}
