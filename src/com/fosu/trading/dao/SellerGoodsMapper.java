package com.fosu.trading.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fosu.trading.po.Goods;

@Component
public interface SellerGoodsMapper {
	public Goods findGoodsById(String goodsId);
	
	public List<Goods> findGoodsList(String sellerId);

	public void insertGoods(Goods goods);
	
	public void deleteGoods(String goodsId);
	
	public void updateGoodsStatus(String goodsId,String goodsStatus);

	public void updateGoods(Goods goods);

}
