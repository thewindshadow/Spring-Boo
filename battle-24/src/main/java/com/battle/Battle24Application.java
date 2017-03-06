package com.battle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Battle24Application {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(Battle24Application.class, args);
	}

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String loggerLevel(){
		logger.debug("LoggerLevel ： debug");
		logger.info("LoggerLevel ： info");
		logger.error("LoggerLevel ： error");
		return "";
	}


}
