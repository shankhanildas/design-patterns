package org.nil.behavioral.mediator;

public class TurnOnAllAppliancesCommand implements Command{
	private Mediator med;	
	
	public TurnOnAllAppliancesCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOnAllAppliances();
	}
}
