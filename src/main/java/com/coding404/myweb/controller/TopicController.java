package com.coding404.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.topic.TopicService;
import com.conding404.myweb.command.TopicVO;

@Controller
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	@Qualifier("topicService")
	TopicService topicService;
	
	
	//등록화면
	@GetMapping("/topicReg")
	public String topicreg() {
		return "topic/topicReg";
	}
	
	@GetMapping("/topicListMe")
	public String topicListMe() {
		
		return "topic/topicListMe";
	}
	
	@GetMapping("/topicListAll")
	public String topicListAll() {
		
		return "topic/topicListAll";
	}

	@GetMapping("/topicDetail")
	public String topicDetail() {
		
		return "topic/topicDetail";
	}

	@GetMapping("/topicModify")
	public String topicModify() {
		
		return "topic/topicModify";
	}
	
	@PostMapping("/topicForm")
	public String topicForm(TopicVO vo, RedirectAttributes RA) {
		
		int result = topicService.regist(vo);
		
		if(result == 1) {
			
			RA.addFlashAttribute("msg", "topic이 등록되었습니다");
		}else {
			
			RA.addFlashAttribute("msg", "topic등록에 실패했습니다");
		}
		
		return "redirect:/topic/topicListAll";
	}

}
