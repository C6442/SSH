package com.softeem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.softeem.dao.GoodsDAO;
import com.softeem.pojo.Goods;

@Repository("goodsDAO")
public class GoodsDAOImpl extends HibernateDaoSupport implements GoodsDAO{

	@Override
	public boolean addGoods(Goods goods) {
		try {
			getHibernateTemplate().save(goods);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Override
	//查一件商品
	public Goods findOneGoods(int gid) {
		Goods goods=(Goods) this.getSession().get(Goods.class, gid);
		return goods;
	}

	@Override
	public boolean updateGoods(Goods goods) {
		try {
			getHibernateTemplate().update(goods);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteGoods(Goods goods) {
		try {
			getHibernateTemplate().delete(goods);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int totalPageGoods(String goodscategory) {
		Criteria goodscr=this.getSession().createCriteria(Goods.class);
		if(goodscategory!=null&&!"".equals(goodscategory)){
			goodscr.add(Restrictions.eq("goodscategory", goodscategory));
		}
		int total=goodscr.list().size();
		//每页多少个
		int totalPage=(total-1)/12+1;
		return totalPage;
	}

	@Override
	public List<Goods> fenyeGoods(int pageNow, String goodscategory) {
		
		
		if(goodscategory!=null&&!"".equals(goodscategory)){
			Query query=this.getSession().createQuery("from Goods where goodscategory=?  order by goodsid desc");
			query.setString(0, goodscategory);
			query.setFirstResult((pageNow-1)*12);
			query.setMaxResults(12);
			
			List<Goods> goodslist=query.list();
			return goodslist;
		}else{
			Query query=this.getSession().createQuery("from Goods order by goodsid desc");
			query.setFirstResult((pageNow-1)*12);
			query.setMaxResults(12);
			
			List<Goods> goodslist=query.list();
			return goodslist;
		}
		
	}

	@Override
	public int totalPage(int goodsuserid) {
		Criteria goodscr=this.getSession().createCriteria(Goods.class);
		
		goodscr.add(Restrictions.eq("goodsuserid", goodsuserid));
		int total=goodscr.list().size();
		//每页多少个
		int totalPage=(total-1)/10+1;
		return totalPage;
	}

	@Override
	public List<Goods> findAllGoods(int pageNow, int goodsuserid) {
		Query query=this.getSession().createQuery("from Goods where goodsuserid=?");
		query.setInteger(0, goodsuserid);
		query.setFirstResult((pageNow-1)*10);
		query.setMaxResults(10);
		
		List<Goods> goodslist=query.list();
		return goodslist;
	}

	@Override
	public List<Goods> findSameGoods(String name) {
		Query query=this.getSession().createQuery("from Goods as g where g.goodsname like :name");
		query.setString("name", "%"+name+"%");
		List<Goods> goodslist=query.list();
		return goodslist;
	}

}
