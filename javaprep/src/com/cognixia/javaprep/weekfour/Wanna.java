package com.cognixia.javaprep.weekfour;

class One{
	public void function1(){
		System.out.println("function one in One");
	}
	public static void staticFunc() {
		System.out.println("static function in One");
	}
}

class Two extends One{
	public void function1() {
		System.out.println("overriden function one in Two");
	}
}

abstract class Three{
	/*
	 * ok yeah so you cannot instantiate an abstract class
	 * the methods inside an abstract class can have bodies
	 */
	public void function2() {
		System.out.println("inside function2 in Three");
	}
	
	abstract public void function3();
}

class Four extends Three{

	@Override
	public void function3() {
		System.out.println("inside override function 3");
	}
	
}

interface Five{
	public void function4();
	
	public void function5();
	public static final int int1 = 0;
}

class Six implements Five{

	@Override
	public void function5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function4() {
		// TODO Auto-generated method stub
		
	}	
}

interface Seven extends Five{
	public static void function() {
		System.out.println("hdjfh");
	}
}
public class Wanna {

	public static void main(String args[]) {
		
		One one = new One();
		one.function1();
		One.staticFunc();
		
		Two two = new Two();
		two.function1();
		Two.staticFunc();
		
		
	}
}
