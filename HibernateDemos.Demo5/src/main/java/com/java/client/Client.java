package com.java.client;

import com.java.dao.DoctorRepository;

//Association: Cascade demo
public class Client {

	public static void main(String[] args) {
	
		DoctorRepository rep= new DoctorRepository();
		rep.merge();
		
	}

}
