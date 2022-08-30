package cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@Autowired
	@Qualifier("cart_service")
	CartService service;
	
	@RequestMapping("/cart")
	public ModelAndView getProducts() {
		ModelAndView mv = new ModelAndView();
		List<CartDTO> cart_list = service.getCart();
		mv.addObject("cart_list", cart_list);
		mv.setViewName("cart/cart");
		return mv;
	}
	
	
/*
	@RequestMapping("/cart2")
	public ModelAndView getData(@RequestParam("book_id") String book_id) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("book_id", book_id);
		mv.setViewName("cart/cart");
		return mv;
	}
*/	

	
	
}
