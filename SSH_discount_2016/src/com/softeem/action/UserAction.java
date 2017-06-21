package com.softeem.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.softeem.pojo.User;
import com.softeem.service.UserService;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	private UserService userService;
	private User user;
	
	
	private int pageNow;
	private int totalPage;
	
	private List<User> userlist;
	
	private int findflag; //����������������ʲô��
	
	private int gold;//��ֵ��Ǯ
	
	
	//��
	public String saveUser(){
		boolean flag=userService.addcheck(user);
		if(flag){
			boolean b=userService.addUser(user);
			return b?"saveUser":"error";
		}else{
			return "regerror";	
		}
		
		
	}
	
	//��¼
	public String login(){
		user=userService.login(user);
		if(user!=null&&(user.getUserflag()==3||user.getUserflag()==1)){
			
			ActionContext.getContext().getSession().put("loginuser", user);
			return "loginsuccess";
		}else{
			
			return "loginerror";
		}
	}
	//�˳���¼
	public String loginout(){
		ActionContext.getContext().getSession().remove("loginuser");
		return "loginout";
	
	}
	
	//��һ��
	public String findOneUser(){
		user=userService.findOneUser(user.getUserid());
		return "findOneUser";
	}
	
	//�̼Ҳ�һ���û�2016.3.14
	
	public String sellFindOneUser(){
		user=userService.findOneUser(user.getUserid());
		return "sellFindOneUser";
	}
	//��
	public String updateUser(){
		boolean b=userService.update(user);
		return b?"updateUser":"error";
		
	}
	
	//��ֵ
	public String chongzhi(){
		System.out.println(user.getUserid());
		user.setUserbalance(user.getUserbalance()+gold);
		System.out.println(user.getUserid());
		boolean b=userService.update(user);
		return b?"chongzhi":"error";
	}
	
	
	//ɾ   ����û�õ�
	public String delUser(){
		boolean b=userService.deleteUser(user);
		return b?"delUser":"error";
	}
	
	
	//��  ��ҳ  ����û�õ�
	public String fenyeUser(){
//		System.out.println(pageNow);
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

	public int getFindflag() {
		return findflag;
	}

	public void setFindflag(int findflag) {
		this.findflag = findflag;
	}
	
	
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
	

}
