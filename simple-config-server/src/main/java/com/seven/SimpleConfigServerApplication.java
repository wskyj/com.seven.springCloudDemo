package com.seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SimpleConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleConfigServerApplication.class, args);
	}

}