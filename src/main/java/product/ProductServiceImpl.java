package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("product_service")
public class ProductServiceImpl implements ProductService {
	@Autowired
	@Qualifier("product_dao")
	ProductDAO dao;
	
	@Override
	public List<ProductDTO> getAllProducts() {
		
		return dao.getAllProducts();
	}

	@Override
	public List<ProductDTO> getTotalBestseller(int page) { //역대 베스트 셀러
		System.out.println(dao.getTotalBestseller(page));
		return dao.getTotalBestseller((page-1)*4);
	}

	@Override
	public List<ProductDTO> getMonthBestseller(int page) { //이달의 베스트 셀러
		return dao.getMonthBestseller((page-1)*4);
	}

	//승희 추가
	@Override
	public List<ProductDTO> searchList(ProductDTO dto) {
		return dao.searchList(dto);
	}
	
}
