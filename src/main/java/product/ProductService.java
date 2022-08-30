package product;

import java.util.List;

public interface ProductService {
	public List<ProductDTO> getAllProducts();
	public List<ProductDTO> getTotalBestseller(int page);
	public List<ProductDTO> getMonthBestseller(int page);
	// 승희 추가
	public List<ProductDTO> searchList(ProductDTO dto);
}
