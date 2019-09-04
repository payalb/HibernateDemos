package com.java.client;

import com.java.dao.DoctorRepository;
import com.java.dto.Doctor;

public class Client {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.setId(1);
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		d.setAddress("1r, delhi road");
		DoctorRepository rep= new DoctorRepository();
		rep.save(d);
			System.out.println(rep.getDoctor(1));
			d.setName("Rohit");
			rep.updateDoctor(d);
			System.out.println(rep.getDoctor(1));
			rep.removeDoctor(1);
			System.out.println(rep.getDoctor(1));
	}

}
