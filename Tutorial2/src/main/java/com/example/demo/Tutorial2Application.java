package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Alien;

@SpringBootApplication
public class Tutorial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial2Application.class, args);
		//System.out.println(Alien.staticMethod());
	}

}
