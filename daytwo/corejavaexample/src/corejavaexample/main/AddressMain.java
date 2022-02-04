package corejavaexample.main;

import java.util.Date;

public class AddressMain {

	public static void main(String[] args) {
		/**Instance or object of Address class is created here and that object is referred by 
		 * identifier(or reference variable) 'address'
		* To create an object or an instance of class java has provided us 'new' keyword to call constructor of the class
		* 
		*/
		Address address = new Address();
		System.out.println("***************************");
		System.out.println(address.getCity());
		System.out.println("***************************");
		address.addressId="1510A";
		address.setCity("Bhopal");
		address.setCountry("India");
		address.setHouseName("Guru Krupa");
		address.setState("Madhya Pradesh");
		address.setStreet("Khao Gali");
		
		System.out.println(address.getCity());
		System.out.println(address.addressId);
		
		Customer customer = new Customer();
		customer.setCustomerName("Aman Singh Patel");
		customer.setDateOfBirth(new Date());
		customer.setAddress(address);
		
		
		System.out.println(customer.getAddress().getStreet());
		
		Customer customerOne = new Customer();
		customerOne.setCustomerName("Raman Singh Patel");
		customerOne.setDateOfBirth(new Date());
		customerOne.setAddress(address);
		System.out.println(customerOne.getCustomerName());
		
	}

}
