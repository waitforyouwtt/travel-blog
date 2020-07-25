package com.yunlan.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserServerCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerCenterApplication.class, args);
	}

}
