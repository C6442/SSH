package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.Ping;

public interface PingDAO {
	
	//�������
	public boolean addPing(Ping ping);
	//ɾ������
	public boolean deletePing(Ping ping);
	
	//��һ������
	public Ping findOnePing(int pid);
	//�޸�����
	public boolean update(Ping ping);
	
	//����Ʒҳ�濴����
	public int totalPage(int ordergoodsid);//������Ʒ��id
	public List<Ping> fenyePing(int ordergoodsid,int pageNow);
	
	//�鿴�Լ�����������
	public int totalPageByUser(int puserid);//������Ʒ��id
	public List<Ping> findAllPing(int puserid,int pageNow);


}
