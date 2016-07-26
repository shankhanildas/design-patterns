package org.nil.chainOfResponsibility;

public class Manager extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.LUNCH){
			System.out.println("Manager can approve lunch");
		} else {
			successor.handleRequest(request);
		}
	}
}
