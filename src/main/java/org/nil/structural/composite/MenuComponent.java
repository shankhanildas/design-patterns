package org.nil.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name;
	String url;
	
	List<MenuComponent> menuComponents = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	String print (MenuComponent component) {
		StringBuilder sb = new StringBuilder(name);
		sb.append(": ").append(url).append("\n");
		
		return sb.toString();
	}
}
