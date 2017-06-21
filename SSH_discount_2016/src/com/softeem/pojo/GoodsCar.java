package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_goodsCar")
public class GoodsCar {
	//购物车
	private int gcid;//购物车商品Id
	private String gcname;//商品名称 goodsname
	private int gcgoodsid;//商品id  goodsid
	private double gcprice;//价格  goodsnowprice
	private int gcnum;   //商品的数量
	
	private int gcselluserid;//卖家的id
	private int gcuserid; //用户的id买家的id   已经登录的用户的Id loginuser.userid
	public GoodsCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsCar(int gcid, String gcname, int gcgoodsid, double gcprice,
			int gcnum, int gcselluserid, int gcuserid) {
		super();
		this.gcid = gcid;
		this.gcname = gcname;
		this.gcgoodsid = gcgoodsid;
		this.gcprice = gcprice;
		this.gcnum = gcnum;
		this.gcselluserid = gcselluserid;
		this.gcuserid = gcuserid;
	}
	@Id
	@GeneratedValue
	public int getGcid() {
		return gcid;
	}
	public void setGcid(int gcid) {
		this.gcid = gcid;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	public int getGcgoodsid() {
		return gcgoodsid;
	}
	public void setGcgoodsid(int gcgoodsid) {
		this.gcgoodsid = gcgoodsid;
	}
	public double getGcprice() {
		return gcprice;
	}
	public void setGcprice(double gcprice) {
		this.gcprice = gcprice;
	}
	public int getGcnum() {
		return gcnum;
	}
	public void setGcnum(int gcnum) {
		this.gcnum = gcnum;
	}
	public int getGcselluserid() {
		return gcselluserid;
	}
	public void setGcselluserid(int gcselluserid) {
		this.gcselluserid = gcselluserid;
	}
	public int getGcuserid() {
		return gcuserid;
	}
	public void setGcuserid(int gcuserid) {
		this.gcuserid = gcuserid;
	}
	
	
	
}
