package dayeleven.jdbcapp.ui;

import java.time.LocalDate;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.service.CustomerService;
import dayeleven.jdbcapp.service.CustomerServiceImpl;

public class CustomerUI {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		//Customer customer = new Customer(2,"Disha Patani",LocalDate.of(1992, 06, 13),9999111211L,"disha.patani@gmail.com");
		//System.out.println(customerService.addCustomer(customer));
		//customerService.restrictedDeleteCustomer(1, true);
		Customer customer = customerService.getCustomerById(2);
		System.out.println(customer);
		/**
		Customer customer1 = new Customer(1,"Neha Sharma",LocalDate.of(1991, 05, 14),9999112211L,"neha.sharma@gmail.com");
		Integer numberOfRowUpdated =customerService.updateCustomer(customer1);
		System.out.println(numberOfRowUpdated);
		**/
		System.out.println(customerService.getAllCustomers());
		
		System.out.println(customerService.deleteCustomer(2));
	}

}
