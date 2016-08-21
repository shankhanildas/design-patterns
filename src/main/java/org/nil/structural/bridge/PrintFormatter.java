package org.nil.structural.bridge;

import java.util.Map;

public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, Map<String, String> info) {
		StringBuilder sb = new StringBuilder();
		sb.append(header).append("\n");
		for(String infoKey : info.keySet()){
			sb.append(infoKey).append(": ").append(info.get(infoKey)).append("\n");
		}
		
		return sb.toString();
	}

}
