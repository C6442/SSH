package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_ping")
public class Ping {
	
	private int pid;//���۱�id
	private int puserid;//�����ߵ�id
	private int pgoodsid;//���۵���Ʒ��id
	private String pthing;//���۵�����
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
