/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:49:10
 * @version   V 1.0
 */
package com.vict5220.facade.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmily.tcc.annotation.Tcc;
import com.vict5220.facade.UserFacade;
import com.vict5220.service.UserService;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:49:10
 * @version  V 1.0
 */
@Service
public class UserFacadeImpl implements UserFacade {

	@Autowired
	private UserService userService;
	
	/** 
	 * <p>Title: createUser</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @param walletName
	 * @param walletPwd
	 * @return
	 * @see com.vict5220.facade.IUserFacade#createUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Override
	@Tcc(confirmMethod = "createUserConfirm", cancelMethod = "")
	@Transactional
	public void createUser(String username, String password) {
		userService.userRegist(username, password);
	}
	
	public void createUserConfirm(String username, String password){
		System.out.println("执行confirm");
		userService.createUserConfirm(username, password);
	}
	
	public void createUserCancel(String username, String password){
		System.out.println("执行cancel");
		userService.createUserCancel(username, password);
	}
}
