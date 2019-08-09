package com.fosu.trading.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fosu.trading.po.Delivery;
import com.fosu.trading.po.Sender;
import com.fosu.trading.pojo.MyTask;
import com.fosu.trading.pojo.Task;

@Component
public interface SenderMapper {

	public  Sender findSenderByUserId(String userId);

	public void insertSender(Sender sender);

	public List<Task> findTaskList();

	public void addDelivery(String senderId, String orderId);

	public List<MyTask> findMyTask(String senderId);
	
}
