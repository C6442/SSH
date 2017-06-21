package com.softeem.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.softeem.pojo.Goods;
import com.softeem.pojo.GoodsCar;
import com.softeem.pojo.OrderList;
import com.softeem.pojo.User;
import com.softeem.service.GoodsCarService;
import com.softeem.service.GoodsService;
import com.softeem.service.OrderListService;
import com.softeem.service.UserService;
import com.softeem.service.impl.OrderListServiceImpl;


public class OrderListAction extends  ActionSupport{
	
	private OrderListService orderListSerivce;
	private GoodsCarService goodsCarService;//用来做添加订单是删除购物车里面的内容
	private GoodsCar goodsC;//用来做添加订单是删除购物车里面的内容
	private UserService userService;//扣去钱
	private User user;
	private GoodsService goodsService;
	private Goods goods;
	
	private OrderList order;
	
	private int pageNow;
	private int totalPage;
	
	private List<OrderList> orderlist;
	
	private int userid; //根据这个来看查的是什么人,可以从登录的人中获得
	
	//添加订单
	public String saveOrder(){
		System.out.println("jijid");
		System.out.println(order.getOrderaddress()+order.getOrdergoodsprice());
		System.out.println(orderListSerivce);
		boolean b=orderListSerivce.addOrderList(order);
		
		if(b){
			goodsCarService.deleteGoodsCar(goodsC);
			//获得购买者的信息
			user=userService.findOneUser(order.getOrderuserid());
			user.setUserbalance(user.getUserbalance()-order.getOrdergoodsprice());
			userService.update(user);
		}
		
		return b?"saveOrder":"error";
	}
	
	//查看订单  ，分页,用户
	public String findAllOrder(){
		if(pageNow<1){
			pageNow=1;
		}
		totalPage=orderListSerivce.totalPage(order.getOrderuserid());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		orderlist=orderListSerivce.findAllOrderList(order.getOrderuserid(), pageNow);
		
		return "findAllOrder";
	}
	//查看订单  ，分页，商家
		public String findOrder(){
			if(pageNow<1){
				pageNow=1;
			}
			totalPage=orderListSerivce.totalPageO(order.getOrderselluserid());
			if(pageNow>totalPage){
				pageNow=totalPage;
			}
			orderlist=orderListSerivce.findOrderList(order.getOrderselluserid(), pageNow);
			
			return "findOrder";
		}
		
	//商家修改状态为已发货
	public String updateOrder2(){
		order=orderListSerivce.findOneOrderList(order.getOrderid());
		order.setOrderstate(2);
		boolean b=orderListSerivce.updateOrderList(order);
		return b?"updateOrder2":"error";
		
	}
	
	//买家确认收货  这时卖家应能受到货款
	public String updateOrder3(){
		order=orderListSerivce.findOneOrderList(order.getOrderid());
		order.setOrderstate(3);
		boolean b=orderListSerivce.updateOrderList(order);
		if(b){
			user=userService.findOneUser(order.getOrderselluserid());
			user.setUserbalance(user.getUserbalance()+order.getOrdergoodsprice());
			boolean q=userService.update(user);
			return q?"updateOrder3":"error";
		}else{
			return "error";
		}
		
		
	}
	
	
	
	
	//查看一个订单中的商品
	public String findOrderGoods(){
		goods=goodsService.findOneGoods(order.getOrdergoodsid());
		return "findOrderGoods";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public OrderListService getOrderListSerivce() {
		return orderListSerivce;
	}

	public void setOrderListSerivce(OrderListService orderListSerivce) {
		this.orderListSerivce = orderListSerivce;
	}

	public OrderList getOrder() {
		return order;
	}

	public void setOrder(OrderList order) {
		this.order = order;
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

	public List<OrderList> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<OrderList> orderlist) {
		this.orderlist = orderlist;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}



	public GoodsCarService getGoodsCarService() {
		return goodsCarService;
	}



	public void setGoodsCarService(GoodsCarService goodsCarService) {
		this.goodsCarService = goodsCarService;
	}



	public GoodsCar getGoodsC() {
		return goodsC;
	}



	public void setGoodsC(GoodsCar goodsC) {
		this.goodsC = goodsC;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public GoodsService getGoodsService() {
		return goodsService;
	}

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	
	
	
	

}
