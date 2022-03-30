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
public class TopicVO {
	
	private Integer topic_num;  //자동입력
	private String topic_regdate; 
	private String topic_id;
	private String topic_title;
	private String topic_content;

}
