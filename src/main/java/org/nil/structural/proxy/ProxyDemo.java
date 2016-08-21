package org.nil.structural.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		System.out.println(service.getTimeLine("blue"));
	}

}
