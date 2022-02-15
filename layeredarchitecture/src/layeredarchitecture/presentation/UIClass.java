package layeredarchitecture.presentation;

import java.util.Scanner;

import layeredarchitecture.dto.Customer;
import layeredarchitecture.exceptions.ProductNotFoundException;
import layeredarchitecture.service.CustomerService;
import layeredarchitecture.service.CustomerServiceImpl;
import layeredarchitecture.service.ProductService;
import layeredarchitecture.service.ProductServiceImpl;

/**
 * This is a presentation layer class which is used by end user to 
 * interact with application 
 * @author UD SYSTEMS
 *
 */
public class UIClass {

	public static void main(String[] args) {
		//Scanner(System.in) to accept user input and System.out.println() to display the output
		Scanner scanner = new Scanner(System.in);
		Integer  customerId =scanner.nextInt();
		//Presentation Layer is passing user input to Service Layer /Business Logic Layer using abstract interfaces
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(customerId);
		if(customer != null) {
			//Displays output
			System.out.println(customer);
		}else {
			System.out.println("Cusotmer details not found");
		}
		
	ProductService productService = new ProductServiceImpl();
	String message;
	try {
		message = productService.updateProductQunatity(15, 5);
		System.out.println(message);
	} catch (ProductNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	

	}

}
