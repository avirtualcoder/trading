package com.fosu.trading.serviceDao;

import com.fosu.trading.po.UserTb;

public interface UserService {

	UserTb logincheck(String USER_TEL,String PASSWORD);
	
	void register(UserTb user);
	
//	User checkuser(String USER_TEL);
}
