package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Post;

public interface PostBiz {

	//1.单条查询-id
	public Post findOne(int id);
		
	//2.查询所有帖子
	public List<Post> findAll();
	
	//3.增加
	public void add (Post post);
	
	//4.更新
	public void upd(Post post);
	
	//5.删除
	public void del(int id);

	
}
