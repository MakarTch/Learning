package com.cognixia.main.dao;

import java.util.LinkedList;

import com.cognixia.main.model.Item;

public class ItemDAO {

	public static LinkedList<Item> retrieveItems(){
		LinkedList<Item> items = new LinkedList<>();
		items.add(new Item(1, "Candle", 5)) ;
		items.add(new Item(2,"Amethyst", 7));
		items.add(new Item(3, "Bonsai Tree", 15));
		items.add(new Item(4, "Red Journal", 10));
		return items;
	}
}
