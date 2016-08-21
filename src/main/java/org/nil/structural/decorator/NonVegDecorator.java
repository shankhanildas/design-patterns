package org.nil.structural.decorator;

public class NonVegDecorator extends PizzaDecorator {
	
	public NonVegDecorator(Pizza customPizza) {
		super(customPizza);
	}
	
	@Override
	public String make() {
		return customPizza.make() + addMeat();
	}

	private String addMeat() {
		return " + chicken";
	}
}
