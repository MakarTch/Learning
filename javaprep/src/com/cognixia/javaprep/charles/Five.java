package com.cognixia.javaprep.charles;

interface Interfauce{
	public void methodOne();
	public int methodTwo();
}

class Tulip{
	
	private String color;
	
	Tulip(String color){
		this.color= color;
	}
	
}
public class Five {
	public static void main(String[] args) {
		
		Tulip tulip = new Tulip("red");
		System.out.println(tulip);
		
		
		Interfauce testThis = new Interfauce() {
			
			@Override
			public int methodTwo() {
				return 15;
			}
			
			@Override
			public void methodOne() {
				System.out.println("inside method One");
				
			}
		};
		
		testThis.methodOne();
		System.out.println(testThis.methodTwo());
	}
	
	
}
