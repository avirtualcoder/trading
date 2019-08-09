package com.fosu.trading.serviceDao;

import java.util.List;

import com.fosu.trading.po.OrderTb;
import com.fosu.trading.pojo.SellerOrder;

public interface SellOrderService {
	public List<SellerOrder> findSellerOrderList(String sellerId);
}
