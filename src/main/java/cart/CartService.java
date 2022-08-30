package cart;

import java.util.List;

import product.ProductDTO;

public interface CartService {
	public List<CartDTO> getCart();
	public List<CartDTO> getBookData();
	public List<CartDTO> insertIntoCart(CartDTO dto);
}
