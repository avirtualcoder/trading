package com.fosu.trading.serviceDao;

import java.util.List;

import com.fosu.trading.po.Delivery;
import com.fosu.trading.po.Sender;
import com.fosu.trading.pojo.MyTask;
import com.fosu.trading.pojo.Task;

public interface SenderService {

	public Sender findSenderByUseId(String userId);

	public void insertSender(Sender sender);

	public List<MyTask> findMyTask(String senderId);

	public List<Task> findTaskList();

	public void addDelivery(String senderId, String orderId);
	
}
