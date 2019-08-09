package com.fosu.trading.serviceDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fosu.trading.dao.UserMapper;
import com.fosu.trading.po.UserTb;
import com.fosu.trading.serviceDao.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	   private UserMapper usermapper;
	
	@Override
	public UserTb logincheck(String userTel,String password){
		UserTb user=usermapper.findByUsername(userTel);
		if(user!=null && user.getPassword().equals(password)){
			return user;
		}
		return null;
	}


	@Override
	public void register(UserTb user) {
		usermapper.registerByUsernameAndPassword(user.getUserTel(), user.getPassword(), 
				user.getUserName(), user.getSex(), user.getUserEmail(), 
				user.getAddress());

	}


//	@Override
//	public User checkuser(String userTel) {
//		User user=usermapper.checkuser(userTel);
//		if(user!=null && user.getUserTel().equals(userTel)){
//			return null;
//		}
//		return user;
//	}


}
