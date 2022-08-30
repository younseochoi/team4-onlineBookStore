package cart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("cart_dao")
public class CartDAO {
	
	@Autowired
	SqlSession session;
	
	public List<CartDTO> getCart(){
		return session.selectList("getCart");
		//getProducts sql 받아서 return
	}
	
	public List<CartDTO> getBookData(){
		return session.selectOne("getBookData");
	}
	
	public List<CartDTO>  insertIntoCart(CartDTO dto) {
		return session.selectList("insertIntoCart");
	}
}
