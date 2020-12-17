package com.cognixia.javaprep.charles;

import java.util.*;

abstract class yo{
	
	int var = 3;
	
	public void method() throws Exception {
		System.out.println("yo");
	}
}
class yoyo extends yo{
	
	@Override
	public void method() throws Exception {
		// TODO Auto-generated method stub
		super.method();
	}

}

abstract class yoyoyo extends yoyo{
	
	public void method() throws Exception {
		super.method();
	}
}

abstract class AbstractTest {
	public static void methodYo() {
		System.out.println("do somet ing");
	}
	public void methodTwo() {
		System.out.println("dkhfj");
	}
	public int helloYo = 3;
}

interface Uno {
	void methodOne();
	default void methodThree() {
		System.out.println("yoyo");
	}
}

interface Dos extends Uno {
	void methodTwo();
}


public class Three extends yo {

	public static void main(String[] args) {
		
		Three three = new Three();
		System.out.println(three.var);
	}
}
