package org.nil.behavioral.chainOfResponsibility;

public class MD extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.TRAVEL){
			if(request.getAmount() < 1000){
				System.out.println("MD's can approve travel below 1000");
			} else {
				successor.handleRequest(request);
			}
		}
	}
}
