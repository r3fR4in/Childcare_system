package com.aaa.entity;

import java.util.Date;

public class Post {
	private Integer id;
	private String name;// ���ӱ���
	private String text;// ��������
	private Date time;// ����ʱ��
	private String Authorid;// ��������id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getAuthorid() {
		return Authorid;
	}
	public void setAuthorid(String authorid) {
		Authorid = authorid;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", text=" + text + ", time=" + time + ", Authorid=" + Authorid
				+ "]";
	}
	
	
	
}
