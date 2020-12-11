package com.cognixia.javaprep.charles;


class yo{
	
	public void method() {
		System.out.println("yo");
	}
}
class yoyo extends yo{
	
	public void method() {
		System.out.println("yoyo");
	}
}

abstract class yoyoyo extends yoyo{
	
	public void method() {
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


public class Three {

	public static void main(String[] args) {

	}
}
