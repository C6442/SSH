package com.softeem.service;

import java.util.List;

import com.softeem.pojo.User;

public interface UserService {
	//��
	public boolean addUser(User user);
	//ע����
	public boolean addcheck(User user);
	//ɾ
	public boolean deleteUser(User user);
	
	//��¼
	public User login(User user);
	
	//��
	public User findOneUser(int userid);
	public boolean update(User user);
	
	
	//��  ��ҳ
	public int totalPage(int findflag);
	public List<User> fenyeFindUser(int pageNow,int findflag);

}
