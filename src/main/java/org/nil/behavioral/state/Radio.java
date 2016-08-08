package org.nil.behavioral.state;

public class Radio {
	State fm93_5;
	State fm94_3;
	State radioOff;
	State radioOn;
	
	State state;
	
	public Radio() {
		radioOff = new RadioOffState(this);
		radioOn = new RadioOnState(this);
		fm93_5 = new RadioTunedTo93_5(this);
		fm94_3 = new RadioTunedTo94_3(this);
		
		state = radioOff;
	}
	
	public void tune(){
		state.handleRequest();
	}

	public State get93_5TunedState() {
		return fm93_5;
	}

	public State get94_3TunedState() {
		return fm94_3;
	}
	
	public State getRadioOffState() {
		return radioOff;
	}
	
	public State getRadioOnState() {
		return radioOn;
	}

	public void setState(State radioState) {
		this.state = radioState;	
	}

	@Override
	public String toString() {
		return state.toString();
	}
	
}
