package com.fosu.trading.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fosu.trading.po.Appeal;
import com.fosu.trading.po.Goods;
import com.fosu.trading.po.UserTb;
import com.fosu.trading.pojo.Calculate;
import com.fosu.trading.pojo.Page;
import com.fosu.trading.pojo.orderAppeal;


@Component
public interface managerDao {
	
	//超级管理员的数据访问
	public UserTb getUserByTel(String userTel)throws Exception;
	public UserTb getUserById(String userId)throws Exception;
	public List<UserTb> getAllUser(int role) throws Exception;
	public List<UserTb> getUserByPage(Page page) throws Exception;	
	public int calculatecount(Calculate cal)throws Exception;
	public UserTb getUserByAssign(String role)throws Exception;
	public void deleteUser(String userTel)throws Exception;
	public void updateUserInfo(UserTb user)throws Exception;
	
	//商品审核管理员
	public List<Goods> getGoodsByPage(Page page) throws Exception;
	public void updateGoodsStatus(Goods good)throws Exception;
	public List<Goods> getGoodsByAssign(int role)throws Exception;
	
	//申诉管理员
	public List<Appeal> getAppealByPage(Page page)throws Exception;
	public Appeal getAAppeal(int id)throws Exception;
	public orderAppeal getOrderAppeal(int id)throws Exception;
	public void updateAppeal(orderAppeal orderappeal)throws Exception;
}
