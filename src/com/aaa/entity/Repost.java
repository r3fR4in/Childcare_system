package com.aaa.entity;

import java.util.Date;

public class Repost {
	private Integer id;
	private String repost_id;// �ظ�������
	private String text; // �ظ�����
	private String repost_user; // �ظ���
	private Date time;// �ظ�ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRepost_id() {
		return repost_id;
	}
	public void setRepost_id(String repost_id) {
		this.repost_id = repost_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getRepost_user() {
		return repost_user;
	}
	public void setRepost_user(String repost_user) {
		this.repost_user = repost_user;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Repost [id=" + id + ", repost_id=" + repost_id + ", text=" + text + ", repost_user=" + repost_user
				+ ", time=" + time + "]";
	}
	
	
	
	
	
	
}
