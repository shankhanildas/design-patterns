package org.nil.behavioral.visitor;

public class Base implements AssemblyPart {

	@Override
	public void accept(AssemblyPartVisitor visitor) {
		visitor.visit(this);
	}

}
