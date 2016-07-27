package org.nil.behavioral.command;

//receiver
public class Appliance {
	
	private boolean isOn = false;
	
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
		System.out.println("appliance switched on.");
	}
	public void off(){
		System.out.println("appliance switched off.");
	}
}
