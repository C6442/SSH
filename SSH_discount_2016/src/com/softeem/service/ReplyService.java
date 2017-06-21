package com.softeem.service;

import java.util.List;

import com.softeem.pojo.Reply;

public interface ReplyService {
	//��ӻظ�
	public boolean addReply(Reply reply);
	//ɾ���ظ�
	public boolean deleteReply(Reply reply);
	
	//��һ���ظ�
	public Reply findOneReply(int rid);
	//�޸Ļظ�
	public boolean update(Reply reply);
	
	//����Ʒҳ�濴�ظ�
	public int totalPage(int goodsid);//������Ʒ��id
	public List<Reply> fenyeReply(int goodsid,int pageNow);
	
	//�鿴�Լ������Ļظ�
	public int totalPageByUser(int ruserid);//����id
	public List<Reply> findAllReply(int ruserid,int pageNow);

}
