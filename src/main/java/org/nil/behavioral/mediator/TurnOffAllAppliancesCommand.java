package org.nil.behavioral.mediator;

public class TurnOffAllAppliancesCommand implements Command{
	private Mediator med;	
	
	public TurnOffAllAppliancesCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOffAllAppliances();
	}
}
