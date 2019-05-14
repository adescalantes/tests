package com.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.model.Students;
import com.trainee.repository.IStudentsRepository;

@RestController
public class StudentsController {
	  @Autowired
	  @Qualifier(value = "students")
	  private IStudentsRepository student;

	  @GetMapping(value = "/students")
	  public List<Students> getStudents() {
	    return student.findAll();
	  }

}
