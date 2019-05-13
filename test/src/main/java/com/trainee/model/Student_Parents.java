package com.trainee.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Student_Parents")
public class Student_Parents {

  @Id
  @GeneratedValue
  private int id;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Students student;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Parents parent;

}
