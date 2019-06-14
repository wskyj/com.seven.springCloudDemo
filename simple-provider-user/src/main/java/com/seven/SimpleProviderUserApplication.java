package com.seven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages= {"com.seven.*"})
@MapperScan("com.seven.dao")
@EnableAsync
@EnableEurekaClient
@EnableAspectJAutoProxy(exposeProxy = true)
public class SimpleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProviderUserApplication.class, args);
	}

}
