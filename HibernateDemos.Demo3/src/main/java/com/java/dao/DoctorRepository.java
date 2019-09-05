package com.java.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.fasterxml.classmate.GenericType;
import com.java.dto.Address;
import com.java.dto.Doctor;

public class DoctorRepository {
	SessionFactory sf = null;
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");
		sf = cfg.buildSessionFactory(); // change ur schema
	}

	public void save(Doctor d) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.persist(d);
		t.commit();
		s.close();

	}

	public void getAddress(int id) {
		Session s = sf.openSession();
	/*	List<Object[]> a = s.createQuery("from Address a, Doctor d where a.doctor.id= d.id and a.id=1").getResultList();
		
		for (Object[] arr : a) {
			for (Object o : arr) {
				System.out.print(o+" , ");
			}
			System.out.println("**");
		}*/
		Query<Address> q=s.createQuery("SELECT a FROM Address a INNER JOIN FETCH a.doctor d where a.id=1", Address.class);
		Address a= q.uniqueResult();
		System.out.println(a);
		s.close();
	}

	/*
	 * public List<Doctor> getDoctors(){ Session s =sf.openSession(); Doctor d=s.fin
	 * s.close(); return d; }
	 */
	public void getAddresses() {
		Session s = sf.openSession();
	//pagination
		Query q=s.createQuery("from address");
		q.setFirstResult(0);
		q.setMaxResults(20);
		List a= q.getResultList();
		System.out.println(a);
		s.close();
	}


	public void updateDoctor(Doctor d) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(d);
		t.commit();
		s.close();
	}

	public void removeDoctor(int id) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		/* s.get(Doctor.class, id) */
		Doctor d = new Doctor();
		d.setId(id);
		s.remove(d);
		t.commit();
		s.close();
	}
}
