package com.java.client;

import com.java.dao.DoctorRepository;
import com.java.dto.Address;
import com.java.dto.Doctor;

//Association: Cascade demo
public class Client {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.setId(1);
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		Address address1= new Address();
		address1.setCity("meerut");
		address1.setHno(101);
		address1.setPincode(8787643);
		address1.setState("UP");
		d.setAddress(address1);
		DoctorRepository rep= new DoctorRepository();
		rep.save(d);
		
	}

}
