package com.cognixia.javaprep.weekfour;

class Demo{
	
	public static void function(int int1, String string1) {
		System.out.println("inside demo function");
	}
	public void killer() {
		System.out.println("in demo killer");
	}
	private void same() {
		System.out.println("dont inherit me");
	}
	public Demo returnClass() {
		return new Demo();
	}
	public String toString() {
		return "Demo toString";
	}
}

class Demo2 extends Demo{
	
	public static void function(String string1, int int1) {
		System.out.println("inside demo2 function");
	}
	public Demo2 returnClass() {
		return new Demo2();
	}
	
	public String toString() {
		return "Demo2 toString";
	}
	
	public String superToString() {
		return super.toString();
	}
}
public class Woken extends Demo{
	
	public static void function() {
		System.out.println("inside Woken function");
	}
	
	public void killer() {
		System.out.println("in Woken killer");
	}
	
	
	public static void main(String[] args) {
//		function();
		Demo.function(1, "");
		
//		Demo object = new Demo();
//		object.killer();
//		System.out.println(object.returnClass().toString());
//		
		Demo2 object3 = new Demo2();
		System.out.println(object3.returnClass());
		System.out.println(object3.superToString());
//		
//		Woken object2 = new Woken();
//		object2.killer();
		
//		Demo2.function(1,"");
//		Demo2.function("", 33);
		
	}

}
