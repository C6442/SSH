package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_goods")
public class Goods {
	private int goodsid;//��Ʒid
	private String goodsname;//��Ʒ��
	private String goodscategory;//��Ʒ���
	private String goodssrc; //��ƷͼƬ·��
	private String goodsthing;//��Ʒ����
	private double goodsoldprice;//ԭ��
	private double goodsnowprice;//�ּ�
	
	
	private int goodsuserid; //�̼ҵ�id


	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Goods(int goodsid, String goodsname, String goodsthing,
			double goodsoldprice, double goodsnowprice, int goodsuserid) {
		super();
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsthing = goodsthing;
		this.goodsoldprice = goodsoldprice;
		this.goodsnowprice = goodsnowprice;
		this.goodsuserid = goodsuserid;
	}

	@Id
	@GeneratedValue
	public int getGoodsid() {
		return goodsid;
	}


	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}


	public String getGoodsname() {
		return goodsname;
	}


	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}


	public String getGoodsthing() {
		return goodsthing;
	}


	public void setGoodsthing(String goodsthing) {
		this.goodsthing = goodsthing;
	}


	public double getGoodsoldprice() {
		return goodsoldprice;
	}


	public void setGoodsoldprice(double goodsoldprice) {
		this.goodsoldprice = goodsoldprice;
	}


	public double getGoodsnowprice() {
		return goodsnowprice;
	}


	public void setGoodsnowprice(double goodsnowprice) {
		this.goodsnowprice = goodsnowprice;
	}


	public int getGoodsuserid() {
		return goodsuserid;
	}


	public void setGoodsuserid(int goodsuserid) {
		this.goodsuserid = goodsuserid;
	}


	public String getGoodssrc() {
		return goodssrc;
	}


	public void setGoodssrc(String goodssrc) {
		this.goodssrc = goodssrc;
	}


	public String getGoodscategory() {
		return goodscategory;
	}


	public void setGoodscategory(String goodscategory) {
		this.goodscategory = goodscategory;
	}
	
	
	
	

}
