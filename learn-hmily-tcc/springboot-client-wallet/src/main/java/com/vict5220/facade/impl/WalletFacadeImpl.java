/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:49:52
 * @version   V 1.0
 */
package com.vict5220.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmily.tcc.annotation.Tcc;
import com.vict5220.facade.WalletFacade;
import com.vict5220.service.WalletService;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:49:52
 * @version  V 1.0
 */
@Service
public class WalletFacadeImpl implements WalletFacade {
	
	@Autowired
	private WalletService walletService;
	
	/** 
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * @param username
	 * @param walletName
	 * @param password
	 * @return
	 * @see com.vict5220.facade.WalletFacade#insert(java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Override
	@Tcc(confirmMethod = "createWalletConfirm", cancelMethod = "createWalletCancel")
	@Transactional
	public void createWallet(String username, String walletName, String password) {
		int i = 10 / 0 ;
		System.out.println(i);
		walletService.createWallet(username, walletName, password);
	}
	
	public void createWalletConfirm(String username, String walletName, String password){
		System.out.println("执行confirm");
		walletService.createWalletConfirm(username, walletName, password);
	}
	
	public void createWalletCancel(String username, String walletName, String password){
		System.out.println("执行cancel");
		walletService.createWalletCancel(username, walletName, password);
	}
}
