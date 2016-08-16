package org.nil.behavioral.visitor;

public class Fitting implements AssemblyPart {
	@Override
	public void accept(AssemblyPartVisitor visitor) {
		visitor.visit(this);
	}
}
