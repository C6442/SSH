package com.softeem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softeem.dao.GoodsCarDAO;
import com.softeem.pojo.GoodsCar;
import com.softeem.service.GoodsCarService;

@Service("goodsCarService")
public class GoodsCarServiceImpl implements GoodsCarService{
	
	private GoodsCarDAO goodsCarDAO;
	
	@Resource(name="goodsCarDAO")
	public void setGoodsCarDAO(GoodsCarDAO goodsCarDAO) {
		this.goodsCarDAO = goodsCarDAO;
	}

	@Override
	public boolean addGoodsCar(GoodsCar gc) {
//		List<GoodsCar> gclist=goodsCarDAO.findAllGoodsCar(gc.getGcuserid());
//		System.out.println(gclist.get(0).getGcgoodsid());
//		//判断有没有相同的物品  如果有则数量相加
//		for(int i=0;i<gclist.size();i++){
//			System.out.println(gclist.get(i).getGcgoodsid());
//			if(gclist.get(i).getGcgoodsid()==gc.getGcgoodsid()){
//				int x=gclist.get(i).getGcnum()+gc.getGcnum();
//				gc.setGcnum(x);
//				boolean f=goodsCarDAO.updateGoodsCar(gc);
//				return f;
//			}
//		}
		
		boolean b=goodsCarDAO.addGoodsCar(gc);
		return b;
	}

	@Override
	public boolean deleteGoodsCar(GoodsCar gc) {
		boolean b=goodsCarDAO.deleteGoodsCar(gc);
		return b;
	}

	@Override
	public GoodsCar findOneGoodsCar(int gcid) {
		GoodsCar gc=goodsCarDAO.findOneGoodsCar(gcid);
		return gc;
	}

	@Override
	public boolean updateGoodsCar(GoodsCar gc) {
		boolean b=goodsCarDAO.updateGoodsCar(gc);
		return  b;
	}

	@Override
	public List<GoodsCar> findAllGoodsCar(int gcuserid) {
		List<GoodsCar> gclist=goodsCarDAO.findAllGoodsCar(gcuserid);
		return gclist;
	}

}
