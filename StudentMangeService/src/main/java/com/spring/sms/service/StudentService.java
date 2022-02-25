package com.spring.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.sms.model.Student;


public interface StudentService {
	
	 List<Student> getAllStudentList();
	 Student saveStudent(Student student);
	 Student getStudentByid(Long id);
	 Student updateStudent(Student student);
	 void deleteStudentByid(Long id);
	

}
