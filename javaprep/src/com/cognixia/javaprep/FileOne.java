package com.cognixia.javaprep;

import com.cognixia.javaprep.OuterClass.FirstLevel;

class Outer{
	int a;
	public void show() {
		System.out.println("in show");
	}
	
	class Inner {
		int b;
		public void display() {
			System.out.println("in display");
		}
	}
}
class A{
	static void foo() {
		System.out.println("foo in class A");
	}
}

class B{
	static void bFunction() {
		A.foo();
	}
}


public class FileOne {

	public static void main(String[] args) {
		
		//calling methods in other classes
		A.foo();
		B.bFunction();
		
		System.out.println("---------");
		
		//hashcode and equals
		String a = "hello";
		String b = "hello";
		String c = "yo";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println("----------");
		Outer object = new Outer();
		Outer object1 = new Outer();
		System.out.println(object.equals(object1));
		System.out.println(object.hashCode());
		System.out.println(object1.hashCode());

		
		System.out.println("------------");
	
		//using inner class thats above
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
		System.out.println("---------");
		//anonymous class
		Outer obj2 = new Outer() {
			public void show() {
				System.out.println("inside anon class");
			}
		};
		obj2.show();
		
		
		System.out.println("--------");
		//finally keyword
//		try {
//			int a = 10, b = 30;
//			int c = b / a;
//			System.out.println(c);
//		} catch (ArithmeticException ae) {
//			System.out.println(ae);
//		} finally {
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("-------------");
//		
//		//using inner class in same package
//		OuterClass st = new OuterClass();
//        OuterClass.FirstLevel fl = st.new FirstLevel();
//        fl.methodInFirstLevel(23);
		
		
		
		
		
	}
}
