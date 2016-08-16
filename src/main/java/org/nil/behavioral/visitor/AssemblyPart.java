package org.nil.behavioral.visitor;

public interface AssemblyPart {
	public void accept(AssemblyPartVisitor visitor);
}
