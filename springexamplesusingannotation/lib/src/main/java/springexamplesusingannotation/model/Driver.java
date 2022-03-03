package springexamplesusingannotation.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		String springConfigurationFile = "springconfig-annotations.xml";
		try (AbstractApplicationContext factory = new ClassPathXmlApplicationContext(springConfigurationFile)) {
			Customer cust = factory.getBean("customer", Customer.class);
			System.out.println("Got customer " + cust.getCustomerName());
			Person personBean = factory.getBean("person",Person.class);
			System.out.println("Got Person "+personBean.getPersonName());
			Address resiAdd = factory.getBean("addressBean1",Address.class);
			System.out.println("Got residential address "+resiAdd.getCity());
		}

	}

}
