/**
 * @Description 
 * @author  WangWei
 * @Date    2018年10月11日  下午3:21:01
 * @version   V 1.0
 */
package com.vict5220;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @author WangWei
 * @date 2018年10月11日 下午3:21:01
 * @version V 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
