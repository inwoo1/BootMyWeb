package com.coding404.myweb.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.product.ProductMapper;
import com.coding404.myweb.util.Criteria;
import com.coding404.myweb.util.PageVO;

@SpringBootTest
public class PageTest {
	
	@Autowired
	ProductMapper productMapper;
	
//	@Test
//	public void test01() {
//		
//		for(int i = 1; i<=200; i++) {
//			
//			ProductVO vo = ProductVO.builder().prod_enddate("2021-12-01")
//							   .prod_writer("admin")
//							   .prod_name("test" + i)
//							   .prod_price(10000 + i)
//							   .prod_count(10 * i)
//							   .prod_discount(i)
//							   .prod_purchase_yn("Y")
//							   .prod_content("test" + i)
//							   .prod_comment("test" + i)
//							   .build();
//			
//			productMapper.regist(vo);
//		}
//	}
	
	@Test
	public void text02() {
		
		Criteria cri = new Criteria(11, 10);  //1, 10
		PageVO pageVO = new PageVO(cri, 151);// cri,전체게시글 수
		
		System.out.println(pageVO.toString());
	}

}
