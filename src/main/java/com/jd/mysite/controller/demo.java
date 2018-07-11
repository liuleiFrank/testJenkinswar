package com.jd.mysite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

	@RequestMapping("/demo")
	public String getString() {
		return "hello world!";
	}
	
	
}
