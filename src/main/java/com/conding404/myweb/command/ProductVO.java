package com.conding404.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductVO {
	
	private Integer prod_id; //자동증가값, insert x
	private LocalDateTime prod_regdate; //자동값, insert x
	private String prod_enddate;
	private String prod_category;
	private String prod_writer;
	private String prod_name;
	private Integer prod_price;
	private Integer prod_count;
	private Integer prod_discount;
	private String prod_purchase_yn;
	private String prod_content;
	private String prod_comment;

}
