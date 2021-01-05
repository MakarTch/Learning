package com.cognixia.javaprep.charles;


@FunctionalInterface
interface Calculate{
	
	float calc(int x, int y);
}
public class LambdasFuncInterface {

	public static void main(String[] args) {
		
		Calculate add = (x,y) -> x+y;//Java is treating add like an object, but its just a function
		Calculate sub = (x,y) -> x-y;
		Calculate div = (x,y) ->{
			if (y==0) return 0;
			return x/y;
		};
		Calculate mul = (x,y) -> x*y;
		
		int x = 10;
		int y = 3;
		
		float sum = add.calc(x, y);
		float dif = sub.calc(x, y);
		float divi = div.calc(x,y);
		float mult = mul.calc(x, y);
		
		System.out.println(sum);
		System.out.println(dif);
		System.out.println(divi);
		System.out.println(mult);
		
	}
}
