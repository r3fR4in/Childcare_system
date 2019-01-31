package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Repost;

public interface RepostBiz {
	
	public Repost findOne(int id);
	
	//查询所有帖子
	public List<Repost> findAllRepost();
	
	//3.增加
	public void add (Repost repost);
	
	//4.更新
	public void upd(Repost repost);
	
	//5.删除
	public void del(int id);

}
