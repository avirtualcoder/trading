package com.fosu.trading.serviceDaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import com.fosu.trading.dao.SellOrderMapper;
import com.fosu.trading.po.OrderTb;
import com.fosu.trading.pojo.SellerOrder;
import com.fosu.trading.serviceDao.SellOrderService;

@Service
public class SellOrderServiceImpl implements SellOrderService{

	@Resource
	SellOrderMapper sellOrderMapper;
	
	@Override
	public List<SellerOrder> findSellerOrderList(String sellerId) {
		List<SellerOrder> orderList=new ArrayList<SellerOrder>();
		orderList=sellOrderMapper.findSellerOrderList(sellerId);
		return orderList;
	}

}
