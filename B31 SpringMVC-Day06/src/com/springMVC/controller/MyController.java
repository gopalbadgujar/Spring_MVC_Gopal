package com.springMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.model.Student;
import com.springMVC.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService service;

	@RequestMapping(value = "/reg")
	public String register(@ModelAttribute Student student, Model m) {

		System.out.println("Student Data Controller : " + student);

		service.registerStudent(student);
		return "success";
	}

	@RequestMapping(value = "/log")
	public String register(@RequestParam String user, @RequestParam String pass, Model m) {

		System.out.println("Student Data Controller : " + user + "    " + pass);
		if (user.equals("admin") && pass.equals("admin@123")) {

			List<Student> slist = service.getStudents();
			m.addAttribute("slist", slist);
			return "details";
		} else {
			m.addAttribute("msg", "You have use wrong Credentials, Try again...");
			return "warning";
		}
	}

	@RequestMapping(value = "del")
	public String deleteData(@RequestParam int sid) {

		service.delStudent(sid);

		return "login";
	}

	@RequestMapping(value = "edit")
	public String editData(@RequestParam int sid, Model m) {

		Student s = service.getSingleStudent(sid);
		m.addAttribute("stu", s);
		return "edit";
	}

	@RequestMapping(value = "up")
	public String updateStuData(@ModelAttribute Student student) {

		System.out.println("UPdated data : " + student);

		service.updateData(student);
		return "login";
	}

}
