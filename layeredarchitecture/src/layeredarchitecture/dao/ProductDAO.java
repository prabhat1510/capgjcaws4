package layeredarchitecture.dao;

import layeredarchitecture.dto.Product;

public interface ProductDAO {
	


	public Product getProductByID(Integer productId);

	public String updateProductQunatity(Integer productId, Integer quantity);
}
