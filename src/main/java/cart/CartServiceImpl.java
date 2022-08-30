package cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("cart_service")
public class CartServiceImpl implements CartService {

	@Autowired
	@Qualifier("cart_dao")
	CartDAO dao;
	
	@Override
	public List<CartDTO> getCart() {
		
		return dao.getCart();
	}

	@Override
	public List<CartDTO> getBookData() {
		// TODO Auto-generated method stub
		return dao.getBookData();
	}

	@Override
	public List<CartDTO> insertIntoCart(CartDTO dto) {
		return dao.insertIntoCart(dto);
		

	}

	
}
