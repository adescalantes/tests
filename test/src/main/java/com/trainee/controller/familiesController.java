package com.trainee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.model.Families;
import com.trainee.model.Parents;
import com.trainee.repository.IParentsRepository;

@RestController
public class familiesController {

  @Autowired
  @Qualifier(value = "parents")
  private IParentsRepository student;

  @GetMapping(value = "/students/{id}")
  public List<Families> getStudent(@PathVariable int id) {
    Optional<Parents> studentParents = student.findById(id);
    return studentParents.get().getFamily();
  }
}
