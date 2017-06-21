package com.softeem.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.softeem.pojo.GoodsCar;
import com.softeem.service.GoodsCarService;

@Controller("goodsCarAction")
@Scope("prototype")
public class GoodsCarAction {
	
	private GoodsCarService goodsCarService;
	private GoodsCar goodsCar;
	
	private List<GoodsCar> gclist;
	private int gcuserid;
	
	private int goodsid;
	//���빺�ﳵ
	public String saveGoodsCar(){
//		System.out.println(goodsCar.getGcgoodsid());
		
		List<GoodsCar> gclist=goodsCarService.findAllGoodsCar(goodsCar.getGcuserid());
//		System.out.println(gclist.get(0).getGcgoodsid());
		//�ж���û����ͬ����Ʒ  ��������������
		for(int i=0;i<gclist.size();i++){
//			System.out.println(gclist.get(i).getGcgoodsid());
			if(gclist.get(i).getGcgoodsid()==goodsCar.getGcgoodsid()){
				int x=gclist.get(i).getGcnum()+goodsCar.getGcnum();
				goodsCar.setGcnum(x);
				goodsCar.setGcid(gclist.get(i).getGcid());
//				System.out.println(goodsCar.getGcid());
				boolean f=goodsCarService.updateGoodsCar(goodsCar);
				return f?"saveGoodsCar":"error";
			}
		}
		boolean b=goodsCarService.addGoodsCar(goodsCar);
		return b?"saveGoodsCar":"error";
	}
	
	//�鿴���ﳵ�ķ���
	public String findAllGoodsCar(){
		System.out.println(gcuserid);
		gclist=goodsCarService.findAllGoodsCar(gcuserid);
		return "findAllGoodsCar";
	}
	
	//����ҳ��
	public String findOneGoodsCar(){
		System.out.println(goodsCar.getGcid());
		goodsCar=goodsCarService.findOneGoodsCar(goodsCar.getGcid());
		ActionContext.getContext().getSession().put("goodsCar", goodsCar);
		return "findOneGoodsCar";
	}
	
	//ɾ�����ﳵ�Ķ���
	public String deleteGoodsCar(){
		boolean b=goodsCarService.deleteGoodsCar(goodsCar);
		return b?"deleteGoodsCar":"error";
		
	}
	
	
	
	public GoodsCarService getGoodsCarService() {
		return goodsCarService;
	}

	public void setGoodsCarService(GoodsCarService goodsCarService) {
		this.goodsCarService = goodsCarService;
	}

	public GoodsCar getGoodsCar() {
		return goodsCar;
	}

	public void setGoodsCar(GoodsCar goodsCar) {
		this.goodsCar = goodsCar;
	}

	public List<GoodsCar> getGclist() {
		return gclist;
	}

	public void setGclist(List<GoodsCar> gclist) {
		this.gclist = gclist;
	}

	

	public int getGcuserid() {
		return gcuserid;
	}

	public void setGcuserid(int gcuserid) {
		this.gcuserid = gcuserid;
	}

	public int getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	
	

}
