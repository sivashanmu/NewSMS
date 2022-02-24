package com.spring.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.sms.model.Student;


public interface StudentService {
	
	 List<Student> getAllStudentList();
	

}
