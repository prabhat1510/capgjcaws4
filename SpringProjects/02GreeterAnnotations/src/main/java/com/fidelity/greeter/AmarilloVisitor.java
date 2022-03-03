/**
 * 
 */
package com.fidelity.greeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author ROI
 *
 */

@Component("amarilloVis")
@Scope("prototype")
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	public AmarilloVisitor(){
		System.out.println("created Amarillo visitor");
		this.name = "Joe Bob";
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
