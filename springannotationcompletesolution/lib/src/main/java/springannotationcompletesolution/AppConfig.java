package springannotationcompletesolution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Visitor createVisitor(){
		return new AmarilloVisitor();
	}
	
	@Bean(name="greeter")
	public Greeter createGreeter(){
		return new PopupGreeter();
	}

	@Bean("jerseyVisitor")
	public Visitor createJerseyVisitor(){
		return new JerseyVisitor();
	}
}
