package com.java.dto;

import javax.persistence.Embeddable; //jpa -> Hibernate

import lombok.Data;

@Data
@Embeddable
public class Address {

	int hno; //getHno
	String city, state;
	long pincode;
	
}
