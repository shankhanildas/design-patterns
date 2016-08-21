	package org.nil.structural.proxy;

public class TwitterServiceStub implements TwitterService {

	@Override
	public String getTimeLine(String screenName) {
		return "Blue timeline";
	}

	@Override
	public void postToTimeLine(String screenName, String message) {
		// TODO Auto-generated method stub		
	}

}
