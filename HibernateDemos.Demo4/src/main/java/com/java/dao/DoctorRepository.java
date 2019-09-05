package com.java.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.dto.Doctor;

public class DoctorRepository {
	SessionFactory sf=null;
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate-cfg.xml");
		sf=cfg.buildSessionFactory(); //change ur schema
	}
	public void save(Doctor d) {
			
			Session s =sf.openSession();
			Transaction t=s.beginTransaction();
			//s.save(d.getAddress());
			s.persist(d);
			t.commit();
			s.close();
			
	}
	
	public Doctor getDoctor(int id) {
		Session s =sf.openSession();
		Doctor d=s.get(Doctor.class, id);//get & load: address is a proxy
		
		s.close();
		return d;
	}
	
	/*public List<Doctor> getDoctors(){
		Session s =sf.openSession();
		Doctor d=s.fin
		s.close();
		return d;
	}*/
	
	public void updateDoctor(Doctor d) {
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(d);
		t.commit();
		s.close();
	}
	
	public void removeDoctor(int id) {
		Session s =sf.openSession();
		Transaction t=s.beginTransaction();
		/*s.get(Doctor.class, id)*/
		Doctor d= new Doctor();
		d.setId(id);
		s.remove(d);
		t.commit();
		s.close();
	}
}
