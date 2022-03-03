package springscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;




public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
	    	CustomerService custA = (CustomerService) context.getBean("customerService");
	    	custA.setMessage("Message by custA");
	    	System.out.println("Message : " + custA.getMessage());
	    	
	    	//retrieve it again
	    	CustomerService custB = (CustomerService)context.getBean("customerService");
	    	System.out.println("Message : " + custB.getMessage());
	    	
	    	System.out.println(custA.hashCode());
	    	System.out.println(custB.hashCode());
	}

}
