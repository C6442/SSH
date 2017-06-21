package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.Goods;

public interface GoodsDAO {
	
	//增加商品
	public boolean addGoods(Goods goods);
	
	//修改
	public Goods findOneGoods(int gid);
	public boolean updateGoods(Goods goods);
	
	//删除
	public boolean deleteGoods(Goods goods);
	
	//查询分页
	public int totalPageGoods(String goodscategory);
	public List<Goods> fenyeGoods(int pageNow,String goodscategory);
	
	//查询自己的
	public int totalPage(int goodsuserid);
	public List<Goods> findAllGoods(int pageNow,int goodsuserid);
	//模糊查询
	public List<Goods> findSameGoods(String name);
}
