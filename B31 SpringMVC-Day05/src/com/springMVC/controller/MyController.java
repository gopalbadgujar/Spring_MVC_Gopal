package com.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.model.Employee;
import com.springMVC.service.EmployeeService;

@Controller
public class MyController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "log")
	public String getLogin(@RequestParam String user, @RequestParam String pass, Model m) {

		System.out.println("LOGIN DETAILS : " + user + "   " + pass);
		if (user.equals("admin") && pass.equals("admin@123")) {

			List<Employee> elist = service.getEmployee();
			m.addAttribute("elist", elist);
			return "openLogin";
		} else {
			return "warning";
		}
	}

	@RequestMapping(value = "reg")
	public String register(@ModelAttribute Employee e) {

		System.out.println(e);
		service.registerEmployee(e);
		return "success";
	}
	
	@RequestMapping(value = "del")
	public String delete(@RequestParam int eid) {
		
		service.delEmployee(eid);
		
		return "login";
	}
	

}
