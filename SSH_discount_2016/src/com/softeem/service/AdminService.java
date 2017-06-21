package com.softeem.service;

import com.softeem.pojo.Admin;

public interface AdminService {
	
	
	public Admin login(Admin admin);
	
	public boolean saveAdmin(Admin admin);
	
	public boolean deleteAdmin(Admin admin);

}
