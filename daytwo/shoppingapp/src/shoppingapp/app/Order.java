package shoppingapp.app;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Customer customer;
	//One order will have more than one product in it. That we are writing using List collection
	private List<Product> products;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, Customer customer,
			List<Product> products) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
		this.products = products;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
