package org.nil.structural.decorator;

public class ExtraToppingDecorator extends PizzaDecorator {
	public ExtraToppingDecorator(Pizza customPizza) {
		super(customPizza);
	}
	
	@Override
	public String make() {
		return customPizza.make() + addExtraTopping();
	}

	private String addExtraTopping() {
		return " + extra topping";
	}
}
