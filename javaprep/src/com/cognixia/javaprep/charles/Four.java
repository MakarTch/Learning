package com.cognixia.javaprep.charles;

public class Four {
	public static void main(String[] args) {
		Cake cake = Cake.CHOCOLATE;
		System.out.println(cake);
		
	}
}

enum Cake {
	ICE_CREAM("ice cream"), VANILLA("vanilla"), CHOCOLATE("chocolate");
	
	String filling;
	
	Cake(String filling) {
		this.filling = filling;
		System.out.println(filling + " cake created");
	}

	static {
		System.out.println("First cake created");
	}
}