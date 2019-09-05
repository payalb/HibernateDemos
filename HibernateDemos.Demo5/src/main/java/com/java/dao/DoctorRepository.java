package com.java.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.dto.Doctor;

public class DoctorRepository {
	SessionFactory sf = null;
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");
		sf = cfg.buildSessionFactory(); // change ur schema
	}

	public void flush() {
		Doctor d = new Doctor();
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		d.setAddress("10r, delhi troad");
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.persist(d);// it will cache the object in the session
		d.setAddress("10");
		// no update/merge
		s.flush();//flush: it will fire a query to db. But u r not doing commit, rollback would be done
		s.refresh(d);
		System.out.println(d.getId());
		d.setAddress("20");
		t.commit();//auto-flush
		s.close();
		// dirty checking
		//object states
	}
	
	public void merge() {
		Doctor d = new Doctor();
		d.setId(1);
		d.setName("Kanika");
		d.setTelephoneNumber(675675465l);
		d.setAddress("10r, delhi troad");
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(d);
		s.flush();
		s.detach(d);
		d.setAddress("10");
		t.commit();
		s.close();
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		Doctor d1=s1.load(Doctor.class, 1);//d1 in persitent state
		System.out.println(d1.getAddress());//fire a query to db to get data
		//delete an object: s1.delete(s1.load(Doctor.class, 1));
		d1.setAddress("20");
		d1.setName("abc");
		s1.update(d);//update will fail
		
		t1.commit();
		System.out.println(s1.get(Doctor.class, 1));
		s.close();
		
	}

	
}
