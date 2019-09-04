package com.java.client;

import java.util.Arrays;

import com.java.dao.DoctorRepository;
import com.java.dto.Address;
import com.java.dto.Doctor;

//Association: Address is a entity object
public class Client {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.setId(1);
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		Address address1= new Address();
		address1.setId(1);
		address1.setCity("meerut");
		address1.setHno(101);
		address1.setPincode(8787643);
		address1.setState("UP");
		address1.setDoctor(d);
		Address address2= new Address();
		address2.setId(2);
		address2.setCity("Delhi");
		address2.setHno(102);
		address2.setPincode(110101);
		address2.setState("Delhi");
		address2.setDoctor(d);
		d.setAddress(Arrays.asList(address1, address2));
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
