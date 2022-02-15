package layeredarchitecture.dao;

import layeredarchitecture.dto.Product;
import layeredarchitecture.exceptions.ProductNotFoundException;

public interface ProductDAO {
	


	public Product getProductByID(Integer productId) throws ProductNotFoundException;

	public String updateProductQunatity(Integer productId, Integer quantity) throws ProductNotFoundException;
}
