package com.spring.sms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.sms.model.Student;
import com.spring.sms.repo.Studnetrepo;

@SpringBootApplication
public class StudentMangeServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangeServiceApplication.class, args);
	}

	@Autowired
	private Studnetrepo studentrepo;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		studentrepo.save(student1);

		Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		studentrepo.save(student2);

		Student student3 = new Student("tony", "stark", "tony@gmail.com");
		studentrepo.save(student3);

	}

}
