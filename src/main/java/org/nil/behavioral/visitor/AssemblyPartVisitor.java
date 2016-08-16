package org.nil.behavioral.visitor;

public interface AssemblyPartVisitor {
	void visit(Base base);
	void visit(Leg leg);
	void visit(Fitting fitting);
	void visit(FurnitureAssemblyOrder order);
}
