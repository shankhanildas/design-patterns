package org.nil.behavioral.interpreter;

import java.util.stream.Stream;

public class TerminalExpression implements Expression {

	private String data;
	
	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean interpret(String str) {
		return Stream.of(str.split(" ")).anyMatch(s -> s.equals(data));			
	}	
}
