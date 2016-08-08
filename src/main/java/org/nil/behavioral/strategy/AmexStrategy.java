package org.nil.behavioral.strategy;

public class AmexStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard card) {
		boolean isValid = true;
		
		isValid = card.getNumber().startsWith("37") ||
				card.getNumber().startsWith("34");
		
		if(isValid) {
			isValid = card.getNumber().length() == 15;
		}
		
		if(isValid) {
			isValid = processLuhn(card.getNumber());
		}
		
		return isValid;
	}

}
