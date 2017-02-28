package com.springboottest.starter.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("hi")
	public String sayHi(){
		return "hi";
	}
}
