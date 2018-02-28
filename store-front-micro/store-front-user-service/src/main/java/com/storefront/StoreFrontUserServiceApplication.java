package com.storefront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableRedisHttpSession
public class StoreFrontUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreFrontUserServiceApplication.class, args);
	}

}