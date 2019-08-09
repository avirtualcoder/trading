package com.fosu.trading.serviceDaoImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.fosu.trading.dao.managerDao;
import com.fosu.trading.po.Appeal;
import com.fosu.trading.po.Goods;
import com.fosu.trading.po.UserTb;
import com.fosu.trading.pojo.Calculate;
import com.fosu.trading.pojo.Page;
import com.fosu.trading.pojo.orderAppeal;
import com.fosu.trading.serviceDao.*;

@Service
public class managerServiceImpl implements managerService {
	
   @Resource
	managerDao managerdao;
   @Resource
    UserTb manager;
   @Resource
    Appeal appeal;
   @Resource
   orderAppeal ordaeal;
	@Override  //返回单个用户，用于管理员登录
	public UserTb getUserByTel(String userTel) throws Exception {
		manager = managerdao.getUserByTel(userTel);
		return manager;
	}
	

	
	
	@Override
	public List<UserTb> getAllUser(int role) throws Exception {
		List<UserTb> ulist = new ArrayList<UserTb>();
		ulist = managerdao.getAllUser(role);
		return ulist;
	}
	

	@Override
	public UserTb getUserById(String userId) throws Exception {
		manager = managerdao.getUserById(userId);
		return manager;
	}

	
	@Override
	public List<UserTb> getUserByPage(Page page) throws Exception {
		List<UserTb> ulist = new ArrayList<UserTb>();
		ulist = managerdao.getUserByPage(page);
		return ulist;
	}


	@Override
	public int calculatecount(Calculate cal) throws Exception {
		int num = managerdao.calculatecount(cal);
		return num;
	}


	//通过前端传回来的id（手机号）进行指定删除
	@Override
	public void deleteUser(String userTel) throws Exception{
		managerdao.deleteUser(userTel);
	}

	
	@Override
	public List<Goods> getGoodsByPage(Page page) throws Exception {
		
		List<Goods> glist = new ArrayList<Goods>();
		glist = managerdao.getGoodsByPage(page);
		return glist;
	}


	@Override
	public void updateGoodsStatus(Goods good) throws Exception {
		managerdao.updateGoodsStatus(good);	
	}


	@Override
	public List<Goods> getGoodsByAssign(int role) throws Exception {
		List<Goods> glist = managerdao.getGoodsByAssign(role);
		return glist;
	}


	
	@Override
	public UserTb getUserByAssign(String role) throws Exception {
		manager = managerdao.getUserByAssign(role);
		return manager;
	}


	@Override
	public void updateUserInfo(UserTb user) throws Exception{
		managerdao.updateUserInfo(user);
	}

	
	//申诉管理员
	@Override
	public List<Appeal> getAppealByPage(Page page) throws Exception {
		
		List<Appeal> appealList = managerdao.getAppealByPage(page);
		return appealList;
	}


	@Override
	public orderAppeal getOrderAppeal(int id) throws Exception {
		ordaeal = managerdao.getOrderAppeal(id);
		return ordaeal;
	}


	@Override
	public void updateAppeal(orderAppeal orderappeal) throws Exception {
		managerdao.updateAppeal(orderappeal);
	}


	@Override
	public Appeal getAAppeal(int id) throws Exception {
		appeal = managerdao.getAAppeal(id);
		return appeal;
	}






}
