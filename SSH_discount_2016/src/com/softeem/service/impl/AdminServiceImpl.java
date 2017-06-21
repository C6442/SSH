package com.softeem.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softeem.dao.AdminDAO;
import com.softeem.pojo.Admin;
import com.softeem.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	private AdminDAO adminDAO;
	
	@Resource(name="adminDAO")
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	public Admin login(Admin admin) {
		Admin loginadmin=adminDAO.login(admin);
		return loginadmin;
	}

	@Override
	public boolean saveAdmin(Admin admin) {
		boolean b=adminDAO.saveAdmin(admin);
		return b;
	}

	@Override
	public boolean deleteAdmin(Admin admin) {
		boolean b=adminDAO.deleteAdmin(admin);
		return b;
	}

}
