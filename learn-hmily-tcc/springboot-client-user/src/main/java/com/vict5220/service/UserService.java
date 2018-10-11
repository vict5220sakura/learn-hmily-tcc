/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:16:45
 * @version   V 1.0
 */
package com.vict5220.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:16:45
 * @version  V 1.0
 */
public interface UserService {

	/**
	 * @author WangWei
	 * @Description 
	 * @method userRegister
	 * @param username
	 * @param password void
	 * @date 2018年9月29日 下午4:59:17
	 */
	void userRegist(String username, String password);

	/**
	 * @author WangWei
	 * @Description 
	 * @method createUserConfirm
	 * @param username
	 * @param password void
	 * @date 2018年10月11日 下午4:38:50
	 */
	void createUserConfirm(String username, String password);

	/**
	 * @author WangWei
	 * @Description 
	 * @method createUserCancel
	 * @param username
	 * @param password void
	 * @date 2018年10月11日 下午4:39:33
	 */
	void createUserCancel(String username, String password);
}
