package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Address {

	@Id@GeneratedValue
	int id;
	int hno; 
	String city, state;
	long pincode;
	
}
