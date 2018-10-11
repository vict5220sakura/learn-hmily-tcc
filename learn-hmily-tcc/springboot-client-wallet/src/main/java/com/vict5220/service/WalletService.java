/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:17:45
 * @version   V 1.0
 */
package com.vict5220.service;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:17:45
 * @version  V 1.0
 */
public interface WalletService {
	void createWallet(String username, String walletName, String password);

	/**
	 * @author WangWei
	 * @Description 
	 * @method createWalletConfirm
	 * @param username
	 * @param walletName
	 * @param password void
	 * @date 2018年10月11日 下午4:42:33
	 */
	void createWalletConfirm(String username, String walletName, String password);

	/**
	 * @author WangWei
	 * @Description 
	 * @method createWalletCancel
	 * @param username
	 * @param walletName
	 * @param password void
	 * @date 2018年10月11日 下午4:42:56
	 */
	void createWalletCancel(String username, String walletName, String password);
}
