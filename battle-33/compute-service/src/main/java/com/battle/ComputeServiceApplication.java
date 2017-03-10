package com.battle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ComputeServiceApplication.class, args);
		new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);

	}
}
