package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 用于做一些框架配置
 * @author admin
 * https://www.cnblogs.com/ityouknow/p/5662753.html
 */
@SpringBootApplication
@EnableScheduling     //启动类开启定时
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
