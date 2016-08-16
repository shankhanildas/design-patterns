package org.nil.behavioral.visitor;

import java.util.List;

public class AssemblyPartShippingVisitor implements AssemblyPartVisitor {

	double shippingAmount = 0;
	
	@Override
	public void visit(Base base) {
		System.out.println("Base is shipped @cost: " + 10000);
		shippingAmount += 10000;
	}

	@Override
	public void visit(Leg leg) {
		System.out.println("Leg is shipped @cost: " + 5000);
		shippingAmount += 5000;
	}

	@Override
	public void visit(Fitting fitting) {
		System.out.println("Fitting is shipped @cost: " + 900);
		shippingAmount += 900;
	}

	@Override
	public void visit(FurnitureAssemblyOrder order) {
		System.out.println("If 3 or more parts, discount is offered.");
		List<AssemblyPart> parts = order.getParts();
		
		if(parts.size() >=3) {
			shippingAmount -= 1000;
		}
		
		System.out.println("Shipping amount: " + shippingAmount);
	}

}
