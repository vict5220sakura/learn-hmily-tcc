/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:31:47
 * @version   V 1.0
 */
package com.vict5220;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Description
 * @author WangWei
 * @date 2018年9月29日 下午3:31:47
 * @version V 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(UserApplication.class, args);
	}

}
