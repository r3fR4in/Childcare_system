package com.aaa.mapper;

import java.util.List;

import com.aaa.entity.Repost;

public interface RepostMapper {
	
	
	public Repost findOne(int id);

	//��ѯ��������
	public List<Repost> findAll();
	
	//3.����
	public void add (Repost repost);
	
	//4.����
	public void upd(Repost repost);
	
	//5.ɾ��
	public void del(int id);

}
