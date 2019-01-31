package com.aaa.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aaa.biz.RepostBiz;
import com.aaa.entity.Repost;
import com.aaa.mapper.RepostMapper;

public class RepostBizImpl implements RepostBiz{

	@Autowired
	private RepostMapper repostMapper;
	
	@Override
	public Repost findOne(int id) {
		return repostMapper.findOne(id);
	}
	
	@Override
	public List<Repost> findAllRepost() {
		// TODO Auto-generated method stub
		return repostMapper.findAll();
	}

	@Override
	public void add(Repost repost) {
		// TODO Auto-generated method stub
		repostMapper.add(repost);
	}

	@Override
	public void upd(Repost repost) {
		// TODO Auto-generated method stub
		repostMapper.upd(repost);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		repostMapper.del(id);
	}

}
