package com.java.dto;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
//	@Embedded
	@ElementCollection(fetch=FetchType.EAGER)//lazy loading
	List<Address> address;
	long telephoneNumber;
}
