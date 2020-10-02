package com.cognixia.main.service;

import java.util.HashMap;
import java.util.Scanner;

public class RegisterService {
	
	public static HashMap<String,String> register(Scanner input) {
		HashMap<String,String> users = new HashMap<>();
		System.out.println("Please enter a username");
		String userName = input.next();
		System.out.println("Please enter a password - Must be 8 characters or more with at least \none number, lowercase letter, uppercase letter, and special character");
		String password = input.next();
		if(RegisterService.passwordVerify(password)) {
			users.put(userName, password);
			System.out.println("Registration succesful, please proceed to log in:");
		} else {
			System.out.println("Your password didn't meet the requirements, please try again!\n---------------------------");
			users = register(input);
		}
		return users;
	}
	
	public static boolean passwordVerify(String password) {
	    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}";
		return password.matches(pattern);
	}

	
}
