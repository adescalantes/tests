package com.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.model.Families;

@Repository(value = "families")
public interface IFamiliesRepository extends JpaRepository<Families, Integer> {

}
