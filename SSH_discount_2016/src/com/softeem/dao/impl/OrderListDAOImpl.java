package com.softeem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.softeem.dao.OrderListDAO;

import com.softeem.pojo.OrderList;
import com.softeem.pojo.User;


public class OrderListDAOImpl   extends HibernateDaoSupport implements OrderListDAO{

	@Override
	public boolean addOrderList(OrderList order) {
//		System.out.println("orderDAOimpl");
		try {
			getHibernateTemplate().save(order);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteOrderList(OrderList order) {
		try {
			getHibernateTemplate().delete(order);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public int totalPage(int orderuserid) {
		Criteria order=this.getSession().createCriteria(OrderList.class);
		order.add(Restrictions.eq("orderuserid", orderuserid));
		int total=order.list().size();
		//每页多少个
		int totalPage=(total-1)/10+1;
		return totalPage;
	}
	
	@Override
	public List<OrderList> findAllOrderList(int orderuserid,int pageNow) {
		Query query=this.getSession().createQuery("from OrderList where orderuserid=?");
		query.setInteger(0, orderuserid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		
		List<OrderList> orderlist=query.list();
		return orderlist;
	}
	
	//查一个订单内容
	@Override
	public OrderList findOneOrderList(int orderid) {
		OrderList orderlist=(OrderList) this.getSession().get(OrderList.class, orderid);
		return orderlist;
	}

	

	@Override
	public boolean updateOrderList(OrderList order) {
		try {
			getHibernateTemplate().update(order);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int totalPageO(int orderselluserid) {
		Criteria order=this.getSession().createCriteria(OrderList.class);
		order.add(Restrictions.eq("orderselluserid", orderselluserid));
		int total=order.list().size();
		//每页多少个
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<OrderList> findOrderList(int orderselluserid, int pageNow) {
		Query query=this.getSession().createQuery("from OrderList where orderselluserid=?");
		query.setInteger(0, orderselluserid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		
		List<OrderList> orderlist=query.list();
		return orderlist;
	}
	

}
