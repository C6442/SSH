package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.Goods;

public interface GoodsDAO {
	
	//������Ʒ
	public boolean addGoods(Goods goods);
	
	//�޸�
	public Goods findOneGoods(int gid);
	public boolean updateGoods(Goods goods);
	
	//ɾ��
	public boolean deleteGoods(Goods goods);
	
	//��ѯ��ҳ
	public int totalPageGoods(String goodscategory);
	public List<Goods> fenyeGoods(int pageNow,String goodscategory);
	
	//��ѯ�Լ���
	public int totalPage(int goodsuserid);
	public List<Goods> findAllGoods(int pageNow,int goodsuserid);
	//ģ����ѯ
	public List<Goods> findSameGoods(String name);
}
