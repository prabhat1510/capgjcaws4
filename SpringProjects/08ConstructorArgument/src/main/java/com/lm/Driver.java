package com.lm;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class Driver {

	public static void main(String[] args) {
		String confFile = "beans.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGwBean");
        gateway.processOrder();

	}

}
