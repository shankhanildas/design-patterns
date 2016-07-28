package org.nil.behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		GadgetRepository repo = new GadgetRepository();
		
		repo.addGadget("chromecast");
		repo.addGadget("wirelessSpeaker");
		repo.addGadget("tab");
		repo.addGadget("mobile");
		
		Iterator<String> gadgetIterator = repo.iterator();
		while(gadgetIterator.hasNext()){
			System.out.println(gadgetIterator.next());
		}
	}
}
