package com.cognixia.main.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.cognixia.main.dao.ItemDAO;
import com.cognixia.main.model.Item;
import com.cognixia.main.model.User;

public class MenuService {
	
	public static void mainMenu(User user, Scanner input) {
		boolean validChoice = false;
		String menuChoice = "";
		while (!validChoice) {
			System.out.println("\n\n--------------------------\nHello " + user.getUserName() + "\nPlease enter the number of what you would like to do:");
			System.out.println("1: Make a purchase \n2: Make a return \n3: Log out");
			menuChoice = input.next();
			if (choiceVerify(menuChoice, 1,3)) {
				validChoice = true;
			}
		}
		int intMenuChoice = Integer.parseInt(menuChoice);
		switch (intMenuChoice) {
		case 1: purchaseMenu(user,input);
			break;
		case 2: returnMenu(user,input);
			break;
		case 3: System.out.println("Logged out, thanks for shopping with us!");
			System.exit(0);
		}
			
			
		}

	public static void purchaseMenu(User user, Scanner input) {
		boolean validChoice = false;
		while (!validChoice) {
			System.out.println("\n\n---------------------------");
			System.out.println("Item ID     Item Name        Item Cost");
			LinkedList <Item> items = ItemDAO.retrieveItems();
			for (Item item:items) {
				System.out.println(item.toString());
			}
			System.out.println("Please enter the Item Id of what you would like to purchase");
			System.out.println("--Press 5 to go back to the main menu--");
			String menuChoice = input.next(); 
			if (choiceVerify(menuChoice,1,5)) {
				validChoice = true;
				int intMenuChoice = Integer.parseInt(menuChoice);
				if (intMenuChoice != 5) {
					user.getItemsPurchased().put(intMenuChoice, user.getItemsPurchased().get(intMenuChoice)+1);
					System.out.println("\n\nYou just purchased one " + Item.getItemById(intMenuChoice).getItemName() + "!");
					purchaseMenu(user,input);
				}
				mainMenu(user, input);
			}
		}
	}
	
	public static void returnMenu(User user, Scanner input) {
		boolean validChoice = false;
		while (!validChoice) {
			System.out.println("\n\n---------------------------");
			System.out.println(user.itemsToString(user));
			System.out.println("Please enter the Item Id of what you would like to return");
			System.out.println("--Press 5 to go back to the main menu--");
			String menuChoice = input.next();
			if(choiceVerify(menuChoice,1,5)) {
				int intMenuChoice=Integer.parseInt(menuChoice);
				if (intMenuChoice != 5) {
					if(user.getItemsPurchased().get(intMenuChoice)>0) {
						user.getItemsPurchased().put(intMenuChoice, user.getItemsPurchased().get(intMenuChoice)-1);
						System.out.println("\n\nYou just returned one " + Item.getItemById(intMenuChoice).getItemName() + "!");
						returnMenu(user,input);
					}else {
						System.out.println("You can't return any of what you don't have silly!");
					}
					returnMenu(user,input);
				}
				mainMenu(user,input);
			}
		}
	}
	
	public static boolean choiceVerify(String menuChoice, int low, int high) {
		try {
			int intMenuChoice = Integer.parseInt(menuChoice);
			if ((intMenuChoice < low) || (intMenuChoice > high)) {
				System.out.println("Please enter an option between " + low + " and "+ high+"!");
				return false;
			}
		} catch (Exception E){
			System.out.println("Please enter an integer!");
			return false;
		}
		return true;
		
	}
}
