package layeredarchitecture.dao;

import java.util.ArrayList;
import java.util.List;

import layeredarchitecture.dto.Product;

public class ProductDAOImpl implements ProductDAO {
		List<Product> productList = new ArrayList<Product>();
	@Override
	public String updateProductQunatity(Integer productId,Integer quantity) {
		Product product = getProductByID(productId);
		Integer updatedQuantity =product.getQuantity() -quantity; 
		if(product != null) {
			product.setQuantity(updatedQuantity);
			System.out.println(productList);
		}
		return "Product quantity updated successfully";
	}
	
	
	private void addProductToList() {
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("iPhone 13 Pro Max");
		product.setQuantity(15);
		
		Product product1 = new Product();
		product1.setProductId(2);
		product1.setProductName("iPhone 12");
		product1.setQuantity(10);
		productList.add(product);
		productList.add(product1);
	}


	@Override
	public Product getProductByID(Integer productId) {
		addProductToList();
		for(Product product: productList) {
			if(productId == product.getProductId()) {
				return product;
			}
		}
		return null;
	}

}
