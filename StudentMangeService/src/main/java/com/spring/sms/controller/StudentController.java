package com.spring.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.sms.model.Student;
import com.spring.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public String getStudentList(Model model) {

		System.out.println("StudentController called");

		List<Student> obj = studentService.getAllStudentList();
		System.out.println(obj.toString());
		model.addAttribute("students", studentService.getAllStudentList());
		return "students";

	}

}
