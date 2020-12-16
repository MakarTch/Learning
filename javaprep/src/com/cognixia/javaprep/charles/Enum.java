package com.cognixia.javaprep.charles;

enum EnumTest{
	
	N2  ("Nitrogen", 28.012, 78.084), 
	O2  ("Oxygen", 31.998, 20.946), 
	AR  ("Argon", 39.792, 0.9340), 
	C02 ("Carbon Dioxide", 44.01, 0.04133);

	String name;
	double weight;
	double percent;

	EnumTest(String name, double weight, double percent) {
		this.name = name;
		this.weight = weight;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPercent() {
		return percent;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
}

class StudentChoice {
	
	String name;
	EnumTest choice;
	
	public StudentChoice(String name, EnumTest choice) {
		this.name = name;
		this.choice = choice;
	}
}

public class Enum {

	public static void main(String[] args) {
		StudentChoice makar = new StudentChoice("Makar", EnumTest.AR);
		System.out.println(makar.choice.name);
		makar.choice.setName("notA2");
		System.out.println(makar.choice.name);
	}

}
