package com.softeem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softeem.dao.UserDAO;
import com.softeem.pojo.User;
import com.softeem.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO;
	
	
	@Resource(name="userDAO")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean addUser(User user) {
		boolean b=userDAO.addUser(user);
		return b;
	}
	
	@Override
	public boolean addcheck(User user) {
		boolean b=userDAO.addcheck(user);
		return b;
	}
	
	@Override
	public boolean deleteUser(User user) {
		boolean b=userDAO.deleteUser(user);
		return b;
	}

	@Override
	public User findOneUser(int userid) {
		User user=userDAO.findOneUser(userid);
		return user;
	}

	@Override
	public boolean update(User user) {
		boolean b=userDAO.update(user);
		return b;
	}

	@Override
	public int totalPage(int findflag) {
		int totalPage=userDAO.totalPage(findflag);
		return totalPage;
	}

	@Override
	public List<User> fenyeFindUser(int pageNow,int findflag) {
		List<User> userlist=userDAO.fenyeFindUser(pageNow,findflag);
		return userlist;
	}

	@Override
	public User login(User user) {
		User loginuser=userDAO.login(user);
		return loginuser;
	}



}
