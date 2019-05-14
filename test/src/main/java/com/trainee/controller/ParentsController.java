package com.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.trainee.model.Parents;
import com.trainee.model.Students;
import com.trainee.repository.IParentsRepository;

@RestController
public class ParentsController {

  @Autowired
  @Qualifier(value = "parents")
  private IParentsRepository parent;


  
  @GetMapping(value = "/parents")
  public List<Parents> getParents() {
    return parent.findAll();
  }

  @PostMapping(value = "/parents")
  public void create(@RequestBody Parents parents) {
    parent.save(parents);
  }
  
  @PutMapping(value="/parents")
  public void update(@RequestBody Parents parents) {
	  parent.save(parents);
  }
}
