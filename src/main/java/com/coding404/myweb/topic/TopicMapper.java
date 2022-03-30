package com.coding404.myweb.topic;

import org.apache.ibatis.annotations.Mapper;

import com.conding404.myweb.command.TopicVO;

@Mapper
public interface TopicMapper {
	
	public int regist(TopicVO vo);

}
