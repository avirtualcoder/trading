package com.fosu.trading.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.Good;
import com.fosu.trading.serviceDaoImpl.GoodServiceImpl;



@Controller
@RequestMapping("/GoodController")
public class GoodController {

	@Autowired
	private GoodServiceImpl service;
	
	@RequestMapping("/initDetails")
	public ModelAndView selectGoodmessage(String typeId) {
		List<Good> gList=new ArrayList<Good>();
		gList = service.selectGoodmessage(typeId);
		ModelAndView andView = new ModelAndView();
		andView.setViewName("products");
		andView.addObject("gList",gList);
		System.out.println(gList);
		return andView;
	}
	
	@RequestMapping("/initproducts")
	public ModelAndView selectGoodById(String goodsId){
		Good good = service.selectGoodbyid(goodsId);
		ModelAndView andView = new ModelAndView();
//		List<Type> list = typeService.selectTypeById(new Type());
//		//根据id查询到的good
		andView.addObject("good",good);
		andView.addObject("goodstype",good);
		//System.out.println(good);
		//所有的种类信息
//		andView.addObject("list",list);
//		//跳转
		andView.setViewName("details");
		return andView;
	}
}
