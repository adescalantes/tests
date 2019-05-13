package com.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "families")
public class Families {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  @Column(name = "family_id")
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Parents getParent() {
    return parent;
  }

  public void setParent(Parents parent) {
    this.parent = parent;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @OneToOne
  @NotNull
  @JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
  private Parents parent;

  @Column(name = "family_name")
  private String familyName;
}
