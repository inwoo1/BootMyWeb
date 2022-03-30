package com.coding404.myweb.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conding404.myweb.command.TopicVO;


@Service("topicService")
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicMapper topicMapper;
	
	
	@Override
	public int regist(TopicVO vo) {
		return topicMapper.regist(vo);
	}

}
