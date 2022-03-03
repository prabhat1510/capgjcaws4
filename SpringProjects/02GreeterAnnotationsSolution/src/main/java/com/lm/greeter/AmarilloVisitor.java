/**
 * 
 */
package com.lm.greeter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("amarilloVis")
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	public AmarilloVisitor(){
		System.out.println("created Amarillo visitor");
		this.name = "Joe Bob Springsteen";
		this.greeting = "Howdy";
	}
	
	public String getGreeting() {
		return greeting;
	}

	public String getName() {
		return name;
	}
	
	@Value(value = "Bruce Baby")
	public void setName(String name) {
		this.name = name;
	}
	
}
