package org.nil.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public MenuComponent add(MenuComponent component){
		menuComponents.add(component);
		return component;
	}
	
	public MenuComponent remove(MenuComponent component){
		menuComponents.remove(component);
		return component;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(print(this));
		
		Iterator<MenuComponent> itr = menuComponents.iterator();
		
		while (itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			sb.append(menuComponent.toString());			
		}
		
		return sb.toString();
	}

}
