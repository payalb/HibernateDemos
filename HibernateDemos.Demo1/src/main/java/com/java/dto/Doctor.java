package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
//corresponding to this class, i should have a table in db
//doctor table :drop and recreate.
public class Doctor {

	@Id
	//primary key
	int id;
	String name;
	String address;
	long telephoneNumber;
}
