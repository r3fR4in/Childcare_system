package com.aaa.mapper;

import java.util.List;

import com.aaa.entity.Post;

public interface PostMapper {
	//1.������ѯ-id
	public Post findOne(int id);
		
	//2.��ѯ������Ʒ
	public List<Post> findAll();
	
	//3.����
	public void add (Post post);
	
	//4.����
	public void upd(Post post);
	
	//5.ɾ��
	public void del(int id);
}
