/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:14:42
 * @version   V 1.0
 */
package com.vict5220.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmily.tcc.annotation.Tcc;
import com.vict5220.facade.RegistFacade;
import com.vict5220.feign.UserServer;
import com.vict5220.feign.WalletServer;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:14:42
 * @version  V 1.0
 */
@Service("registFacade")
public class RegistFacadeImpl implements RegistFacade {

	@Autowired
	private UserServer userServer;
	
	@Autowired
	private WalletServer walletServer;
	
	/** 
	 * <p>Title: regist</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @param walletName
	 * @param walletPwd
	 * @return
	 * @see com.vict5220.facade.RegisterFacade#regist(java.lang.String, java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Override
	@Tcc(confirmMethod = "registConfirm", cancelMethod = "registCancel")
	public String regist(String username, String password, String walletName, String walletPwd) {
		try {
			userServer.createUser(username, password);
			walletServer.createWallet(username, walletName, walletPwd);
		} catch (Exception e) {
			throw new RuntimeException("调用失败");
		}
		return "SUCCESS";
	}
	
	public void registConfirm(String username, String password, String walletName, String walletPwd){
		System.out.println("执行confirm");
	}
	
	public void registCancel(String username, String password, String walletName, String walletPwd){
		System.out.println("执行cancel");
	}

}
