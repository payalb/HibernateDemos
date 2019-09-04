package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//class Proxy etends Address{}: id
@Data
@Entity
public class Address {

	@Id
	private int id;
	int hno; //getHno
	String city, state;
	long pincode;
	
}
