package com.coding404.myweb.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.product.ProductService;
import com.conding404.myweb.command.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	//등록화면
	@GetMapping("/productReg")
	public String productReg() {
		
		return "product/productReg";
	}
	
	//목록화면
	@GetMapping("/productList")
	public String productList() {
		
		return "product/productList";
	}
	//상세화면
	@GetMapping("/productDetail")
	public String productDetail() {
		
		return "product/productDetail";
	}
	//상품등록 폼
	@PostMapping("/productForm")
	public String productForm(ProductVO vo, RedirectAttributes RA) {
		
		int result = productService.regist(vo);
		
		if(result == 1) { //insert 성공
			
			RA.addFlashAttribute("msg", vo.getProd_name() + "이 정상 등록되었습니다.");
			
		} else {  //insert 실패
			RA.addFlashAttribute("msg", "상품등록에 실패했습니다, 관리자에게 문의하세요");
		}
		
		return "redirect:/product/productList"; //등록후 목록화면으로 리다이렉트
	}
}
