package com.softeem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.softeem.dao.ReplyDAO;
import com.softeem.pojo.Reply;

public class ReplyDAOImpl extends HibernateDaoSupport implements ReplyDAO{

	@Override
	public boolean addReply(Reply reply) {
		try {
			getHibernateTemplate().save(reply);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteReply(Reply reply) {
		try {
			getHibernateTemplate().delete(reply);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Reply findOneReply(int rid) {
		Reply reply=(Reply) this.getSession().get(Reply.class, rid);
		return reply;
	}

	@Override
	public boolean update(Reply reply) {
		try {
			getHibernateTemplate().update(reply);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int totalPage(int goodsid) {
		Criteria cr=this.getSession().createCriteria(Reply.class);
		cr.add(Restrictions.eq("rpinggoodsid", goodsid));
		int total=cr.list().size();
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<Reply> fenyeReply(int goodsid, int pageNow) {
		Query query=this.getSession().createQuery("from Reply where rpinggoodsid=?");
		
		query.setInteger(0, goodsid);
		List<Reply> replylist=query.list();
		return replylist;
	}

	@Override
	public int totalPageByUser(int ruserid) {
		Criteria cr=this.getSession().createCriteria(Reply.class);
		cr.add(Restrictions.eq("ruserid", ruserid));
		int total=cr.list().size();
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<Reply> findAllReply(int ruserid, int pageNow) {
		Query query=this.getSession().createQuery("from Reply where ruserid=?");
		
		query.setInteger(0, ruserid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		List<Reply> replylist=query.list();
		return replylist;
	}

}
