package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String name;
	private String tech;
	
	public int getAid() {
		return aid;
	}
	public String getName() {
		return name;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [Alien Id=" + aid + ", Name=" + name + ", Tech=" + tech + "]";
	}
	public String test() {
		return "<h1>Testing this stuff</h1>";
	}
	public static String staticMethod() {
		return "returning from static method in Alien";
	}
	
}
