package com.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.model.Families;
import com.trainee.repository.IFamiliesRepository;

@RestController
public class familiesController {

  @Autowired
  @Qualifier(value = "families")
  private IFamiliesRepository family;

  @GetMapping(value = "/students")
  public List<Families> getStudent() {
    return family.findAll();
  }

}
