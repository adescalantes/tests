package com.trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.trainee.models.Family;
import com.trainee.repositories.FamilyRepository;

@Service(value = "familyServ")
public class FamilyService {

  @Autowired
  @Qualifier("familyRepo")
  private FamilyRepository family;

  public List<Family> getAllFamily() {
    return family.findAll();
  }

  public boolean postFamily(Family family) {
    try {
      this.family.save(family);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean deleteFamily(int id) {
    try {
      Family family = this.family.findById(id);
      this.family.delete(family);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
