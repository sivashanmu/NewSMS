package com.spring.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
		model.addAttribute("students", studentService.getAllStudentList());
		return "students";

	}

	@GetMapping("/students/new")
	public String createStudent(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "createstudent";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {

		studentService.saveStudent(student);
		return "redirect:/students";

	}

	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudentByid(id));
		return "editstudent";

	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

		Student oldstudetails = studentService.getStudentByid(id);

		oldstudetails.setId(id);
		oldstudetails.setFirstname(student.getFirstname());
		oldstudetails.setLastname(student.getLastname());
		oldstudetails.setEmail(student.getEmail());

		studentService.updateStudent(oldstudetails);

		return "redirect:/students";

	}

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {

		studentService.deleteStudentByid(id);
		return "redirect:/students";
	}
}
