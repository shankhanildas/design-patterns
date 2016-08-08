package org.nil.behavioral.state;

public class RadioOnState extends State {
private Radio radio;
	
	public RadioOnState(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Tuning radio to 93.5.");
		radio.setState(radio.get93_5TunedState());
	}
	
	@Override
	public String toString() {
		return "Radio is on";
	}
}
