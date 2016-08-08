package org.nil.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard amex = new CreditCard(new AmexStrategy());
		amex.setNumber("378282246310005");
		amex.setCvv("979");
		amex.setDate("07/2015");
		
		CreditCard visa = new CreditCard(new VisaStrategy());
		visa.setNumber("4012888888881881");
		visa.setCvv("980");
		visa.setDate("07/2020");
		
		System.out.println("Is Amex valid: " + amex.isValid());
		System.out.println("Is Visa valid: " + visa.isValid());
	}

}
