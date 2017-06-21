package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.Ping;

public interface PingDAO {
	
	//添加评价
	public boolean addPing(Ping ping);
	//删除评价
	public boolean deletePing(Ping ping);
	
	//查一个评价
	public Ping findOnePing(int pid);
	//修改评价
	public boolean update(Ping ping);
	
	//在商品页面看评价
	public int totalPage(int ordergoodsid);//传入商品的id
	public List<Ping> fenyePing(int ordergoodsid,int pageNow);
	
	//查看自己发布的评价
	public int totalPageByUser(int puserid);//传入商品的id
	public List<Ping> findAllPing(int puserid,int pageNow);


}
