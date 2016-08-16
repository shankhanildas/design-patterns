package org.nil.behavioral.visitor;

public class Leg implements AssemblyPart {
	@Override
	public void accept(AssemblyPartVisitor visitor) {
		visitor.visit(this);
	}
}
