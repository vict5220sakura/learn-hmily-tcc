/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:04:16
 * @version   V 1.0
 */
package com.vict5220.controller.api;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vict5220.facade.UserFacade;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:04:16
 * @version  V 1.0
 */
@RestController
public class UserController {
	@Autowired
	private UserFacade userFacade;
	
	@PostMapping("/create_user")
	@Transactional
	public void createUser(
			@RequestParam("username") String username, 
			@RequestParam("password") String password){
		userFacade.createUser(username, password);
	}
}
