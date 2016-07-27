package org.nil.behavioral.command;

import java.util.List;

public class AllAppliancesCommand implements Command{
	private List<Appliance> appliances;	
	
	public AllAppliancesCommand(List<Appliance> appliances) {
		this.appliances = appliances;
	}

	@Override
	public void execute() {
		for(Appliance appliance : appliances){
			if(appliance.isOn()){
				appliance.toggle();
			}
		}
	}
}
