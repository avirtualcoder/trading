package com.fosu.trading.handler;


import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.Appeal;
import com.fosu.trading.po.Goods;
import com.fosu.trading.po.UserTb;
import com.fosu.trading.pojo.Calculate;
import com.fosu.trading.pojo.Page;
import com.fosu.trading.pojo.orderAppeal;
import com.fosu.trading.serviceDao.managerService;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
public class managerActionHandler {
	
    @Resource
    managerService managerservice;
    @Resource
    UserTb manageruser,user,seller,buyer;
    @Resource
    Page pg;
    @Resource
    Calculate cal;
    @Resource
    Goods goods;
    @Resource
    orderAppeal ordaeal;
    Appeal appeal;
    //管理员登录
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(UserTb user,HttpSession httpSession) throws Exception{
		
		ModelAndView mav = new ModelAndView();
		String userTel = user.getUserTel();
		String password = user.getPassword();
		
		manageruser = managerservice.getUserByTel(userTel);
		int role = manageruser.getRole().intValue(); //转换成int对象方便转换
		String managername = manageruser.getUserName();
		if((manageruser.getUserTel().equals(userTel)) && (manageruser.getPassword().equals(password)) && (role!=1)){
			if(role==2){
				//权限为2，跳到超级管理员界面
				mav.setViewName("admin/rootAdmin/admin");
			}else if(role==4){
				
				//权限为4，跳到商品审核管理员界面
				mav.setViewName("admin/shopAdmin/checkgoodadmin");
			}else if(role==5)
			{	
				//权限为5，跳到申诉审核管理员界面
				mav.setViewName("admin/appealAdmin/apealAdmin");
			}
			httpSession.setAttribute("userId", userTel);
		}
		else{
			//密码错误返回登录界面
			mav.setViewName("admin/rootAdmin/adminLogin");
			mav.addObject("error", "账号或密码错误");
		}
		
		mav.addObject("adminname",managername);
		return mav;
	}
	
//	//用户详情页
//	@RequestMapping("/getUserInfo")
//	public ModelAndView getUserInfo(HttpSession httpSession) throws Exception{
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/admin/userInfo");
//		String userTel = httpSession.getAttribute("userId").toString();
//		manageruser = managerservice.getUserByTel(userTel);
//		System.out.println(manageruser);
//		mav.addObject("user", manageruser);
//		return mav;
//	}
//	
	//输出普通用户
	@RequestMapping("/userlist")
	public ModelAndView showuser() throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/rootAdmin/userList");
		List<UserTb> ulist;
		pg.setCurrentPage(1);
		pg.setTotalUsers(test("user_tb",1,"role"));
		pg.setRole(1);
		ulist = managerservice.getUserByPage(pg);
		System.out.println(ulist.get(0).getUserImg());
		mav.addObject("ulist", ulist);
		mav.addObject("page", pg);
		return mav;
	}
	
	
	/*输出超级管理员列表
	@RequestMapping("/rootuserlist")
	public ModelAndView rootlist()throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/rootAdmin/userList");
		List<UserTb> ulist;
		pg.setCurrentPage(1);
		pg.setTotalUsers(test("user_tb",2));
		ulist = managerservice.getUserByPage(pg);
		mav.addObject("ulist", ulist);
		mav.addObject("page", pg);
		return mav;
	}*/
	
	    //输出商品审核管理员列表
		@RequestMapping("/checkgoodsuserlist")
		public ModelAndView checkgoodslist() throws Exception{
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/rootAdmin/userList");
			List<UserTb> ulist;
			pg.setCurrentPage(1);
			pg.setTotalUsers(test("user_tb",3,"role"));
			pg.setRole(3);
			ulist = managerservice.getUserByPage(pg);
			mav.addObject("ulist", ulist);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		//输出申诉审核管理员列表
		@RequestMapping("/checkshensuuserlist")
		public ModelAndView checkshensulist() throws Exception{
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/rootAdmin/userList");
			List<UserTb> ulist;
			pg.setCurrentPage(1);
			pg.setTotalUsers(test("user_tb",5,"role"));
			pg.setRole(5);
			ulist = managerservice.getUserByPage(pg);
			mav.addObject("ulist", ulist);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		
		@RequestMapping("/searchUserByAssign")
		public void searchUserByAssign(HttpServletRequest request, HttpServletResponse response) throws Exception{
			String userid = request.getParameter("userid");
			user=managerservice.getUserByAssign(userid);
			 
			String ulist = JSONArray.fromObject(user).toString();
			System.out.println(user.getUserImg());
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(ulist);
		}
		
		
		//更新用户信息
		@RequestMapping("/updateUserInfo")
		public ModelAndView updateUserInfo(UserTb u) throws Exception{
			  ModelAndView mav = new ModelAndView();
			  mav.setViewName("admin/rootAdmin/userList");
			  String sex = new String(u.getSex().getBytes("iso8859-1"),"utf-8");
			  u.setSex(sex);
			  managerservice.updateUserInfo(u);
			  mav.addObject("updatestatus", "修改成功");
			  return mav;	  
		}
		
		
		//用户分页查询
		@RequestMapping("/serachBypage")
		public void serachBypage(Integer currentPage,HttpServletResponse response) throws Exception{
			int num = test("user_tb",1,"role");
			pg.setTotalUsers(num);
			pg.setCurrentPage(currentPage);
			List<UserTb> lt = managerservice.getUserByPage(pg);
			JSONArray page = JSONArray.fromObject(pg);
			Map<String, Object> mapList = new HashMap<String, Object>();
			mapList.put("page", page);
			mapList.put("ulist", lt);
			String map = JSONObject.fromObject(mapList).toString();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(map);
		}
		
		//计算表中的实体个数
		public int test(String tablename,int role,String columnName) throws Exception{
			cal.setRole(role);
			cal.setTablename(tablename);
			cal.setColumnName(columnName);
			int num = managerservice.calculatecount(cal);
			return num;
		}
		
		
		//根据前端传回来的电话号码删除用户
		@RequestMapping("/deleteuser")
		public void deleteuser(String userTel){
			try {
				managerservice.deleteUser(userTel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		//输出未审核商品列表
		@RequestMapping("/serachgoodslist")
		public ModelAndView serachgoodslist() throws Exception{
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/shopAdmin/goodsList");
			List<Goods> glist;
			pg.setCurrentPage(1);
			pg.setTotalUsers(test("goods",0,"AUDIT_RESULT"));
			pg.setRole(0);
			glist = managerservice.getGoodsByPage(pg);
			mav.addObject("glist", glist);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		@RequestMapping("/updategoods")
		public void updategoods(int goodsid) throws Exception{
			BigDecimal id = new BigDecimal(goodsid);
			Date date = new Date();

			/*long date = System.currentTimeMillis();*/
			goods.setGoodsId(id);
			goods.setPublishUp(date);
			goods.setAuditResult("1");
			managerservice.updateGoodsStatus(goods);
		}
		
		//输出审核通过商品列表
		@RequestMapping("/publishgoodslist")
		public ModelAndView publishgoodslist() throws Exception{
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/shopAdmin/publishgoodslist");
			List<Goods> glist;
			pg.setCurrentPage(1);
			pg.setTotalUsers(test("goods",1,"AUDIT_RESULT"));
			pg.setRole(1);
			glist = managerservice.getGoodsByPage(pg);
			mav.addObject("glist", glist);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		//输出审核未通过商品列表
		@RequestMapping("/impublishgoodslist")
		public ModelAndView impublishgoodslist() throws Exception{
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/shopAdmin/impublishgoods");
			List<Goods> glist;
			pg.setCurrentPage(1);
			pg.setTotalUsers(test("goods",2,"AUDIT_RESULT"));
			pg.setRole(2); //设置状态为未通过
			glist = managerservice.getGoodsByPage(pg);
			mav.addObject("glist", glist);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		//根据前端传来的id查询指定goods
		@RequestMapping("/searchGoodsByID")
		public void searchGoodsByID(int goodsId,HttpServletResponse response) throws Exception{
			List<Goods> goods = managerservice.getGoodsByAssign(goodsId);
			String glist = JSONArray.fromObject(goods).toString();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(glist);
		}
		
		//根据前端传来的值设定允许上架或者下架
		@RequestMapping("/refuseGoodsPublish")
		public void refuseGoodsPublish(HttpServletRequest request) throws Exception{
			request.setCharacterEncoding("utf-8");
			int id = Integer.valueOf(request.getParameter("goodsId"));
			String auditResult = request.getParameter("aResult");
			BigDecimal goodsid = new BigDecimal(id);
			String reason = request.getParameter("reason");
			goods.setGoodsId(goodsid);
			if(reason != null){
				goods.setDownReason(reason);
			}
			goods.setAuditResult(auditResult);
			
			Date date = new Date();
			/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");*/
			goods.setPublishDown(date);
			managerservice.updateGoodsStatus(goods);
			
		}
		
		
		
		//商品分页查询
		@RequestMapping("/serachGoodsBypage")
		public void serachGoodsBypage(Integer currentPage,int role,HttpServletResponse response) throws Exception{
			int num = test("goods",role,"AUDIT_RESULT");
			pg.setTotalUsers(num);
			pg.setCurrentPage(currentPage);
			List<Goods> glist = managerservice.getGoodsByPage(pg);
			JSONArray page = JSONArray.fromObject(pg);
			Map<String, Object> mapList = new HashMap<String, Object>();
			mapList.put("page", page);
			mapList.put("glist", glist);
			String map = JSONObject.fromObject(mapList).toString();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(map);
		}
		
		//前端传来Goods对象更新数据
		@RequestMapping("/updategoodsInfoByGoods")
		public void updategoodsInfo(Goods g) throws Exception{
		
			managerservice.updateGoodsStatus(goods);
			/*System.out.println(g.getGoodPrice());*/
		}
		
		
		//以下为申诉管理员handler
		@RequestMapping("/getUntreatedApeal")
		public ModelAndView getUntreatedApeal() throws Exception{
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/appealAdmin/appealList");
			pg.setRole(0);
			pg.setTotalUsers(test("appeal",0,"APPEAL_STATUS"));
			List<Appeal> appealList = managerservice.getAppealByPage(pg);
			mav.addObject("apealList",appealList);
			mav.addObject("page", pg);
			return mav;
		}
		
		@RequestMapping("/gettreatedApeal")
		public ModelAndView gettreatedApeal() throws Exception{
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/appealAdmin/treatedApeal");
			pg.setCurrentPage(1);
			pg.setRole(1);
			pg.setTotalUsers(test("appeal",1,"APPEAL_STATUS"));
			List<Appeal> appealList = managerservice.getAppealByPage(pg);
			mav.addObject("apealList",appealList);
			mav.addObject("page", pg);
			return mav;
		}
		
		@RequestMapping("/gettreatedUnApeal")
		public ModelAndView gettreatedUnApeal() throws Exception{
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/appealAdmin/gettreatedUnApeal");
			pg.setCurrentPage(1);
			pg.setRole(2);
			pg.setTotalUsers(test("appeal",2,"APPEAL_STATUS"));
			List<Appeal> appealList = managerservice.getAppealByPage(pg);
			mav.addObject("apealList",appealList);
			mav.addObject("page", pg);
			return mav;
		}
		
		
		//申诉分页
		@RequestMapping("/serachAppealBypage")
		public void serachAppealBypage(Integer currentPage,int role,HttpServletResponse response) throws Exception{
			pg.setTotalUsers(test("appeal",role,"APPEAL_STATUS"));
			pg.setCurrentPage(currentPage);
			List<Appeal> aList = managerservice.getAppealByPage(pg);
			JSONArray page = JSONArray.fromObject(pg);
			Map<String, Object> mapList = new HashMap<String, Object>();
			mapList.put("page", page);
			mapList.put("aList", aList);
			String map = JSONObject.fromObject(mapList).toString();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(map);
		}
		
		@RequestMapping("/getOrderAppeal")
		public void getOrderAppeal(int apealId,HttpServletResponse response) throws Exception{
			ordaeal = managerservice.getOrderAppeal(apealId);
			response.setContentType("text/html;charset=utf-8");
			String orderAppeal = JSONObject.fromObject(ordaeal).toString();
			response.getWriter().write(orderAppeal);
		}
		
		
		@RequestMapping("/updateAppeal")
		public void updateAppeal(HttpServletRequest request) throws Exception{
			int appealId = Integer.valueOf(request.getParameter("appealId"));
			String buyerId =request.getParameter("buyerId");
			int credit = Integer.valueOf(request.getParameter("credit"));
			int role = Integer.valueOf(request.getParameter("role"));
			String orderId = request.getParameter("orderId");
			String appealReason = request.getParameter("appealReason");
			String sellerId = request.getParameter("sellerId");
			ordaeal.setAppealId(appealId);
			ordaeal.setAppealReason(appealReason);
			ordaeal.setBuyerId(buyerId);
			ordaeal.setOrderId(orderId);
			ordaeal.setCredit(credit);
			ordaeal.setSellerId(sellerId);
			ordaeal.setRole(role);
			managerservice.updateAppeal(ordaeal);
			
		}
		
		
		
		@RequestMapping("/appealInfo")
		public ModelAndView appealInfo(int apealId,HttpServletRequest request) throws Exception{
			System.out.println(request.getServletContext().getRealPath("/image"));;
			ModelAndView mav = new ModelAndView();
			mav.setViewName("admin/appealAdmin/appealInfo");
			ordaeal = managerservice.getOrderAppeal(apealId);
			List<Goods> goods = managerservice.getGoodsByAssign(ordaeal.getGoodsId());
			buyer = managerservice.getUserById(ordaeal.getBuyerId());
			seller = managerservice.getUserById(ordaeal.getSellerId());
			appeal = managerservice.getAAppeal(ordaeal.getAppealId());
			mav.addObject("ordaeal",ordaeal );
			mav.addObject("goods",goods.get(0) );
			mav.addObject("buyer",buyer );
			mav.addObject("seller",seller );
			appeal = managerservice.getAAppeal(ordaeal.getAppealId());
			mav.addObject("appeal",appeal );
			return mav;
		}
}
