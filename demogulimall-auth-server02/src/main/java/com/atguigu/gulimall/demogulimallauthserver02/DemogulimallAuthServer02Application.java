package com.atguigu.nrpt.demonrptauthserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableDiscoveryClient
@SpringBootApplication
@EnableRedisHttpSession//整合redis存储session
@EnableFeignClients(basePackages = "com.atguigu.nrpt.demonrptauthserver02.feign")
public class DemonrptAuthServer02Application {

	public static void main(String[] args) {
		SpringApplication.run(DemonrptAuthServer02Application.class, args);
	}

}
