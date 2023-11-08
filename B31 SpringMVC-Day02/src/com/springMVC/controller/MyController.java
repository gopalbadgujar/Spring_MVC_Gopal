package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.model.Student;

@Controller
public class MyController {

	@RequestMapping(value = "/log")
	public String getLogin(@RequestParam("user") String username, @RequestParam String pass) {

		System.out.println("UserName : " + username);
		System.out.println("Password : " + pass);
		System.out.println("Hello I'm here");
		return "success";
	}

	@RequestMapping(value = "/reg")
	public String registerDetails(@ModelAttribute Student s) {
		System.out.println(s);
 
		return "success";
	}
}
