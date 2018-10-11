/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:34:31
 * @version   V 1.0
 */
package com.vict5220.controller.api;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vict5220.facade.WalletFacade;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午3:34:31
 * @version  V 1.0
 */
@RestController
public class WalletController {
	
	@Autowired
	private WalletFacade walletFacade;
	
	@PostMapping("/create_wallet")
	public void createWallet(
			@RequestParam("username") String username, 
			@RequestParam("wallet_name") String walletName, 
			@RequestParam("password") String password){
		walletFacade.createWallet(username, walletName, password);
	}
}
