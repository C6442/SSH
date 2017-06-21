package com.softeem.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_goods")
public class Goods {
	private int goodsid;//商品id
	private String goodsname;//商品名
	private String goodscategory;//商品类别
	private String goodssrc; //商品图片路径
	private String goodsthing;//商品描述
	private double goodsoldprice;//原价
	private double goodsnowprice;//现价
	
	
	private int goodsuserid; //商家的id


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
