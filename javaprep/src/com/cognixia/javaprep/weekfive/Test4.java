package com.cognixia.javaprep.weekfive;

import java.util.Locale;

class Outer{
	
	private int hello = 3;
	
	class Inner{
		public int yo =3;
		public void inner() {
			System.out.println("inside inner");
			System.out.println(hello);
		}
	}
}

public class Test4 {

	public static void main(String[] args) {
		//Locale locale = new Locale(Locale.ENGLISH, Locale.US);
		Integer x = 3;
		Integer y = null;
		try {
			System.out.println(Integer.compareUnsigned(0, y));
		} catch (Exception e) {
			System.out.println(e.getClass().toString());
		}
		System.out.println(y.compareTo(null)==0);
	}

}
