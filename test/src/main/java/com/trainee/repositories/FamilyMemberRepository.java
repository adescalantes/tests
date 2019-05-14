package com.trainee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.models.FamilyMember;

@Repository(value = "familyMemberRepo")
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer> {

}
