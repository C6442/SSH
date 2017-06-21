package com.softeem.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.softeem.pojo.Ping;
import com.softeem.pojo.Reply;
import com.softeem.service.PingService;
import com.softeem.service.ReplyService;

@Controller("pingAction")
@Scope("prototype")
public class PingAction  extends  ActionSupport{
	
	private PingService pingService;
	
	private Ping ping;
	
	private int pageNow;
	private int totalPage;
	
	private List<Ping> pinglist;
	
	private ReplyService replyService;
	private List<Reply> replylist;
	
	public String savePing(){
		System.out.println("dhgsfg");
		System.out.println(ping.getPgoodsid()+ping.getPthing()+ping.getPuserid());
		boolean b=pingService.addPing(ping);
		return b?"savePing":"error";
	}
	
	//回复时查询的
	public String findOnePing(){
		System.out.println(ping.getPid());
		ping=pingService.findOnePing(ping.getPid());
		
		return "findOnePing";
	}
	
	//查看自己的评价
	public String findMyPing(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=pingService.totalPageByUser(ping.getPuserid());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		pinglist=pingService.findAllPing(ping.getPuserid(), pageNow);
		return "findMyPing";
	}
	
	public String fenyePing(){
		int goodsid=ping.getPgoodsid();
		replyService.fenyeReply(ping.getPgoodsid(), pageNow);
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=pingService.totalPage(ping.getPgoodsid());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		pinglist=pingService.fenyePing(ping.getPgoodsid(), pageNow);
		
		return "fenyePing";
	}
	

	public PingService getPingService() {
		return pingService;
	}

	public void setPingService(PingService pingService) {
		this.pingService = pingService;
	}

	public Ping getPing() {
		return ping;
	}

	public void setPing(Ping ping) {
		this.ping = ping;
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

	public List<Ping> getPinglist() {
		return pinglist;
	}

	public void setPinglist(List<Ping> pinglist) {
		this.pinglist = pinglist;
	}

	public ReplyService getReplyService() {
		return replyService;
	}

	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

	public List<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(List<Reply> replylist) {
		this.replylist = replylist;
	}
	
	
	
	
}
