package com.fosu.trading.handler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.crypto.Mac;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.Delivery;
import com.fosu.trading.po.Sender;
import com.fosu.trading.pojo.MyTask;
import com.fosu.trading.pojo.Task;
import com.fosu.trading.serviceDao.SellGoodsService;
import com.fosu.trading.serviceDao.SenderService;

@Controller
public class SenderAction {
	
	@Resource
	SenderService senderService;
	
	@Resource
	SellGoodsService sellGoodsService;
	
	@RequestMapping("/sender")
	public String senderRegister(){
		String userId="1";//session获取当前用户id
		Sender sender=new Sender();
		try {
			sender=senderService.findSenderByUseId(userId);
			System.out.println("当前用户为"+sender+"进入个人中心");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (sender==null){
			System.out.print("跑腿未开通，跳转注册开通页面");
			return "/seller/registered";
		}
		else {
			System.out.println("redirect:/queryTask.action?senderId="+sender.getSenderId());
			return "redirect:/queryTask.action?senderId="+sender.getSenderId();
		}
	}
	
	@RequestMapping("/senderRegister")
	public ModelAndView senderRegister(Sender sender){
		ModelAndView mav=new ModelAndView("/seller/SenderCenter");
		String userId="1";//session获取
		sender.setUserId(userId);
		System.out.println(sender.getSenderName()+" "+sender.getSenderTel()+" "+sender.getSenderIdentity()+" "+sender.getUserId());
		try {
			senderService.insertSender(sender);
			System.out.print("注册成功");
		} catch (Exception e) {
			System.out.print("注册失败");
		}
		return mav;
	}
	
	@RequestMapping("/queryMyTask")
	public ModelAndView myTask(String senderId){
		senderId="20";
		ModelAndView mav=new ModelAndView("/seller/SenderCenter");
		List<MyTask> myTaskList=new ArrayList<MyTask>();
		myTaskList=senderService.findMyTask(senderId);
		System.out.println("我的任务记录共有："+myTaskList.size());
		mav.addObject("myTaskList",myTaskList);
		return mav;
	}
	
	@RequestMapping("/takeTaskList")
	public ModelAndView queryTaskList(){
		List<Task> taskList=new ArrayList<Task>();
		taskList=senderService.findTaskList();
		ModelAndView mav=new ModelAndView("/seller/TaskSqure");
		mav.addObject("taskList", taskList);
		System.out.println("任务广场任务数："+taskList.size());
		return mav;
	}
	
	@RequestMapping("/addDelivery")
	public ModelAndView addDelivery(String orderId){
		String senderId="20";
		senderService.addDelivery(senderId,orderId);
		ModelAndView mav=new ModelAndView("/seller/TaskSqure");
		return mav;
	}
}
