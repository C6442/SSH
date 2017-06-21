package com.softeem.service;

import java.util.List;

import com.softeem.pojo.User;

public interface UserService {
	//Ôö
	public boolean addUser(User user);
	//×¢²á¼ì²â
	public boolean addcheck(User user);
	//É¾
	public boolean deleteUser(User user);
	
	//µÇÂ¼
	public User login(User user);
	
	//¸Ä
	public User findOneUser(int userid);
	public boolean update(User user);
	
	
	//²é  ·ÖÒ³
	public int totalPage(int findflag);
	public List<User> fenyeFindUser(int pageNow,int findflag);

}
