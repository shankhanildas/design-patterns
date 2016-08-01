package org.nil.behavioral.observer;

public class MailClient extends Observer{
	
	public MailClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);		
	}
	
	public void addMessage(String message){
		subject.setState(message + " - sent via mail");
	}
	
	@Override
	void update() {
		System.out.println("Received : " + subject.getState());
	}
}
