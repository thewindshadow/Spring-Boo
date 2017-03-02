package com.battle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Battle19Application {

	public static void main(String[] args) {
		SpringApplication.run(Battle19Application.class, args);
	}
}
