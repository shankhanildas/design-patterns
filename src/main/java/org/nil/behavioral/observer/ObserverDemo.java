package org.nil.behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		MailClient mailClient = new MailClient(subject);
		
		phoneClient.addMessage("Message from Shankhanil");
		mailClient.addMessage("Mail from the system");
	}

}
