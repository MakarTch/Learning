package com.cognixia.javaprep.weekfour;

interface interfaceOne{
	public static final int int1 = 15;
	public void function1();
	public static void function4() {
		System.out.println("function four");
	}
	default void function5() {
		
	}
}

interface interfaceTwo{
	public void function2();
}

class aClassOne implements interfaceTwo, interfaceOne{

	@Override
	public void function1() {
		System.out.println("function one");
	}

	@Override
	public void function2() {
		System.out.println("function two");
	}
	
	int int2 = int1;
}

abstract class aClassTwo implements interfaceOne,interfaceTwo{
	public void function3() {
		System.out.println("function 3");
	}
}

class ClassTwo extends aClassTwo{

	@Override
	public void function2() {
		System.out.println("class that extends from an abstract class that implements an interface");
	}

	@Override
	public void function1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Know {

	public static void main(String[] args) {
		aClassOne one = new aClassOne();
		System.out.println(interfaceOne.int1);
		one.function1();
		System.out.println(one.int2);
		
		ClassTwo two = new ClassTwo();
		two.function3();
	}

}
