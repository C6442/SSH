package com.softeem.service;

import java.util.List;

import com.softeem.pojo.Reply;

public interface ReplyService {
	//添加回复
	public boolean addReply(Reply reply);
	//删除回复
	public boolean deleteReply(Reply reply);
	
	//查一个回复
	public Reply findOneReply(int rid);
	//修改回复
	public boolean update(Reply reply);
	
	//在商品页面看回复
	public int totalPage(int goodsid);//传入商品的id
	public List<Reply> fenyeReply(int goodsid,int pageNow);
	
	//查看自己发布的回复
	public int totalPageByUser(int ruserid);//传入id
	public List<Reply> findAllReply(int ruserid,int pageNow);

}
