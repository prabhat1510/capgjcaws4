/**
 * 
 */
package daythree.exceptions.example;

/**
 * @author UD SYSTEMS
 *
 */
public class CustomerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		try {
			customerService.getCustomer(2);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
