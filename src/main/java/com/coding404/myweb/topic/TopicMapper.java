package com.coding404.myweb.topic;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.TopicVO;

@Mapper
public interface TopicMapper {
	
	public int regist(TopicVO vo);
	public ArrayList<TopicVO> getList();
	public TopicVO getListMe(String topic_id);
	public TopicVO getDetail(int topic_num);
	public int update(TopicVO vo);
	public int delete(int topic_num);
}
