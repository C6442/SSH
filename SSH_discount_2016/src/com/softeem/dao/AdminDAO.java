package com.softeem.dao;

import com.softeem.pojo.Admin;

public interface AdminDAO {
	
	public Admin login(Admin admin);
	
	public boolean saveAdmin(Admin admin);
	
	public boolean deleteAdmin(Admin admin);
	

}
