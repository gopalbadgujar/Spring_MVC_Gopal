package com.springMVC.dao;

import java.util.List;

import com.springMVC.model.Student;

public interface StudentDao {
	
	void addStudent(Student s);
	
	List<Student> getAllStudent();
	
	Student getStudent(int sid);
	
	void updateStudent(Student s);

	void deleteStudent(int sid);

}
