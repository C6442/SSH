package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_reply")
public class Reply {
	
	private int rid;//回复表id
	private int rpinggoodsid;//回复的评价是那个商品下的
	private int rpingid;//回复的评价的编号
	private String rthing;//回复的内容
	private int ruserid;//回复的商家id
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
