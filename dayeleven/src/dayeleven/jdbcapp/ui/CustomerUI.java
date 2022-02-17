package dayeleven.jdbcapp.ui;

import java.time.LocalDate;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.service.CustomerService;
import dayeleven.jdbcapp.service.CustomerServiceImpl;

public class CustomerUI {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = new Customer(1," Rakesh Kumar",LocalDate.of(2000, 10, 15),9999106211L,"rakesh@gmail.com");
		System.out.println(customerService.addCustomer(customer));

	}

}
