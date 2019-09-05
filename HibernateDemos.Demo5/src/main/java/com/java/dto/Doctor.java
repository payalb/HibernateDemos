package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Doctor {

	@Id
	int id;
	String name;
	String address;
	long telephoneNumber;

}
