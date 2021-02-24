package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	public HelloWorldBean(String string) {
		this.message = string;
	}

	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String m) {
		message = m;
	}
}
