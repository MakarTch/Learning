package com.cognixia.main.service;

import java.util.HashMap;
import java.util.Scanner;

import com.cognixia.main.dao.ItemDAO;
import com.cognixia.main.model.User;

public class LogInService {

	public static User logIn(HashMap<String, String> users, Scanner input) {
		boolean verified = false;
		while (!verified) {
			System.out.println("---------------------------");
			System.out.println("What is your username?");
			String username = input.next();
			System.out.println("What is your password?");
			String password = input.next();
			if (logInVerify(users, username, password)) {
				verified = true;
				return new User(username, password, ItemDAO.retrieveItems());
			}
		}
		return null;
	}

	public static boolean logInVerify(HashMap<String, String> users, String username, String password) {
		boolean verify = false;
		try {
			verify = users.get(username).equals(password) ? true : false;
			if (users.containsKey(username) && !users.containsValue(password)) {
				System.out.println("Wrong password! Please try logging in again");
			}
		} catch (Exception e) {
			System.out.println("Wrong username! Please try logging in again:");
		}
		return verify;
	}
}
