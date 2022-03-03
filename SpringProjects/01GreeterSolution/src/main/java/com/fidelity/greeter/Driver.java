package com.fidelity.greeter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		String springConfigurationFile = "greeter-beans.xml";
		
		AbstractApplicationContext factory = 
				new ClassPathXmlApplicationContext(springConfigurationFile);
		Greeter g = factory.getBean("greeter", Greeter.class);
		//Greeter g1 = factory.getBean("greeter", Greeter.class);
		g.greet();

		factory.close();
	}

}
