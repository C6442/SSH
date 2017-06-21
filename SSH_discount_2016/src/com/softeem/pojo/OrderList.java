package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="tb_orderList")
public class OrderList {
	
	private int orderid;//订单表id
	private int ordergoodsid;//商品的id
	private String ordergoodsname;//商品名称
	private int ordergoodsnum;//商品数量
	private double ordergoodsprice;//商品总价
	private String ordername;//收货人姓名
	private String ordertel;//收货的号码
	private String orderaddress;//收货地址
	private String orderremark;//买家用户备注
	
	private int orderstate;//发货的状态是否发货1未发货,2签收,3评价，4结束
	
	private int orderselluserid;//卖家生产者的id
	private int orderuserid;//购买者的id
	public OrderList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderList(int orderid, int ordergoodsid, String ordergoodsname,
			int ordergoodsnum, double ordergoodsprice, String ordername,
			String ordertel, String orderaddress, String orderremark,
			int orderstate, int orderselluserid, int orderuserid) {
		super();
		this.orderid = orderid;
		this.ordergoodsid = ordergoodsid;
		this.ordergoodsname = ordergoodsname;
		this.ordergoodsnum = ordergoodsnum;
		this.ordergoodsprice = ordergoodsprice;
		this.ordername = ordername;
		this.ordertel = ordertel;
		this.orderaddress = orderaddress;
		this.orderremark = orderremark;
		this.orderstate = orderstate;
		this.orderselluserid = orderselluserid;
		this.orderuserid = orderuserid;
	}
	@Id
	@GeneratedValue
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getOrdergoodsid() {
		return ordergoodsid;
	}
	public void setOrdergoodsid(int ordergoodsid) {
		this.ordergoodsid = ordergoodsid;
	}
	public String getOrdergoodsname() {
		return ordergoodsname;
	}
	public void setOrdergoodsname(String ordergoodsname) {
		this.ordergoodsname = ordergoodsname;
	}
	public int getOrdergoodsnum() {
		return ordergoodsnum;
	}
	public void setOrdergoodsnum(int ordergoodsnum) {
		this.ordergoodsnum = ordergoodsnum;
	}
	public double getOrdergoodsprice() {
		return ordergoodsprice;
	}
	public void setOrdergoodsprice(double ordergoodsprice) {
		this.ordergoodsprice = ordergoodsprice;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrdertel() {
		return ordertel;
	}
	public void setOrdertel(String ordertel) {
		this.ordertel = ordertel;
	}
	public String getOrderaddress() {
		return orderaddress;
	}
	public void setOrderaddress(String orderaddress) {
		this.orderaddress = orderaddress;
	}
	public String getOrderremark() {
		return orderremark;
	}
	public void setOrderremark(String orderremark) {
		this.orderremark = orderremark;
	}
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}
	public int getOrderselluserid() {
		return orderselluserid;
	}
	public void setOrderselluserid(int orderselluserid) {
		this.orderselluserid = orderselluserid;
	}
	public int getOrderuserid() {
		return orderuserid;
	}
	public void setOrderuserid(int orderuserid) {
		this.orderuserid = orderuserid;
	}
	

}
