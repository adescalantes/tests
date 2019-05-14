package com.trainee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="family_members")
public class FamilyMembers {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="family_member_id")
	private int id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name= "family_id", referencedColumnName = "family_id")
	private Families family;
	
	@Column(name="parent_or_studen_member")
	private String parentOrStudent;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
	private Parents parent;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	private Students student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Families getFamily() {
		return family;
	}

	public void setFamily(Families family) {
		this.family = family;
	}

	public String getParentOrStudent() {
		return parentOrStudent;
	}

	public void setParentOrStudent(String parentOrStudent) {
		this.parentOrStudent = parentOrStudent;
	}

	public Parents getParent() {
		return parent;
	}

	public void setParent(Parents parent) {
		this.parent = parent;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}
}
