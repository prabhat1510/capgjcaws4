package layeredarchitecture.service;

import layeredarchitecture.exceptions.ProductNotFoundException;

public interface ProductService {
	
	public String updateProductQunatity(Integer productId, Integer quantity) throws ProductNotFoundException;
}
