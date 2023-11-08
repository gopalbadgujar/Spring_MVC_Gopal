package com.springMVC.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springMVC.model.Student;
import com.springMVC.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService service;

	@RequestMapping(value = "/log")
	public String loginCredential(@RequestParam String user, @RequestParam String pass, Model m) {

		if (user.equals("user1") && pass.equals("pass1")) {
			System.out.println("Student Credentials : " + user + "    " + pass);

			List<Student> slist = service.getStudents();
			m.addAttribute("slist", slist);
			return "details";
		} else {
			m.addAttribute("msg", "You have entered wrong Credentials, Try again...");
			return "warning";
		}

	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String registerDetails(@ModelAttribute Student student, @RequestParam MultipartFile fileUp, Model m) {

		try {
			byte[] file = fileUp.getBytes();
			student.setFileUpload(file);
		} catch (Exception e) {
			System.out.println(e);
		}

		service.registerStudent(student);

		return "success";
	}

	@RequestMapping(value = "edit")
	public String editAction(@RequestParam int sid, Model m) {

		Student s = service.getSingleStudent(sid);
		m.addAttribute("stu", s);

		return "edit";
	}

	public String updateAction(@ModelAttribute Student s) {

		service.updateData(s);
		return "login";
	}

	@RequestMapping(value = "del")
	public String deleteAction(@RequestParam int sid, Model m) {

		service.delStudent(sid);

		return "login";
	}

}
