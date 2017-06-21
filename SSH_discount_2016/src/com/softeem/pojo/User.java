package com.softeem.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_user")
public class User {
	private int userid;//�û�Id  ������
	private String username;
	private String userpass;
	private double userbalance;//���
	private String usertel;//�ֻ�����
	private String useraddress; //�û��ջ���ַ
	
	private int userflag;//Ȩ��
//	private String useraddCar;//��ӹ��ﳵ

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
public User(int userid, String username, String userpass, double userbalance,
		String usertel, String useraddress, int userflag) {
	super();
	this.userid = userid;
	this.username = username;
	this.userpass = userpass;
	this.userbalance = userbalance;
	this.usertel = usertel;
	this.useraddress = useraddress;
	this.userflag = userflag;
}

@Id
@GeneratedValue
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
@Column(unique=true)
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpass() {
	return userpass;
}
public void setUserpass(String userpass) {
	this.userpass = userpass;
}
public double getUserbalance() {
	return userbalance;
}
public void setUserbalance(double userbalance) {
	this.userbalance = userbalance;
}
public String getUsertel() {
	return usertel;
}
public void setUsertel(String usertel) {
	this.usertel = usertel;
}
public String getUseraddress() {
	return useraddress;
}
public void setUseraddress(String useraddress) {
	this.useraddress = useraddress;
}
public int getUserflag() {
	return userflag;
}
public void setUserflag(int userflag) {
	this.userflag = userflag;
}
	
	
	
	
	
	 

}
