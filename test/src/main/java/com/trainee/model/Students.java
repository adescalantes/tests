package com.trainee.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

  @GeneratedValue
  @Id
  @Column(name = "student_id")
  private int id;

  @Column(name = "gender")
  private String gender;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "other_student_details")
  private String otherStudentDetails;

  @OneToMany(mappedBy = "student")
  private List<Student_Parents> student;

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

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getOtherStudentDetails() {
    return otherStudentDetails;
  }

  public void setOtherStudentDetails(String otherStudentDetails) {
    this.otherStudentDetails = otherStudentDetails;
  }

  public List<Student_Parents> getStudent() {
    return student;
  }

  public void setStudent(List<Student_Parents> student) {
    this.student = student;
  }
}
