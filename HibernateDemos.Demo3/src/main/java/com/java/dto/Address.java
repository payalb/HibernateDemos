package com.java.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;
//class Proxy etends Address{}: id
@Data
@Entity
@ToString
public class Address {

	@Id
	private int id;
	int hno; //getHno
	String city, state;
	long pincode;
	@ManyToOne
	Doctor doctor;
}
