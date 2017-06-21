package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.User;

public interface UserDAO {
	//ע��
	public boolean addUser(User user);
	//ע����
	public boolean addcheck(User user);
	//��¼
	public User login(User user);
	
	//ɾ
	public boolean deleteUser(User user);
	
	
	//��
	public User findOneUser(int userid);
	public boolean update(User user);
	
	
	//��  ��ҳ
	public int totalPage(int findflag);
	public List<User> fenyeFindUser(int pageNow,int findflag);

}
