package com.softeem.service;

import java.util.List;

import com.softeem.pojo.GoodsCar;

public interface GoodsCarService {
	
	//Ôö
	public boolean addGoodsCar(GoodsCar gc);
	
	//É¾
	public boolean deleteGoodsCar(GoodsCar gc);
	
	//¸Ä
	public GoodsCar findOneGoodsCar(int gcid);
	public boolean updateGoodsCar(GoodsCar gc);
	
	
	//²é
	public List<GoodsCar> findAllGoodsCar(int gcuserid);



}
