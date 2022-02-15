package layeredarchitecture.service;

import layeredarchitecture.dao.CustomerDAO;
import layeredarchitecture.dao.CustomerDAOImpl;
import layeredarchitecture.dto.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO = new CustomerDAOImpl();

	@Override
	public Customer getCustomerById(Integer customerId) {
		Customer customer = customerDAO.getCustomerById(customerId);
		updateCustomerDetailsWithNewValues(customer);
		return customer;
	}

	//Another method in a service or business layer to modify the data 
	//which we retrieved from database
	private void updateCustomerDetailsWithNewValues(Customer customer) {
		customer.setCustomerName("Prabhat");		
	}

}
