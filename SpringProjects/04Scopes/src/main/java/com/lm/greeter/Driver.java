package com.lm.greeter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
	    		new ClassPathXmlApplicationContext(new String[] {"greeter-beans.xml"});

	    	CustomerService custA = (CustomerService)context.getBean("customerService");
	    	custA.setMessage("Message by custA");
	    	System.out.println("Message : " + custA.getMessage());
	    	
	    	//retrieve it again
	    	CustomerService custB = (CustomerService)context.getBean("customerService");
	    	System.out.println("Message : " + custB.getMessage());
	}

}
