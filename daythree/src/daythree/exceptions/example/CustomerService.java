package daythree.exceptions.example;

public class CustomerService {
	
	public Customer getCustomer(Integer customerId) throws CustomerNotFoundException{
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("Ragini");
		//It will search for a customerId if its present it will return customer or throw exception
		try {
			if(customerId != customer.getCustomerId()) {
				throw new CustomerNotFoundException("Customer with customer id "+customerId+" does not exist");
			}
		}catch(CustomerNotFoundException cnfe) {
			System.out.println("Customer not found");
			throw cnfe;//re throw the customer not exception			
		}
		return customer;
		
	}

}
