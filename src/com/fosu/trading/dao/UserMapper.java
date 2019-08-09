package com.fosu.trading.dao;

import org.apache.ibatis.annotations.Param;

import com.fosu.trading.po.UserTb;

public interface UserMapper {

	UserTb findByUsername(String userTel);
	
	void registerByUsernameAndPassword(@Param("userTel")String userTel,
          @Param("password")String password,@Param("userName")String userName,
          @Param("sex")String sex,@Param("userEmail")String userEmail,
          @Param("address")String address);

//	User checkuser(String userTel);
}
