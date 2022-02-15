package layeredarchitecture.service;

import layeredarchitecture.dao.ProductDAO;
import layeredarchitecture.dao.ProductDAOImpl;
import layeredarchitecture.exceptions.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO = new ProductDAOImpl();

	@Override
	public String updateProductQunatity(Integer productId, Integer quantity) throws ProductNotFoundException {
		// Product product = productDAO.getProductByID(productId);

		return productDAO.updateProductQunatity(productId, quantity);
	}

}
