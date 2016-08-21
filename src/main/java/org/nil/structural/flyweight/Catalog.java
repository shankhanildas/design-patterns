package org.nil.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<String, Item> items = new HashMap<>();
	
	public Item lookup(String itemName){
		Item item = items.putIfAbsent(itemName, new Item(itemName));
		return item;
	}
	
	public int totalItemsMade(){
		return items.size();
	}
}
