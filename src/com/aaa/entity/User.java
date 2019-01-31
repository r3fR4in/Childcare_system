package com.aaa.entity;

import java.util.Date;

/**
 * @class_name：User
 * @param: 1.User表
 * @return: 用户实体类
 * @author:Zoutao
 * @createtime:2018年3月21日
 */

public class User {
	private int id; // id
	private String username; // 用户名
	private String password; // 密码
	private String address; // 地址
	private Integer state;//状态
	private Integer per;//权限

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
