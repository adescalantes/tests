package com.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.model.Families;
import com.trainee.repository.IFamiliesRepository;


@RestController
public class FamiliesController {

  @Autowired
  @Qualifier(value = "families")
  private IFamiliesRepository family;

  
  @GetMapping(value = "/families")
  public List<Families> getStudent(Model model) {
    return family.findAll();
  }

  @PostMapping(value = "/families")
  public void insert(@RequestBody Families family) {
	  
    this.family.save(family);
  }
}
