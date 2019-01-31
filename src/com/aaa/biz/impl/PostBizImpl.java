package com.aaa.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.biz.PostBiz;
import com.aaa.entity.Post;
import com.aaa.mapper.PostMapper;

@Service
public class PostBizImpl implements PostBiz {
	@Autowired
	private PostMapper postMapper;

	@Override
	public Post findOne(int id) {
		// TODO Auto-generated method stub
		return postMapper.findOne(id);
	}

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return postMapper.findAll();
	}

	@Override
	public void add(Post post) {
		// TODO Auto-generated method stub
		postMapper.addPost(post);
	}

	@Override
	public void upd(Post post) {
		// TODO Auto-generated method stub
		postMapper.updPost(post);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		postMapper.delPost(id);
	}
}
