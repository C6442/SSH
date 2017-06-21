package com.softeem.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.softeem.dao.AdminDAO;
import com.softeem.pojo.Admin;

@Repository("adminDAO")
public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO{

	@Override
	public Admin login(Admin admin) {
		Criteria cr=this.getSession().createCriteria(Admin.class);
		cr.add(Restrictions.eq("adminName",admin.getAdminName() ));
		cr.add(Restrictions.eq("adminPass",admin.getAdminPass() ));
		Admin loginadmin=(Admin) cr.uniqueResult();
		return loginadmin;
	}

	@Override
	public boolean saveAdmin(Admin admin) {
		try {
			getHibernateTemplate().save(admin);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteAdmin(Admin admin) {
		try {
			getHibernateTemplate().delete(admin);
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
