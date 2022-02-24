package com.spring.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sms.model.Student;

public interface Studnetrepo extends JpaRepository<Student,Long > {

}
