package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("product_service")
	ProductService service;
	
	@RequestMapping("/allproduct")
	public ModelAndView getAllProducts() {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> product_list = service.getAllProducts();
		mv.addObject("product_list", product_list);
		mv.setViewName("product/searchresult");
		return mv;
	}
	
	@RequestMapping(value="/totalbestseller", produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public List<ProductDTO> getTotalBestseller(int page) {
		System.out.println(page);
		List<ProductDTO> product_list = service.getTotalBestseller(page);
		return product_list;
	}
	
	@RequestMapping(value="/monthbestseller", produces= {"application/json;charset=utf-8"})
	@ResponseBody
	public List<ProductDTO> getMonthBestseller(int page) {
		System.out.println(page);
		List<ProductDTO> product_list = service.getMonthBestseller(page);
		return product_list;
	}
	
	// 승희추가 : 상세검색
	@RequestMapping("/productsearchlist")
	public ModelAndView productlist(String item, String searchword) {
		//item - 이름 검색 / 아이디 검색 ....
		ProductDTO dto = new ProductDTO();
		if(item.contains("제목")) {
			dto.setTitle(searchword); //name != null -- #{name}<=searchword
		}
		else if(item.contains("지은이")) {
			dto.setWriter(searchword);
		}
		else if(item.contains("출판사")) {
			dto.setPublisher(searchword);
		}
		List<ProductDTO> productlist = service.searchList(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("productlist", productlist);
		mv.setViewName("product/searchresult");//뷰 2개 컨트롤러 메소드 동시 설정
		return mv;
	}
	
}
