package com.aaa.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.biz.UserBiz;
import com.aaa.entity.User;
import com.aaa.mapper.UserMapper;

/**
 * @class_name��UserBizImpl
 * @param: 5.impl��ʵ�ֽӿ�
 * @return: ʵ��service�ӿ�
 * @author:Zoutao
 * @createtime:2018��3��21��
 */

@Service
public class UserBizImpl implements UserBiz {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> SelectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.SelectAllUser();
	}
	
	@Override
	public User CheckLoginAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return userMapper.CheckLoginAndPwd(name, pwd);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

	@Override
	public void updUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updUser(user);
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		userMapper.delUser(id);
	}
	
	
}
