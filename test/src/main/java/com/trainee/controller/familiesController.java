package com.trainee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.repository.IStudentsRepository;

@RestController
public class familiesController {

  @Autowired
  @Qualifier(value = "students")
  private IStudentsRepository student;

}
