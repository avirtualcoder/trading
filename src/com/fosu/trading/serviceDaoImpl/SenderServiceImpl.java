package com.fosu.trading.serviceDaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fosu.trading.dao.SenderMapper;
import com.fosu.trading.po.Delivery;
import com.fosu.trading.po.Sender;
import com.fosu.trading.pojo.MyTask;
import com.fosu.trading.pojo.Task;
import com.fosu.trading.serviceDao.SenderService;

@Service
public class SenderServiceImpl implements SenderService{

	@Resource
	SenderMapper senderMapper;
	
	@Override
	public Sender findSenderByUseId(String userId) {
		Sender sender=new Sender();
		sender=senderMapper.findSenderByUserId(userId);
		return sender;
	}

	@Override
	public void insertSender(Sender sender) {
		try {
			senderMapper.insertSender(sender);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<MyTask> findMyTask(String senderId) {
		// TODO Auto-generated method stub
		List<MyTask> myList=new ArrayList<MyTask>();
		myList=senderMapper.findMyTask(senderId);
		return myList;
	}

	@Override
	public List<Task> findTaskList() {
		List<Task> taskList=new ArrayList<Task>();
		taskList=senderMapper.findTaskList();
		return taskList;
	}

	@Override
	public void addDelivery(String senderId, String orderId) {
		senderMapper.addDelivery(senderId,orderId);
		
	}

}
