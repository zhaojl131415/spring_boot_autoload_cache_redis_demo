package com.cache.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cache.demo.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBootAutoloadCacheRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoloadCacheRedisDemoApplication.class, args);
	}
}
