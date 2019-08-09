package com.fosu.trading.handler;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.fosu.trading.po.UserTb;
import com.fosu.trading.serviceDao.UserService;



@Controller

//@SessionAttributes("user")

public class UserController {
	@Autowired
    private UserService userServivce;
    
    //正常访问login页面
    public String login(){
        return "login";
    }
    
    //表单提交过来的路径
    @RequestMapping("/login")
    public String checkLogin(HttpServletRequest request,HttpSession session,UserTb user,Model model){
        //调用service方法
        user = userServivce.logincheck(user.getUserTel(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            session.setAttribute("user",user);
            return "index";
        }
        else{
        	model.addAttribute("error","账号或密码错误");
        	return null;
        }
       
    }
    


    
    //正常采访问注册页面
    public String register(){
    	return "register";
    }
    
   //表单提交过来的路径
    @RequestMapping("/register")
    public String register(UserTb user,Model model){
    	System.out.println(user.getUserTel());
    	userServivce.register(user);
    	return "index";
    }
    
}