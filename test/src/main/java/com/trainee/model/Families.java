package com.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "families")
public class Families {
  @GeneratedValue
  @Id
  @Column(name = "family_id")
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Parents getHeadOfFamilyParentId() {
    return headOfFamilyParentId;
  }

  public void setHeadOfFamilyParentId(Parents headOfFamilyParentId) {
    this.headOfFamilyParentId = headOfFamilyParentId;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Parents headOfFamilyParentId;

  @Column(name = "family_name")
  private String familyName;
}
