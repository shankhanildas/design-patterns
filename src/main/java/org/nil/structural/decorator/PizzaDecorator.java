package org.nil.structural.decorator;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza customPizza;

	public PizzaDecorator(Pizza customPizza) {
		super();
		this.customPizza = customPizza;
	}
	
	@Override
	public String make() {
		return customPizza.make();
	}	
}
