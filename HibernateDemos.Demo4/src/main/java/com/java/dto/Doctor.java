package com.java.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import lombok.Data;

@Data
@Entity
public class Doctor {

	@Id
	int id;
	String name;
	@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.MERGE})
	Address address;
	long telephoneNumber;
}
