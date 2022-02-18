package dayeleven.jdbcapp.service;

import java.util.List;

import dayeleven.jdbcapp.dao.CustomerDAO;
import dayeleven.jdbcapp.dao.CustomerDAOImpl;
import dayeleven.jdbcapp.data.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDAO = new CustomerDAOImpl();
	@Override
	public Customer getCustomerById(Integer customerId) {
		
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerDAO.getAllCustomers();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public Integer restrictedDeleteCustomer(Integer customerId, boolean accessible) {
		if(accessible) {
			customerDAO.deleteCustomer(customerId);
		}else {
			System.out.println("delete customer is not accessible from CustomerService Impl class");
		}
		return null;
	}

}
