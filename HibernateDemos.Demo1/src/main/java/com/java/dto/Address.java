package com.java.dto;

import javax.persistence.Embeddable; //jpa -> Hibernate

import lombok.Data;
//class Proxy etends Address{}: id
@Data
@Embeddable
public class Address {

	int hno; //getHno
	String city, state;
	long pincode;
	
}
