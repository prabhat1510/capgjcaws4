package layeredarchitecture.service;

import layeredarchitecture.dao.ProductDAO;
import layeredarchitecture.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO = new ProductDAOImpl();

	@Override
	public String updateProductQunatity(Integer productId, Integer quantity) {
		// Product product = productDAO.getProductByID(productId);

		return productDAO.updateProductQunatity(productId, quantity);
	}

}
