package com.expert.github.githubprogramming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}

}
