/**
 * 
 */
package com.fidelity.greeter;

/**
 * @author ROI
 *
 */
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	public AmarilloVisitor(){
		this.greeting = "Howdy";
	}
	
	public String getGreeting() {
		return greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
