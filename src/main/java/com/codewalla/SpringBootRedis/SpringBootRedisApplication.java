package com.codewalla.SpringBootRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.codewalla.SpringBootRedis.config.RedisConfig;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SpringBootRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApplication.class, args);
	}

}
