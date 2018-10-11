/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:12:25
 * @version   V 1.0
 */
package com.vict5220.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hmily.tcc.annotation.Tcc;
import com.vict5220.configuration.MyConfiguration;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:12:25
 * @version  V 1.0
 */
@FeignClient(value = "wallet-server", configuration = MyConfiguration.class)
public interface WalletServer {
	
	@PostMapping("create_wallet")
	@Tcc
	public void createWallet(
			@RequestParam("username") String username, 
			@RequestParam("wallet_name") String walletName, 
			@RequestParam("password") String password);
}
