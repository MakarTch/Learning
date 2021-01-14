package com.cognixia.javaprep.weekkeight;

public class DebugRunner {
	
	public static void main(String[] args) {
		
		int x =0;
		
		for (int i = 0;i < 10; i++) {
			if (i%2 >0) {
				System.out.println("x is even");
			}
			x+=3;
			System.out.println(3);
			function();
		}
	}
	
	static void function() {
		System.out.println("in function");
	}
}
