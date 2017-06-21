package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ping")
public class Ping {
	
	private int pid;//评价表id
	private int puserid;//评价者的id
	private int pgoodsid;//评价的商品的id
	private String pthing;//评价的内容
	public Ping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ping(int pid, int puserid, int pgoodsid, String pthing) {
		super();
		this.pid = pid;
		this.puserid = puserid;
		this.pgoodsid = pgoodsid;
		this.pthing = pthing;
	}
	
	@Id
	@GeneratedValue
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPuserid() {
		return puserid;
	}
	public void setPuserid(int puserid) {
		this.puserid = puserid;
	}
	public int getPgoodsid() {
		return pgoodsid;
	}
	public void setPgoodsid(int pgoodsid) {
		this.pgoodsid = pgoodsid;
	}
	public String getPthing() {
		return pthing;
	}
	public void setPthing(String pthing) {
		this.pthing = pthing;
	}

	
	
}
