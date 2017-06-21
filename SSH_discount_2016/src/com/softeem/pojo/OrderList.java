package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="tb_orderList")
public class OrderList {
	
	private int orderid;//������id
	private int ordergoodsid;//��Ʒ��id
	private String ordergoodsname;//��Ʒ����
	private int ordergoodsnum;//��Ʒ����
	private double ordergoodsprice;//��Ʒ�ܼ�
	private String ordername;//�ջ�������
	private String ordertel;//�ջ��ĺ���
	private String orderaddress;//�ջ���ַ
	private String orderremark;//����û���ע
	
	private int orderstate;//������״̬�Ƿ񷢻�1δ����,2ǩ��,3���ۣ�4����
	
	private int orderselluserid;//���������ߵ�id
	private int orderuserid;//�����ߵ�id
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
