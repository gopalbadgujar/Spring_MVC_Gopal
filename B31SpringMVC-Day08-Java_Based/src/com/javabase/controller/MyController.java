package com.javabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	@RequestMapping(value = "/")
	public String defaultPageCalled() {
		System.out.println("Hello");
		
		return "home";
	}

}
