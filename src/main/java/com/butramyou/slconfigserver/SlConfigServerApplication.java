package com.butramyou.slconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SlConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlConfigServerApplication.class, args);
	}

}
