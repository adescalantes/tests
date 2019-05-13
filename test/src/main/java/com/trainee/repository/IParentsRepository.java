package com.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.model.Parents;

@Repository(value = "parents")
public interface IParentsRepository extends JpaRepository<Parents, Integer> {

}
