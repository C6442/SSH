package com.softeem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.softeem.dao.UserDAO;
import com.softeem.pojo.User;

@Repository("userDAO")
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	//增
	public boolean addUser(User user) {
		try {
			getHibernateTemplate().save(user);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//注册检测
	public boolean addcheck(User user) {
		Criteria cr=this.getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("username",user.getUsername() ));
		User uuser=(User) cr.uniqueResult();
		if(uuser==null){
			return true;
		}else{
			return false;
		}
		
	}
	//删
	public boolean deleteUser(User user) {
		try {
			getHibernateTemplate().delete(user);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//改,先查单个,在修改
	@Override
	public User findOneUser(int userid) {
		User user=(User) this.getSession().get(User.class, userid);
		return user;
	}

	@Override
	public boolean update(User user) {
		try {
			getHibernateTemplate().update(user);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int totalPage(int findflag) {
//		int total=(Integer) this.getSession().createSQLQuery("select count(*) from tb_user").uniqueResult();
		Criteria cr=this.getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("userflag", findflag));
		
		int total=cr.list().size();
		int totalPage=(total-1)/5+1;
		return totalPage;
	}

	@Override
	public List<User> fenyeFindUser(int pageNow,int findflag) {
		Query query=this.getSession().createQuery("from User where userflag=? order by userid");
		
		query.setInteger(0, findflag);
		query.setFirstResult((pageNow-1)*5);
		query.setMaxResults(5);
		List<User> userlist=query.list();
		return userlist;
	}

	@Override
	public User login(User user) {
		Criteria cr=this.getSession().createCriteria(User.class);
		cr.add(Restrictions.eq("username",user.getUsername() ));
		cr.add(Restrictions.eq("userpass",user.getUserpass() ));
		User loginuser=(User) cr.uniqueResult();
		return loginuser;
	}

	
	
	

}
