package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city_name;
	private int population;
	
	public City() {
	}

	public City(int id, String city_name, int population) {
		super();
		this.id = id;
		this.city_name = city_name;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public String getCity_name() {
		return city_name;
	}

	public int getPopulation() {
		return population;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", city_name=" + city_name + ", population=" + population + "]";
	}
	
	
}
