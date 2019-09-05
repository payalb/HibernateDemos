package com.java.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="address")
//corresponding to this class, i should have a table in db
//doctor table :drop and recreate.
public class Doctor {

	@Id
	int id;
	String name;
	@OneToMany (mappedBy= "doctor", cascade=CascadeType.PERSIST)
	List<Address> address;
	long telephoneNumber;
}
