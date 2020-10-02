package com.cognixia.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.cognixia.main.model.User;
import com.cognixia.main.service.LogInService;
import com.cognixia.main.service.MenuService;
import com.cognixia.main.service.RegisterService;


public class AppRunner {

	public static void main(String[] args) {
		/*
		 * Ok so first thing to do is the register account page, input your username, password, confirm password
		 * 			- put regex on the password as well as state it in the description
		 * 			- make sure the passwords match
		 * 			- create a user class
		 * 
		 * After that you go straight to the log in page, then input your username and password
		 * 			- pretty simple, just make sure they match with what I just inputted. 
		 */
		
		
		//Open our scanner
		Scanner input = new Scanner(System.in);
		
		//Register user and add their info to a HashMap
		HashMap <String,String> users = RegisterService.register(input);
		
		//Log in and create user object for the user 
		User user = LogInService.logIn(users, input);
		
		//Running the app with the user 
		MenuService.mainMenu(user,input);
		
		
		input.close();
		

		
		
		
	}

}
