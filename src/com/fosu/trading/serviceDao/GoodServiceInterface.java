package com.fosu.trading.serviceDao;

import java.util.List;

import com.fosu.trading.po.Good;

public interface GoodServiceInterface {

		public List<Good> selectGoodmessage(String typeId);
		public Good selectGoodbyid(String goodsId);//读取商品信息

}
