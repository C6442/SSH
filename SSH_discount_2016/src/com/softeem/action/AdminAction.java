package com.softeem.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.softeem.pojo.Admin;
import com.softeem.pojo.User;
import com.softeem.service.AdminService;
import com.softeem.service.UserService;

@Controller("adminAction")
@Scope("prototype")
public class AdminAction {
	
	private AdminService adminService;
	private Admin admin;
	
	private UserService userService;
	private User user;
	//��ѯδ��˵��û�
	private int pageNow;//��ѯ�ĵ�ǰҳ��
	private int totalPage; //�ܵ�ҳ��
	
	private List<User> userlist;  //��ѯ���û��ļ���
	
	
	
	//����Ա��¼
	public String login(){
		admin=adminService.login(admin);
		if(admin!=null){
			return "adminlogin";
		}
		return "error";
	}
	
	//��ѯ�����Ϊ(ע��)�̻����û�
	public String pass(){
		user=userService.findOneUser(user.getUserid());
		user.setUserflag(3);
		boolean b=userService.update(user);
		
		return b?"pass":"error";
	}
	
	public String nopass(){
		user=userService.findOneUser(user.getUserid());
		user.setUserflag(0);
		boolean b=userService.update(user);
		
		return b?"nopass":"error";
	}
	
	//��  ��ҳ
	public String fenyeUser(){
//			System.out.println(pageNow);
		if(pageNow<1){
			pageNow=1;
		}
		System.out.println(user.getUserflag());
		totalPage=userService.totalPage(user.getUserflag());
		if(pageNow>totalPage){
			pageNow=totalPage;
		}
		
		userlist=userService.fenyeFindUser(pageNow,user.getUserflag());
		
		if(user.getUserflag()==2){
			return "findAllNotAudited";
		}
		return "fenyeUser";
		
	}
	
	
	//ɾ
	public String delUser(){
		boolean b=userService.deleteUser(user);
		return b?"delUser":"error";
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	
	
	
	
	
	

}
