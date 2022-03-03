package springscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean("customerService")
	//@Scope("prototype") // default scope of bean in spring framework is singleton( means same instance will presented as request) 
	public CustomerService createCustomerService(){
		return new CustomerService();
	}
	
	
}
