package com.lm.greeter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "greeter-beans.xml" });

		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
	}

}
