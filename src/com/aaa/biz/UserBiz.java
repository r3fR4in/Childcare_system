package com.aaa.biz;

import java.util.List;

import com.aaa.entity.User;


public interface UserBiz {
	
	public User CheckLoginAndPwd(String name, String pwd);

	public void addUser(User user);

	void updUser(User user);

	void delUser(int id);

	public List<User> SelectAllUser();
}
