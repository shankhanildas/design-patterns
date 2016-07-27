package org.nil.behavioral.command;

//client
public class CommandDemo {

	public static void main(String[] args) {
		Appliance appliance = new Appliance();
		Switch applianceSwitch = new Switch();
		
		//Command onCommand = new OnCommand(appliance);
		//applianceSwitch.storeAndExecute(onCommand);
		
		Command toggleCommand = new ToggleCommand(appliance);
		applianceSwitch.storeAndExecute(toggleCommand);
		applianceSwitch.storeAndExecute(toggleCommand);
	}

}
