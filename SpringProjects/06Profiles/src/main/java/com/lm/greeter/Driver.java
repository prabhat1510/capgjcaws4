package com.lm.greeter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;




public class Driver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		  context.getEnvironment().setActiveProfiles("dev");
		  context.register(AppConfigs.class);
		  context.refresh();
		  
		DataSourceConfig dsConfig = (DataSourceConfig) context.getBean("dataSource");
		dsConfig.setup();

	    
	}

}
