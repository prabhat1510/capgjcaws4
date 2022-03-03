package springexamplesusingannotation.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Customer createCustomer(){
		return new Customer();
	}
	
	@Bean(name="person")
	public Person createPerson(){
		return new Person();
	}
	
	@Bean(name="addressBean1")
	public Address createResidentialAddress(){
		return new Address();
	}
	
	@Bean(name="addressBean2")
	public Address createPermanentAddress(){
		return new Address();
	}
}
