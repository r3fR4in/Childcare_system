package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Repost;

public interface RepostBiz {
	
	public Repost findOne(int id);
	
	//��ѯ��������
	public List<Repost> findAllRepost();
	
	//3.����
	public void add (Repost repost);
	
	//4.����
	public void upd(Repost repost);
	
	//5.ɾ��
	public void del(int id);

}
