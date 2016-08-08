package org.nil.behavioral.state;

public class RadioTunedTo94_3 extends State {
private Radio radio;
	
	public RadioTunedTo94_3(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Tuning radio off.");
		radio.setState(radio.getRadioOffState());
	}
	
	@Override
	public String toString() {
		return "Radio is tuned into 94.3 FM; It's hottt!";
	}
}
