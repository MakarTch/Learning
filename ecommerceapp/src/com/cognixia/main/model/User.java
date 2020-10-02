package com.cognixia.main.model;

import java.util.HashMap;
import java.util.LinkedList;

import com.cognixia.main.dao.ItemDAO;

public class User {
	
	private String userName;
	private String password;
	private HashMap <Integer,Integer> itemsPurchased;
	
	public User(String userName, String password, LinkedList<Item> items) {
		super();
		this.userName = userName;
		this.password = password;
		this.itemsPurchased = emptyItems(items);
	}
	
	private HashMap<Integer,Integer> emptyItems(LinkedList<Item> items){
		HashMap<Integer,Integer> itemsPurchased = new HashMap<>();
		for (Item item : items) {
			itemsPurchased.put(item.getItemId(), 0);
		}
		return itemsPurchased;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public HashMap<Integer, Integer> getItemsPurchased() {
		return itemsPurchased;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setItemsPurchased(HashMap<Integer, Integer> itemsPurchased) {
		this.itemsPurchased = itemsPurchased;
	}

	
	public String itemsToString(User user) {
		String displayText ="Item ID      Item Name       Amount Bought\n";
		HashMap<Integer,Integer> itemsPurchased = user.getItemsPurchased();
		LinkedList <Item> items = ItemDAO.retrieveItems();
		for (Integer itemId : itemsPurchased.keySet()) {
			Item item = Item.getItemById(itemId);
			String space = " ".repeat(17- item.getItemName().length());
			displayText +=(itemId + "            " + item.getItemName() + space + itemsPurchased.get(itemId) + "\n" );
		}
		return displayText;
		
	}
	
	
}
