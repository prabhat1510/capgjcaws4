package jpaassociationandmapping.manytomany;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author UD SYSTEMS
 * 
 * Order is the owning entity, owning entity should have @JoinTable
 */
@Entity
@Table(name="order_master")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private Date orderDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the JOin table product_orders
	 */
	@JoinTable(name="product_orders",joinColumns= {@JoinColumn(name="orderId")},
										inverseJoinColumns = {@JoinColumn(name="productId")})
	private Set<Product> products;


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
