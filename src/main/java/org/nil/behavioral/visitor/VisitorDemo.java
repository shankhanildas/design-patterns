package org.nil.behavioral.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		FurnitureAssemblyOrder order = new FurnitureAssemblyOrder();
		order.addPart(new Leg());
		order.addPart(new Base());
		order.addPart(new Fitting());
		
		order.accept(new AssemblyPartShippingVisitor());
	}
}
