package com.java.client;

import com.java.dao.DoctorRepository;
import com.java.dto.Address;
import com.java.dto.Doctor;

//Association: Address is a value object
public class Client {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.setId(1);
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		Address address= new Address();
		address.setCity("meerut");
		address.setHno(101);
		address.setPincode(8787643);
		address.setState("UP");
		d.setAddress(address);
		DoctorRepository rep= new DoctorRepository();
		rep.save(d);
			System.out.println(rep.getDoctor(1));
			d.setName("Rohit");
			rep.updateDoctor(d);
			System.out.println(rep.getDoctor(1));
		/*	rep.removeDoctor(1);
			System.out.println(rep.getDoctor(1));*/
	}

}
