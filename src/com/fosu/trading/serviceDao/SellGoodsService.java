package com.fosu.trading.serviceDao;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fosu.trading.po.Goods;

public interface SellGoodsService {
	public Goods findGoodsById(String goodsId)throws Exception;
	public List<Goods> findGoodsList(String sellerId) throws Exception;
	public void insertGoods(Goods goods) throws Exception;
	public void deleteGoods(String goodsId) throws Exception;
	public void updateGoodsStatus(String goodsId,String goodsStatus) throws Exception;
	public void updateGoods(Goods goods);

}
