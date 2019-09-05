package com.java.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Doctor {

	@Id@GeneratedValue
	int id;
	String name;
	@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.MERGE})
	Address address;
	long telephoneNumber;
}
