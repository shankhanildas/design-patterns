package org.nil.behavioral.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Appliance washing_machine = new Appliance("washing machine");
		Appliance television = new Appliance("television");
		
		mediator.registerAppliance(washing_machine);
		mediator.registerAppliance(television);
		
		Command turnOnAllAppliancesCommand = new TurnOnAllAppliancesCommand(mediator);
		turnOnAllAppliancesCommand.execute();
		
		Command turnOffAllAppliancesCommand = new TurnOffAllAppliancesCommand(mediator);
		turnOffAllAppliancesCommand.execute();
	}

}
