package org.nil.behavioral.template;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("doing checkout");
	}

	@Override
	public void doPayment() {
		System.out.println("Making payment");
	}

	@Override
	public void doReceipt() {
		System.out.println("Emailed receipt");
	}

	@Override
	public void doDelivery() {
		System.out.println("item shipped");
	}

}
