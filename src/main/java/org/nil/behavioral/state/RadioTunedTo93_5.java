package org.nil.behavioral.state;

public class RadioTunedTo93_5 extends State {
	private Radio radio;
	
	public RadioTunedTo93_5(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Tuning radio to 94.3 FM.");
		radio.setState(radio.get94_3TunedState());
	}
	
	@Override
	public String toString() {
		return "Radio is tuned into 93.5 FM; baajate raho!";
	}
}
