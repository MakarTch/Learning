package com.cognixia.main.model;

import java.util.LinkedList;

import com.cognixia.main.dao.ItemDAO;

public class Item {

	private int itemId;
	private String itemName;
	private int cost;
	
	public Item(int itemId, String itemName, int cost) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.cost = cost;
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}
	
	public int getCost() {
		return cost;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		String space = " ".repeat(17- itemName.length());
		return itemId + "           " + itemName + space +'$'+ cost;
	}
	
	public static Item getItemById(int itemId) {
		LinkedList <Item> items = ItemDAO.retrieveItems();
		for (Item item : items) {
			if (itemId == item.getItemId()) {
				return item;
			}
		}
		return null;
	}
	
}
