package com.docomo.fraudwall.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;     
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp  {
//Holassss
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApp.class, args);
	}

}

