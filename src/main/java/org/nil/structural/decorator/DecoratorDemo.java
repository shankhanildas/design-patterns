package org.nil.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Pizza pizza = new ExtraToppingDecorator(new NonVegDecorator(new SimplePizza()));
		System.out.println(pizza.make());
	}

}
