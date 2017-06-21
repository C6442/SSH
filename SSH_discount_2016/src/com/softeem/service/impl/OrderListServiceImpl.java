package com.softeem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;





import com.softeem.dao.OrderListDAO;
import com.softeem.dao.impl.OrderListDAOImpl;
import com.softeem.pojo.OrderList;
import com.softeem.service.OrderListService;


public class OrderListServiceImpl implements OrderListService{
	
	private OrderListDAO orderListDAO;
	
	
	public void setOrderListDAO(OrderListDAO orderListDAO) {
		this.orderListDAO = orderListDAO;
	}

	@Override
	public boolean addOrderList(OrderList order) {
		System.out.println("orderservice");
		boolean b=orderListDAO.addOrderList(order);
		return b;
	}

	@Override
	public boolean deleteOrderList(OrderList order) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int totalPage(int orderuserid) {
		int totalPage=orderListDAO.totalPage(orderuserid);
		return totalPage;
	}
	
	@Override
	public List<OrderList> findAllOrderList(int orderuserid,int pageNow) {
		List<OrderList> orderlist=orderListDAO.findAllOrderList(orderuserid,pageNow);
		return orderlist;
	}

	@Override
	public OrderList findOneOrderList(int orderid) {
		OrderList order=orderListDAO.findOneOrderList(orderid);
		return order;
	}

	

	@Override
	public boolean updateOrderList(OrderList order) {
		boolean b=orderListDAO.updateOrderList(order);
		return b;
	}

	@Override
	public int totalPageO(int orderselluserid) {
		int totalPage=orderListDAO.totalPageO(orderselluserid);
		return totalPage;
	}

	@Override
	public List<OrderList> findOrderList(int orderselluserid, int pageNow) {
		List<OrderList> orderlist=orderListDAO.findOrderList(orderselluserid,pageNow);
		return orderlist;
	}

}
