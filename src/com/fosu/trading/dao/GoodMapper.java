package com.fosu.trading.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fosu.trading.po.Good;

@Component
public interface GoodMapper {
		
		public List<Good> selectGoodmessage(String typeID);//读取商品分类信息
		public Good selectGoodbyid(String goodsId);//读取商品信息
//		public List<Good> selectGoodbbypage(Page page);//分页查询
		
}
