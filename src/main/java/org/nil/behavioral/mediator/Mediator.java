package org.nil.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Appliance> appliances = new ArrayList<>();
	
	public void registerAppliance(Appliance appliance){
		appliances.add(appliance);
	}
	
	public void turnOnAllAppliances(){
		for (Appliance appliance : appliances) {
			if(!appliance.isOn()){
				appliance.toggle();
			}
		}
	}
	
	public void turnOffAllAppliances(){
		for (Appliance appliance : appliances) {
			if(appliance.isOn()){
				appliance.toggle();
			}
		}
	}
}
