package com.softeem.dao.impl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.softeem.dao.PingDAO;
import com.softeem.pojo.Ping;

@Repository("pingDAO")
public class PingDAOImpl extends HibernateDaoSupport implements PingDAO{

	@Override
	public boolean addPing(Ping ping) {
		try {
			getHibernateTemplate().save(ping);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePing(Ping ping) {
		try {
			getHibernateTemplate().delete(ping);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Ping findOnePing(int pid) {
		System.out.println("pingDAO");
		Ping ping=(Ping) this.getSession().get(Ping.class, pid);
		return ping;
	}

	@Override
	public boolean update(Ping ping) {
		try {
			getHibernateTemplate().update(ping);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int totalPage(int ordergoodsid) {
		Criteria cr=this.getSession().createCriteria(Ping.class);
		cr.add(Restrictions.eq("pgoodsid", ordergoodsid));
		int total=cr.list().size();
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<Ping> fenyePing(int ordergoodsid, int pageNow) {
		Query query=this.getSession().createQuery("from Ping where pgoodsid=?");
		
		query.setInteger(0, ordergoodsid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		List<Ping> pinglist=query.list();
		return pinglist;
	}

	@Override
	public int totalPageByUser(int puserid) {
		Criteria cr=this.getSession().createCriteria(Ping.class);
		cr.add(Restrictions.eq("puserid", puserid));
		int total=cr.list().size();
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<Ping> findAllPing(int puserid, int pageNow) {
		Query query=this.getSession().createQuery("from Ping where puserid=?");
		
		query.setInteger(0, puserid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		List<Ping> pinglist=query.list();
		return pinglist;
	}

}
