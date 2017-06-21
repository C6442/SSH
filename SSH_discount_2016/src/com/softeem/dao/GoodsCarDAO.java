package com.softeem.dao;

import java.util.List;

import com.softeem.pojo.GoodsCar;

public interface GoodsCarDAO {
	
	//��
	public boolean addGoodsCar(GoodsCar gc);
	
	//ɾ
	public boolean deleteGoodsCar(GoodsCar gc);
	
	//��
	public GoodsCar findOneGoodsCar(int gcid);
	public boolean updateGoodsCar(GoodsCar gc);
	
	
	//��
	public List<GoodsCar> findAllGoodsCar(int gcuserid);

}
