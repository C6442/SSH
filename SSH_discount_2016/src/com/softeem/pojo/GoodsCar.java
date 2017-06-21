package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_goodsCar")
public class GoodsCar {
	//���ﳵ
	private int gcid;//���ﳵ��ƷId
	private String gcname;//��Ʒ���� goodsname
	private int gcgoodsid;//��Ʒid  goodsid
	private double gcprice;//�۸�  goodsnowprice
	private int gcnum;   //��Ʒ������
	
	private int gcselluserid;//���ҵ�id
	private int gcuserid; //�û���id��ҵ�id   �Ѿ���¼���û���Id loginuser.userid
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
