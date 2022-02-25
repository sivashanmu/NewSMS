package com.spring.sms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.sms.model.Student;
import com.spring.sms.repo.Studnetrepo;
import com.spring.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private Studnetrepo studentrepo;

	public StudentServiceImpl(Studnetrepo studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}

	public List<Student> getAllStudentList() {

		System.out.println("enter into StudentServiceImpl.getAllStudentList");

		List<Student> list = studentrepo.findAll();
		System.out.println("student list are---->" + list);
		// return studentrepo.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {

		System.out.println("enter into StudentServiceImpl.saveStudent");
		return studentrepo.save(student);
	}

	@Override
	public Student getStudentByid(Long id) {

		return studentrepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return studentrepo.save(student);
	}

	@Override
	public void deleteStudentByid(Long id) {

		studentrepo.deleteById(id);

	}

}
