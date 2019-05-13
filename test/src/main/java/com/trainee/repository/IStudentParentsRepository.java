package com.trainee.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.model.Student_Parents;

@Repository
@Qualifier(value = "StudentParents")
public interface IStudentParentsRepository extends JpaRepository<Student_Parents, Integer> {

}
