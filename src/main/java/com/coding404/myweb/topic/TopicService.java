package com.coding404.myweb.topic;

import java.util.ArrayList;

import com.coding404.myweb.command.TopicVO;

public interface TopicService {
	
	public int regist(TopicVO vo);
	public ArrayList<TopicVO> getList();
	public TopicVO getListMe(String topic_id); 
	public TopicVO getDetail(int topic_num);
	public int update(TopicVO vo);
	public int delete(int topic_num);
}
