package com.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.model.Students;

@Repository(value = "students")
public interface IStudentsRepository extends JpaRepository<Students, Integer> {

}
