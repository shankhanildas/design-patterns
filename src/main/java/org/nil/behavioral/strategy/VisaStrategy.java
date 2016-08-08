package org.nil.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard card) {
		boolean isValid = true;
		
		isValid = card.getNumber().startsWith("4");
		
		if(isValid) {
			isValid = card.getNumber().length() == 16;
		}
		
		if(isValid) {
			isValid = processLuhn(card.getNumber());
		}
		
		return isValid;
	}

}
