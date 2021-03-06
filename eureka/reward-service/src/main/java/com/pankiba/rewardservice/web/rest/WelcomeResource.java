package com.pankiba.rewardservice.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WelcomeResource {

	@Autowired
	private Environment environment;

	@GetMapping(path = "/")
	public String welcomeMessage() {
		return "Hello World !! " + environment.getProperty("welcome.message");
	}

}
