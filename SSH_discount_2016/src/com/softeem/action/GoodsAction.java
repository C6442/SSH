package com.softeem.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.softeem.pojo.Category;
import com.softeem.pojo.Goods;
import com.softeem.pojo.Ping;
import com.softeem.pojo.Reply;
import com.softeem.service.GoodsService;
import com.softeem.service.PingService;
import com.softeem.service.ReplyService;

@Controller("goodsAction")
public class GoodsAction extends ActionSupport{
	
	private File myFile;//�ϴ�
	private String myFileFileName;//�ϴ�
	
	private GoodsService goodsService;
	private Goods goods;
	
	private int pageNow=1;//��ǰҳ
	private int totalPage;//�ܵ�ҳ��
	private String category;//��ѯ�����
	
	private List<Goods> goodslist;//��ѯ���Ľ��
	
	private int goodsid;
	private int goodsuserid;//������ѯ�̼ҷ�������Ʒ
	
	private PingService pingService;
	private List<Ping> pinglist;
	
	private ReplyService replyService;
	private List<Reply> replylist;
	
	private Category cate;
	
	
	public Category getCate() {
		return cate;
	}


	public void setCate(Category cate) {
		this.cate = cate;
	}


	public int getGoodsid() {
		return goodsid;
	}


	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	



	//�����Ʒ
	public String saveGoods(){
//		System.out.println(myFileFileName);
		
		
		//����Ŀ��webroot���洴��һ��files�ļ���
		//��ȡָ��Ŀ¼�ڷ������ĸ�·��
		String root=ServletActionContext.getServletContext().getRealPath("/images");
		try {
			FileUtils.copyFile(myFile, new File(root,myFileFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		goods.setGoodssrc("images/"+myFileFileName);
		boolean b=goodsService.addGoods(goods);
		
		return b?"saveGoods":"error";
	}

	
	//��ѯ��Ʒ  ��ʾ����ҳ
	public String fenyeGoods(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=goodsService.totalPageGoods(category);
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
//		System.out.println(totalPage);
//		System.out.println(category);
		goodslist=goodsService.fenyeGoods(pageNow, category);
		ActionContext.getContext().getSession().put("goodslist", goodslist);
		return "fenyeGoods";
	}
	
	
	//����Ա�鿴ȫ����Ʒ
	public String fenyeAllGoods(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=goodsService.totalPageGoods(category);
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
//		System.out.println(totalPage);
//		System.out.println(category);
		goodslist=goodsService.fenyeGoods(pageNow, category);
		ActionContext.getContext().getSession().put("goodslist", goodslist);
		return "fenyeAllGoods";
	}
	//�鿴һ����Ʒ��ҳͬʱ�鿴����Ʒ������
	public String findOneGoods(){
//		System.out.println(goods.getGoodsid());
//		System.out.println(goodsid);
		goods=goodsService.findOneGoods(goods.getGoodsid());
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=pingService.totalPage(goods.getGoodsid());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		
		pinglist=pingService.fenyePing(goods.getGoodsid(), pageNow);
		replylist=replyService.fenyeReply(goods.getGoodsid(), pageNow);
		return "findOneGoods";
	}
	
	//�鿴�̼��Լ��ķ�������Ʒ
	public String findAllGoods(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=goodsService.totalPage(goodsuserid);
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		goodslist=goodsService.findAllGoods(pageNow, goodsuserid);
		
		return "findAllGoods";
	
	}
	
	//�޸���Ʒ�Ȳ�ѯ��Ʒ
	public String findGoods(){
		goods=goodsService.findOneGoods(goods.getGoodsid());
		return "findGoods";
	}
	//�޸���Ʒ
	public String updateGoods(){
		
//		System.out.println(goods.getGoodscategory()+goods.getGoodsthing());
		boolean b=goodsService.updateGoods(goods);
		return b?"updateGoods":"error";
	}
	
	//ɾ����Ʒ
	public String deleteGoods(){
		boolean b=goodsService.deleteGoods(goods);
		return b?"deleteGoods":"error";
	}
	
	//����ʱ�鿴��Ʒ
	public String pingOneGoods(){
		goods=goodsService.findOneGoods(goods.getGoodsid());
		return "pingOneGoods";
	}
	
	//ģ����ѯ
	public String findSameGoods(){
		System.out.println(cate.getCategory());
		goodslist=goodsService.findSameGoods(cate.getCategory());
		
		return "findSameGoods";
	}
	
	
	
	

	public File getMyFile() {
		return myFile;
	}



	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}



	public String getMyFileFileName() {
		return myFileFileName;
	}



	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}



	public GoodsService getGoodsService() {
		return goodsService;
	}



	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}



	public Goods getGoods() {
		return goods;
	}



	public void setGoods(Goods goods) {
		this.goods = goods;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public List<Goods> getGoodslist() {
		return goodslist;
	}


	public void setGoodslist(List<Goods> goodslist) {
		this.goodslist = goodslist;
	}


	public int getGoodsuserid() {
		return goodsuserid;
	}


	public void setGoodsuserid(int goodsuserid) {
		this.goodsuserid = goodsuserid;
	}


	public PingService getPingService() {
		return pingService;
	}


	public void setPingService(PingService pingService) {
		this.pingService = pingService;
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
