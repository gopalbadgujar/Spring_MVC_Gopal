package com.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMVC.model.Student;
import com.springMVC.service.StudentService;

@Controller
public class MyController {
	
	
	@Autowired
	private StudentService service;
	
 
	@RequestMapping(value = "reg")
	public String register(@ModelAttribute Student s, Model m) {
		
		System.out.println("Student Data Controller :- "+s);
        service.registerStudent(s);
		
		if(s.getSid()>0) {
		
//			System.out.println("Student ID            :- "+s.getSid());
//			System.out.println("Student Name          :- "+s.getSname());
//			System.out.println("Student Address       :- "+s.getSaddress());
//			System.out.println("Student Date Of Birth :- "+s.getSbirth());
			System.out.println("Student All Data      :- "+s);

			m.addAttribute("msg", "Succefully register in database");
			m.addAttribute("id", s.getSid());
			m.addAttribute("name", s.getSname());
			m.addAttribute("address", s.getSaddress());
			m.addAttribute("birth", s.getSbirth());

			return "success";
		}
		else {
			m.addAttribute("msg", "Can't be Register Data in Database");
			return "warning";
		}
	}
	
}
