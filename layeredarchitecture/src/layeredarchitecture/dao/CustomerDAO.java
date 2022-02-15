package layeredarchitecture.dao;

import layeredarchitecture.dto.Customer;

public interface CustomerDAO {
	public Customer getCustomerById(Integer customerId);
}
