package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping(value = "log")
	public String getLogin(@RequestParam("user") String u, @RequestParam String pass) {

		System.out.println("Hello getLogin() :-  " + u + "    " + pass +"\n");
		return "lsuccess";
	}

	@RequestMapping(value = "reg")
	public String register(@ModelAttribute Student s, Model model) {

		if (s.getSid() > 0) {
			System.out.println(s+"\n");
			System.out.println("Student ID:- " + s.getSid());
			System.out.println("Student Name:- " + s.getSname());
			System.out.println("Student Address:- " + s.getSaddress());
			System.out.println("Student Date Of Birth:- " + s.getDateOfBirth());

			model.addAttribute("msg", "Succefully register in database");
			
			model.addAttribute("id", s.getSid());
			model.addAttribute("name", s.getSname());
			model.addAttribute("address", s.getSaddress());
			model.addAttribute("birth", s.getDateOfBirth());

			return "success"; // view
		} else {
			return "warning";
		}

	}
}
