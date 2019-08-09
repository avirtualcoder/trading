package com.fosu.trading.serviceDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fosu.trading.dao.GoodMapper;
import com.fosu.trading.po.Good;
import com.fosu.trading.serviceDao.GoodServiceInterface;



@Service
public class GoodServiceImpl implements GoodServiceInterface {

	@Autowired
	private GoodMapper goodMapper;

	@Override
	public List<Good> selectGoodmessage(String typeId) {
		// TODO Auto-generated method stub
		return goodMapper.selectGoodmessage(typeId);
	}

	@Override
	public Good selectGoodbyid(String goodsId) {
		// TODO Auto-generated method stub
		return goodMapper.selectGoodbyid(goodsId);
	}

}
