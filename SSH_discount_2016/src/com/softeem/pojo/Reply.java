package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_reply")
public class Reply {
	
	private int rid;//�ظ���id
	private int rpinggoodsid;//�ظ����������Ǹ���Ʒ�µ�
	private int rpingid;//�ظ������۵ı��
	private String rthing;//�ظ�������
	private int ruserid;//�ظ����̼�id
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reply(int rid, int rpinggoodsid, int rpingid, String rthing,
			int ruserid) {
		super();
		this.rid = rid;
		this.rpinggoodsid = rpinggoodsid;
		this.rpingid = rpingid;
		this.rthing = rthing;
		this.ruserid = ruserid;
	}
	
	@Id
	@GeneratedValue
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getRpinggoodsid() {
		return rpinggoodsid;
	}
	public void setRpinggoodsid(int rpinggoodsid) {
		this.rpinggoodsid = rpinggoodsid;
	}
	public int getRpingid() {
		return rpingid;
	}
	public void setRpingid(int rpingid) {
		this.rpingid = rpingid;
	}
	public String getRthing() {
		return rthing;
	}
	public void setRthing(String rthing) {
		this.rthing = rthing;
	}
	public int getRuserid() {
		return ruserid;
	}
	public void setRuserid(int ruserid) {
		this.ruserid = ruserid;
	}
	
	
	
}
