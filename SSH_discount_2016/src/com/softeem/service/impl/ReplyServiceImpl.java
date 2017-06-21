package com.softeem.service.impl;

import java.util.List;

import com.softeem.dao.ReplyDAO;
import com.softeem.pojo.Reply;
import com.softeem.service.ReplyService;

public class ReplyServiceImpl implements ReplyService{
	
	private ReplyDAO replyDAO;
	
	
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}

	@Override
	public boolean addReply(Reply reply) {
		boolean b=replyDAO.addReply(reply);
		return b;
	}

	@Override
	public boolean deleteReply(Reply reply) {
		boolean b=replyDAO.deleteReply(reply);
		return b;
	}

	@Override
	public Reply findOneReply(int rid) {
		Reply reply=replyDAO.findOneReply(rid);
		return reply;
	}

	@Override
	public boolean update(Reply reply) {
		boolean b=replyDAO.update(reply);
		return b;
	}

	@Override
	public int totalPage(int goodsid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> fenyeReply(int goodsid, int pageNow) {
		List<Reply> replylist=replyDAO.fenyeReply(goodsid, pageNow);
		return replylist;
	}

	@Override
	public int totalPageByUser(int ruserid) {
		int totalPage=replyDAO.totalPageByUser(ruserid);
		return totalPage;
	}

	@Override
	public List<Reply> findAllReply(int ruserid, int pageNow) {
		List<Reply> replylist=replyDAO.findAllReply(ruserid, pageNow);
		return replylist;
	}

}
