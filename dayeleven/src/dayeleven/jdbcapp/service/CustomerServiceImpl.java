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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addCustomer(Customer customer) {
		
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
