package org.nil.behavioral.command;

//concrete command
public class OnCommand implements Command {

	private Appliance appliance;	
	
	public OnCommand(Appliance appliance) {
		this.appliance = appliance;
	}

	@Override
	public void execute() {
		appliance.on();
	}
}
