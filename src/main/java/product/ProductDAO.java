package product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("product_dao")
public class ProductDAO {
	
	@Autowired
	SqlSession session;
	
	public List<ProductDTO> getAllProducts(){
		return session.selectList("getAllProducts");
	}
	
	public List<ProductDTO> getTotalBestseller(int page){
		return session.selectList("getTotalBestseller",page);
	}
	
	public List<ProductDTO> getMonthBestseller(int page){
		return session.selectList("getMonthBestseller",page);
	}
	
	//승희
	public List<ProductDTO> searchList(ProductDTO dto){
		return session.selectList("searchlist", dto);
	}
}
