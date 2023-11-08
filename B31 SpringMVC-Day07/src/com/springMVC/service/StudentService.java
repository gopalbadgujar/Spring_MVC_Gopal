package com.springMVC.service;

import java.util.List;

import com.springMVC.model.Student;

public interface StudentService {

	void registerStudent(Student s);
	
	List<Student> getStudents();

	Student getSingleStudent(int sid);
	
	void updateData(Student s);
	
	void delStudent(int sid);
}
