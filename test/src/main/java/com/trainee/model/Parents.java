package com.trainee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
public class Parents {
  @GeneratedValue
  @Id
  @Column(name = "parent_id")
  private int id;

  @Column(name = "gender")
  private String gender;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "other_parent_details")
  private String otherParentDetails;

  @OneToMany(mappedBy = "headOfFamilyParentId")
  private List<Families> family;

  @OneToMany(mappedBy = "parent")
  private List<Student_Parents> parent;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getOtherParentDetails() {
    return otherParentDetails;
  }

  public void setOtherParentDetails(String otherParentDetails) {
    this.otherParentDetails = otherParentDetails;
  }

  public List<Student_Parents> getParent() {
    return parent;
  }

  public void setParent(List<Student_Parents> parent) {
    this.parent = parent;
  }

  public List<Families> getFamily() {
    return family;
  }

  public void setFamily(List<Families> family) {
    this.family = family;
  }
}
