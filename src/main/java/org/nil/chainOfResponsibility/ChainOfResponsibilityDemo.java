package org.nil.chainOfResponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Manager vidya = new Manager();
		MD atul = new MD();
		CEO don = new CEO();
		
		vidya.setSuccessor(atul);
		atul.setSuccessor(don);
		
		Request request1 = new Request(RequestType.LUNCH, 100);
		vidya.handleRequest(request1);
		
		Request request2 = new Request(RequestType.TRAVEL, 900);
		vidya.handleRequest(request2);
		
		Request request3 = new Request(RequestType.TRAVEL, 2000);
		vidya.handleRequest(request3);		
	}

}
