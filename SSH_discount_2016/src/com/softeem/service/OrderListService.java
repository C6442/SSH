package com.softeem.service;

import java.util.List;

import com.softeem.pojo.OrderList;

public interface OrderListService {
	
	//增
	public boolean addOrderList(OrderList order);
	
	//删
	public boolean deleteOrderList(OrderList order);
	
	//改
	public OrderList findOneOrderList(int orderid);
	public boolean updateOrderList(OrderList order);
	
	
	//用户查
	public int totalPage(int orderuserid);
	public List<OrderList> findAllOrderList(int orderuserid,int pageNow);
	
	//查
	public int totalPageO(int orderselluserid);
	public List<OrderList> findOrderList(int orderselluserid,int pageNow);
}
