package com.aaa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.User;

/**
 * @class_name��UserMapper
 * @param: 2.dao��ӿ�
 * @return: ���ݳ־û�
 * @author:Zoutao
 * @createtime:2018��3��21��
 */
public interface UserMapper {

	public List<User> SelectAllUser();
	
	// ��ѯ��¼�˻�-�û�����Ϊ����
	public User CheckLoginAndPwd(@Param("username") String name, @Param("password") String pwd);
	
	// ע���û�
	public void addUser(User user);
	
	//����
	public void updUser(User user);
	
	//ɾ��
	public void delUser(int id);
	
	
}
