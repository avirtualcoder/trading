package com.fosu.trading.serviceDaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fosu.trading.dao.SellerGoodsMapper;
import com.fosu.trading.po.Goods;
import com.fosu.trading.serviceDao.SellGoodsService;

@Service
public class SellerGoodsServiceImpl implements SellGoodsService{
	
	@Resource
	SellerGoodsMapper sellerGoodsMapper;
	
	@Override
	public List<Goods> findGoodsList(String sellerId) throws Exception {
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList =sellerGoodsMapper.findGoodsList(sellerId);
		return goodsList;
	}
	
	@Override
	public void insertGoods(Goods goods) throws Exception {
		sellerGoodsMapper.insertGoods(goods);
	}

	@Override
	public void deleteGoods(String goodsId) throws Exception {
		try {
			sellerGoodsMapper.deleteGoods(goodsId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateGoodsStatus(String goodsId,String goodsStatus) throws Exception {
		sellerGoodsMapper.updateGoodsStatus(goodsId,goodsStatus);
		
	}

	@Override
	public Goods findGoodsById(String goodsId) throws Exception {
		Goods goods=new Goods();
		goods=sellerGoodsMapper.findGoodsById(goodsId);
		return goods;
	}

	@Override
	public void updateGoods(Goods goods) {
		sellerGoodsMapper.updateGoods(goods);
		
	}
	
	
	
	
}
