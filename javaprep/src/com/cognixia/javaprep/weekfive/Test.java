package com.cognixia.javaprep.weekfive;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

enum Element{
	HELIUM("He","Gas"),
	MAGNESIUM("Mg","Solid");
	private String symbol;
	private String nature;
	private Element(String asymbol,String anature) {
		symbol = asymbol;
		nature = anature;
	}
	public String symbol() {
		return symbol;
	}
	public String nature() {
		return nature;
	}
}

class Invoice{
	public static String formatId(String oldId) {
		return oldId = "invoice";
	}
}
class SalesInvoice extends Invoice{
	public static String formatId(String oldId) {
		return oldId = "salesinvoice";
	}
}

class Namer{
	final private String firstName, lastName;

	public Namer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
}


class A{
	static int total = 10;
	public void call() {
		int total=5;
		System.out.println(this.total);
	}
}

class Parent{
	protected static int count =0;
	public Parent() {
		count++;
	}
	static int getCount() {
		return count;
	}
}

public class Test extends Parent{

	public Test() {
		count++;
	}
	public static void main(String args[]) {
		
		Optional<Object> o = Optional.of(new Parent());
		System.out.println(o.get().toString());
		
		
		System.out.println(getCount());
		Test obj = new Test();
		System.out.println(getCount());
		System.out.println("--------------");
		A a1 = new A();
		a1.call();
		
		Invoice invoice = new Invoice();
		
		
		
		//System.out.println("%s,%s,%s",Element[1]);
		//System.out.println(Element.HELIUM.toString());
		LocalDate localDate = LocalDate.of(2015, 4, 4);
//		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
//		System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
//		System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
		
		int a=9,b=2;
		float f;
		f=a/b;
//		System.out.println(f);
		
		Consumer<Namer> printit = e -> System.out.println(e.getFirstName() + " " + e.getLastName());
		List<Namer> names = new ArrayList<Namer>(Arrays.asList(new Namer("a","a"), new Namer("b","b"), new Namer("c","c"), new Namer("d","d"), new Namer("e","e") ));
		names.removeIf(e -> e.getFirstName().equals("c"));
		names.forEach(printit);
		
		byte[] c1 = {10,20,30,40,50,};
		byte[] c2 = {60,70,80,90};
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
		b2.write(100);
		System.out.println(b2.size());
		b2.write(c1,0,c2.length);
		System.out.println(b2.size());
		List<String> list = Arrays.asList("dog","over","good");
		list.stream().reduce((x1,x2) -> x1.length()==3 ? x1:x2).ifPresent(System.out::println);//this prints dog...
		System.out.println(list.stream().reduce(new String(), (x1,x2) -> {if (x1.equals("dog"))return x1;return x2;}));
		list.stream().reduce((x1,x2) -> x1.length()>x2.length()?x1:x2).ifPresent(System.out::println);//prints good
		
		Runnable r = () -> System.out.println("HI");
		new Thread(r).start();
		
	}
}
