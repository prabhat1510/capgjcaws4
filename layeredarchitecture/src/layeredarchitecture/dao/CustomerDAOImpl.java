package layeredarchitecture.dao;

import java.util.ArrayList;
import java.util.List;

import layeredarchitecture.dto.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	List<Customer> customerList = new ArrayList<Customer>();
	@Override
	public Customer getCustomerById(Integer customerId) {
		customerList.add(new Customer(1,"Rajesh"));
		customerList.add(new Customer(12,"Rakesh"));
		
		for(Customer customer : customerList) {
			if(customer.getCustomerId() == customerId){
				return customer;
			}
		}
		return null;
	}

}
