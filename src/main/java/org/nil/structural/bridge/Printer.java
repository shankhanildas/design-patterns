package org.nil.structural.bridge;

import java.util.Map;

public abstract class Printer {
	public String print(Formatter formatter){
		return formatter.format(getHeader(), getInfo());
	}

	abstract String getHeader();

	abstract Map<String, String> getInfo();
}
