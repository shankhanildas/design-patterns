package org.nil.structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		InventorySystem inventorySystem = new InventorySystem();
		
		inventorySystem.takeOrder("virgin mojito", 1);
		inventorySystem.takeOrder("pinacolada", 2);
		inventorySystem.takeOrder("screwdriver", 3);
		inventorySystem.takeOrder("virgin mojito", 4);
		inventorySystem.takeOrder("balckdog on the roks", 5);
		inventorySystem.takeOrder("tropical storm", 6);
		inventorySystem.takeOrder("virgin mojito", 7);
		inventorySystem.takeOrder("long island ice tea", 8);
		inventorySystem.takeOrder("sunset", 9);
		inventorySystem.takeOrder("long island ice tea", 9);
		inventorySystem.takeOrder("balckdog on the roks", 10);
		inventorySystem.takeOrder("dry martini", 11);
		inventorySystem.takeOrder("blue lagoon", 12);
		inventorySystem.takeOrder("sex on the beach", 13);
		inventorySystem.takeOrder("screwdriver", 15);
		inventorySystem.takeOrder("virgin mojito", 16);
		inventorySystem.takeOrder("balckdog on the roks", 17);		
		
		inventorySystem.process();
		System.out.println(inventorySystem.report());
	}

}
