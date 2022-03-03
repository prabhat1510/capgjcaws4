package com.fidelity.greeter;

public class JerseyVisitor implements Visitor{
	private String name;
	private String greeting;

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGreeting() {
		return greeting;
	}

}
