package com.coding404.myweb.topic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.TopicVO;


@Service("topicService")
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicMapper topicMapper;
	
	
	@Override
	public int regist(TopicVO vo) {
		return topicMapper.regist(vo);
	}


	@Override
	public ArrayList<TopicVO> getList() {
		return topicMapper.getList();
	}

	@Override
	public TopicVO getListMe(String topic_id) {
		return topicMapper.getListMe(topic_id);
	}


	@Override
	public TopicVO getDetail(int topic_num) {
		return topicMapper.getDetail(topic_num);
	}
	
	@Override
	public int delete(int topic_num) {
		return topicMapper.delete(topic_num);
	}


	@Override
	public int update(TopicVO vo) {
		return topicMapper.update(vo);
	}




}
