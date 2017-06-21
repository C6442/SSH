package com.softeem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.softeem.dao.GoodsCarDAO;
import com.softeem.pojo.GoodsCar;

@Repository("goodsCarDAO")
public class GoodsCarDAOImpl extends HibernateDaoSupport implements GoodsCarDAO{

	@Override
	public boolean addGoodsCar(GoodsCar gc) {
		try {
			getHibernateTemplate().save(gc);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteGoodsCar(GoodsCar gc) {
		try {
			getHibernateTemplate().delete(gc);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public GoodsCar findOneGoodsCar(int gcid) {
		GoodsCar gc=(GoodsCar) this.getSession().get(GoodsCar.class, gcid);
		return gc;
	}

	@Override
	public boolean updateGoodsCar(GoodsCar gc) {
		try {
			getHibernateTemplate().update(gc);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<GoodsCar> findAllGoodsCar(int gcuserid) {
		Criteria cr= this.getSession().createCriteria(GoodsCar.class);
		cr.add(Restrictions.eq("gcuserid", gcuserid));
		List<GoodsCar> gclist=cr.list();
		return gclist;
	}

}
