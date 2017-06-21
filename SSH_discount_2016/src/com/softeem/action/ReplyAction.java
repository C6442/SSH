package com.softeem.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.softeem.pojo.Reply;
import com.softeem.service.ReplyService;

public class ReplyAction{
	
	private ReplyService replyService;
	private Reply reply;
	
	
	private int pageNow;
	private int totalPage;
	
	private List<Reply> replylist;
	
	
	//回复买家，增加回复
	public String saveReply(){
		System.out.println(reply.getRpinggoodsid()+reply.getRpingid()+reply.getRthing()+reply.getRuserid());
		boolean b=replyService.addReply(reply);
		return b?"saveReply":"error";
	}
	
	//查看自己的回复
	public String findMyReply(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=replyService.totalPageByUser(reply.getRuserid());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		replylist=replyService.findAllReply(reply.getRuserid(), pageNow);
		
		return "findMyReply";
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public ReplyService getReplyService() {
		return replyService;
	}

	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(List<Reply> replylist) {
		this.replylist = replylist;
	}
	
	
	
	
	

}
