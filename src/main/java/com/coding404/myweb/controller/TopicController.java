package com.coding404.myweb.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.topic.TopicService;

import oracle.jdbc.proxy.annotation.Post;

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
	public String topicListAll(TopicVO vo, Model model) {
		
		ArrayList<TopicVO> list = topicService.getList();
		
		model.addAttribute("vo", list);
		
		return "topic/topicListAll";
	}

	@GetMapping("/topicDetail")
	public String topicDetail(@RequestParam("topic_num") int topic_num,
							  Model model) {
		
		TopicVO topicVO = topicService.getDetail(topic_num);
		
		model.addAttribute("topicVO", topicVO);
		System.out.println(topicVO.getTopic_num());
		
		return "topic/topicDetail";
	}

	@GetMapping("/topicModify")
	public String topicModify(@RequestParam("topic_num") int topic_num,
							  Model model) {
		
		TopicVO topicVO = topicService.getDetail(topic_num);
		model.addAttribute("topicVO", topicVO);
		
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
	
	@PostMapping("/topicUpdate")
	public String topicUpdate(TopicVO vo, RedirectAttributes RA) {
			
		int result = topicService.update(vo);
		
		if(result == 1) {
			
			RA.addFlashAttribute("msg", "topic이 수정되었습니다");
		}else {
			
			RA.addFlashAttribute("msg", "topic수정에 실패했습니다");
		}
		
		return "redirect:/topic/topicListAll";
	}
	
	@PostMapping("/topicDelete")
	public String topicDelete(@RequestParam("topic_num") int topic_num,
								RedirectAttributes RA) {
		
		int result = topicService.delete(topic_num);
		
		if(result == 1) {
			
			RA.addFlashAttribute("msg", "topic이 삭제되었습니다");
		}else {
			
			RA.addFlashAttribute("msg", "topic삭제에 실패했습니다");
		}
		
		return "redirect:/topic/topicListAll";
	}

}
