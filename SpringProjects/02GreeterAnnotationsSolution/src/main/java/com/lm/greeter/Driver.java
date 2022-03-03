/**
 * 
 */
package com.lm.greeter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]){
		String springConfigurationFile = "greeter-beans-annotations.xml";
		try(AbstractApplicationContext factory = 
				new ClassPathXmlApplicationContext(springConfigurationFile)) {
		Greeter g = factory.getBean("greeter", Greeter.class);
		System.out.println("Got greeter " + g);
		g.greet();
		}
	}
}
