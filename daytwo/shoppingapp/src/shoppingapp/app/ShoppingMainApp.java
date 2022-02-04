/**
 * 
 */
package shoppingapp.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author UD SYSTEMS
 *
 */
public class ShoppingMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer = new Customer(1L,"Imitiaz Ali",1);
		Product product = new Product(1L,"iPhone 13 Pro Max","Mobile Phones",155555.50);
		Product productOne = new Product(2L,"iPhone 13 Pro","Mobile Phones",95555.50);
		//Create a List of Product using Java collection List and ArrayList
		List<Product> productList = new ArrayList<>();
		productList.add(productOne);
		productList.add(product);
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setDeliveryDate(LocalDate.now());
		order.setId(1L);
		order.setStatus("In Transit");
		order.setProducts(productList);
		
		Order orderOne = new Order();
		order.setCustomer(customer);
		order.setDeliveryDate(LocalDate.now());
		order.setId(2L);
		order.setStatus("Out for delivery");
		order.setProducts(productList);
		
		List<Order>  orders = new ArrayList<>();
		orders.add(orderOne);
		orders.add(order);
		//List down the orders status In Transit
		//Write the logic to find orders whose status is In Transit
	}

}
