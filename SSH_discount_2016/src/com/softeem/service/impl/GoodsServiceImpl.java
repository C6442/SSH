package com.softeem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softeem.dao.GoodsDAO;
import com.softeem.pojo.Goods;
import com.softeem.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
	
	private GoodsDAO goodsDAO;
	
	@Resource(name="goodsDAO")
	public void setGoodsDAO(GoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

	@Override
	public boolean addGoods(Goods goods) {
		boolean b=goodsDAO.addGoods(goods);
		return b;
	}

	@Override
	public Goods findOneGoods(int gid) {
		Goods goods=goodsDAO.findOneGoods(gid);
		return goods;
	}

	@Override
	public boolean updateGoods(Goods goods) {
		boolean b=goodsDAO.updateGoods(goods);
		return b;
	}

	@Override
	//删
	public boolean deleteGoods(Goods goods) {
		boolean b=goodsDAO.deleteGoods(goods);
		return b;
	}

	@Override
	public int totalPageGoods(String goodscategory) {
		
		int totalPage=goodsDAO.totalPageGoods(goodscategory);
		return totalPage;
	}

	@Override
	public List<Goods> fenyeGoods(int pageNow, String goodscategory) {
		
		List<Goods> goodslist=goodsDAO.fenyeGoods(pageNow, goodscategory);
		return goodslist;
	}
	
	//商家查询自己发布的商品
	@Override
	public int totalPage(int goodsuserid) {
		int totalPage=goodsDAO.totalPage(goodsuserid);
		return totalPage;
	}

	@Override
	public List<Goods> findAllGoods(int pageNow, int goodsuserid) {
		List<Goods> goodslist=goodsDAO.findAllGoods(pageNow, goodsuserid);
		return goodslist;
	}

	@Override
	public List<Goods> findSameGoods(String name) {
		List<Goods> goodslist=goodsDAO.findSameGoods(name);
		return goodslist;
	}

}
