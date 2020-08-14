package com.cognixia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import sun.security.krb5.internal.Ticket;

@SpringBootApplication
//@ComponentScan(basePackages={"com.cognixia.application.controller","com.cognixia.application.model","com.cognixia.application.dao"})
public class SpringMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}

}
