package com.lm;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;




public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee.getEmpName());		
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getState());
        context.close();

	}

}
