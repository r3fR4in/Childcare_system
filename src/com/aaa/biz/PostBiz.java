package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Post;

public interface PostBiz {

	//1.������ѯ-id
	public Post findOne(int id);
		
	//2.��ѯ��������
	public List<Post> findAll();
	
	//3.����
	public void add (Post post);
	
	//4.����
	public void upd(Post post);
	
	//5.ɾ��
	public void del(int id);

	
}
