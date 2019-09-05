package com.java.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="doctor_info")
public class Doctor {

	@Id
	@Column(name="doctor_id")
	int id;
	String name;
	String address;
	long telephoneNumber;

}
