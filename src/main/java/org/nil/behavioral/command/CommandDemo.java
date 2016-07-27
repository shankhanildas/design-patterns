package org.nil.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String[] args) {
		Appliance washing_machine = new Appliance();
		Appliance television = new Appliance();
		
		Switch applianceSwitch = new Switch();
		
		//Command onCommand = new OnCommand(appliance);
		//applianceSwitch.storeAndExecute(onCommand);
		
		Command toggleCommand = new ToggleCommand(washing_machine);
		applianceSwitch.storeAndExecute(toggleCommand);
		//applianceSwitch.storeAndExecute(toggleCommand);
		
		List<Appliance> allAppliances = new ArrayList<>();
		allAppliances.add(washing_machine);
		allAppliances.add(television);
		
		Command macroCommand = new AllAppliancesCommand(allAppliances);
		applianceSwitch.storeAndExecute(macroCommand);
	}

}
