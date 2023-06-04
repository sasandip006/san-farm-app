package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("v1")
public class FarmingController {
	
	@GetMapping("/farm")
	public String greetonigMessage(@RequestParam("name")String user) {
		log.info("This Controller has been called and user is :"+user);

		return "This is first Ever Greeting Message from User: "+user;
	}

}
