package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.OrderList;



public interface OrderListDAO {
	//��
	public boolean addOrderList(OrderList order);
	
	//ɾ
	public boolean deleteOrderList(OrderList order);
	
	//��
	public OrderList findOneOrderList(int orderid);
	public boolean updateOrderList(OrderList order);
	
	
	//��
	public int totalPage(int orderuserid);
	public List<OrderList> findAllOrderList(int orderuserid,int pageNow);

	//��
	public int totalPageO(int orderselluserid);
	public List<OrderList> findOrderList(int orderselluserid,int pageNow);
}
