package org.nil.behavioral.mediator;

//receiver
public class Appliance {
	
	private boolean isOn = false;
	private String name;
	
	public Appliance(String name) {
		this.name = name;
	}
	
	public boolean isOn() {
		return isOn;
	}

	public void toggle(){
		if(isOn){
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}
	
	public void on(){
		System.out.println(name + " is switched on.");
	}
	public void off(){
		System.out.println(name + " is switched off.");
	}
}
