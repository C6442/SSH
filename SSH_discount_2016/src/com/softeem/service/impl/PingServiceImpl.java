package com.softeem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.softeem.dao.PingDAO;
import com.softeem.pojo.Ping;
import com.softeem.service.PingService;

@Service("pingService")
public class PingServiceImpl implements PingService{
	
	private PingDAO pingDAO;
	
	@Resource(name="pingDAO")
	public void setPingDAO(PingDAO pingDAO) {
		this.pingDAO = pingDAO;
	}

	@Override
	public boolean addPing(Ping ping) {
		boolean b=pingDAO.addPing(ping);
		return b;
	}

	@Override
	public boolean deletePing(Ping ping) {
		boolean b=pingDAO.deletePing(ping);
		return b;
	}

	@Override
	public Ping findOnePing(int pid) {
		Ping ping=pingDAO.findOnePing(pid);
		return ping;
	}

	@Override
	public boolean update(Ping ping) {
		boolean b=pingDAO.update(ping);
		return b;
	}

	@Override
	public int totalPage(int ordergoodsid) {
		int totalPage=pingDAO.totalPage(ordergoodsid);
		return totalPage;
	}

	@Override
	public List<Ping> fenyePing(int ordergoodsid, int pageNow) {
		List<Ping> pinglist=pingDAO.fenyePing(ordergoodsid, pageNow);
		return pinglist;
	}

	@Override
	public int totalPageByUser(int puserid) {
		int totalPageByUser=pingDAO.totalPageByUser(puserid);
		return totalPageByUser;
	}

	@Override
	public List<Ping> findAllPing(int puserid, int pageNow) {
		List<Ping> pinglist=pingDAO.findAllPing(puserid, pageNow);
		return pinglist;
	}

}
