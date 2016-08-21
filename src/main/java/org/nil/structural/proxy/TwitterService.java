package org.nil.structural.proxy;

public interface TwitterService {
	public String getTimeLine(String screenName);
	public void postToTimeLine(String screenName, String message);
}
