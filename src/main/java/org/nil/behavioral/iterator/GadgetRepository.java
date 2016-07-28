package org.nil.behavioral.iterator;

import java.util.Iterator;

public class GadgetRepository implements Iterable<String> {
	private String[] gadgets;
	private int index;
	
	public GadgetRepository() {
		this.gadgets = new String[10];
		this.index = 0;
	}
	
	public void addGadget(String gadget){
		if(index == gadgets.length){
			String[] largerGadgets = new String[gadgets.length + 5];
			System.arraycopy(gadgets, 0, largerGadgets, 0, gadgets.length);
			gadgets = largerGadgets;
			largerGadgets = null;
		}
		
		gadgets[index] = gadget;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {
			private int curIndex = 0;
			
			@Override
			public boolean hasNext() {
				return curIndex < gadgets.length && gadgets[curIndex] != null;
			}

			@Override
			public String next() {
				return gadgets[curIndex++];
			}
			
			@Override
			public void remove() {
				Iterator.super.remove();
			}			
		};
		
		return it;
	}
	
}
