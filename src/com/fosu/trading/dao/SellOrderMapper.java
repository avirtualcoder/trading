package com.fosu.trading.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fosu.trading.po.OrderTb;
import com.fosu.trading.pojo.SellerOrder;

@Component
public interface SellOrderMapper {
	public List<SellerOrder> findSellerOrderList(String sellerId);
}
