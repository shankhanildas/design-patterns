package org.nil.behavioral.state;

public abstract class State {
	public void handleRequest() {
		//shouldn't come here
		throw new IllegalStateException();
	}
}
