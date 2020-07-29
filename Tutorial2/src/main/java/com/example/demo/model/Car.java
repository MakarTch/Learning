package com.example.demo.model;

public class Car {

	private String color;
	private String model;
	private String brand;
	
	public Car(String color, String model, String brand) {
		super();
		this.color = color;
		this.model = model;
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
