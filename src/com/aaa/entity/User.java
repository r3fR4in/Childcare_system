package com.aaa.entity;

import java.util.Date;

/**
 * @class_name��User
 * @param: 1.User��
 * @return: �û�ʵ����
 * @author:Zoutao
 * @createtime:2018��3��21��
 */

public class User {
	private int id; // id
	private String username; // �û���
	private String password; // ����
	private String address; // ��ַ
	private Integer state;//״̬
	private Integer per;//Ȩ��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getPer() {
		return per;
	}

	public void setPer(Integer per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", state=" + state + ", per=" + per + "]";
	}

	
	
}
