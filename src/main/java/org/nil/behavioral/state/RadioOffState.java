package org.nil.behavioral.state;

public class RadioOffState extends State {
	private Radio radio;
	
	public RadioOffState(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning radio on.");
		radio.setState(radio.getRadioOnState());
	}
	
	@Override
	public String toString() {
		return "Radio is off";
	}
}
